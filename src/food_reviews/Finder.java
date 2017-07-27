package food_reviews;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentHashMap;

public class Finder {
	private static final int THREADNUM = 1;
	private ConcurrentLinkedQueue<Integer> idToHandleQueue = new ConcurrentLinkedQueue<Integer>();
	public ConcurrentHashMap<String, AtomicInteger> wordOccurrences = new ConcurrentHashMap<String, AtomicInteger>();  
	private Connection connection = ConnectionPool.getConnection();
	private boolean translate;
	public Finder(boolean translateMode){
		try {
			this.translate = translateMode;
			PreparedStatement idsToHanldleQuery = connection.prepareStatement("select id from reviews GROUP BY summary, text");
			ResultSet idsToHanldleresult = idsToHanldleQuery.executeQuery();
			while(idsToHanldleresult.next()) {
				idToHandleQueue.add(idsToHanldleresult.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<String> getMostActiveUsers(int num){
		ArrayList<String> result = new ArrayList<String>();
		try{
			PreparedStatement profileNamesPostCountQuery = connection.prepareStatement("select count(ProfileName),UserId from reviews Group By ProfileName ORDER BY count(ProfileName) DESC LIMIT "+ num);
			ResultSet profileNamesPostCountResult = profileNamesPostCountQuery.executeQuery();
			for(int i = 0; i < num && profileNamesPostCountResult.next();i++){
				result.add(profileNamesPostCountResult.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<String> getMostActiveFoods(int num){
		ArrayList<String> result = new ArrayList<String>();
		try {
			PreparedStatement profileNamesPostCountQuery = connection.prepareStatement("select count(ProductId),ProductId from reviews Group By ProductId ORDER BY count(ProfileName) DESC LIMIT "+ num);
			ResultSet profileNamesPostCountResult = profileNamesPostCountQuery.executeQuery();
			result = Util.columnAsStringList(2,profileNamesPostCountResult);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<String> getMostUsedWords(int num){
		if(!idToHandleQueue.isEmpty()){
			try {
				ExecutorService executor = Executors.newFixedThreadPool(THREADNUM, Executors.defaultThreadFactory());
				for(int i = 0; i < THREADNUM; i++){
					executor.submit((new Translator(this)));
				}
				synchronized (this) {
			         while (!this.idToHandleQueue.isEmpty())
			             this.wait();
			     }
				executor.shutdown();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ArrayList<String> result = new ArrayList<String>();
		List<Entry<String, AtomicInteger>> wordOccurrencessortedByValue = sortByValue(wordOccurrences);
		for(int i = 0; i < num && i < wordOccurrencessortedByValue.size(); i++){
			Entry<String,AtomicInteger> e = wordOccurrencessortedByValue.get(i); 
			result.add(e.getKey() + " - " + e.getValue().get());
		}
		return result;
	}

	public Integer getIdToHandle(){
		return idToHandleQueue.poll();
	}
	public void addWordOccurrences(String word,int count){
		if(wordOccurrences.containsKey(word)) {
		}
		else {
			wordOccurrences.put(word, new AtomicInteger(count));
		}

	}
	public static <K> List<Entry<K, AtomicInteger>> sortByValue(Map<K, AtomicInteger> map) {
		List<Entry<K, AtomicInteger>> entries = new ArrayList<Entry<K, AtomicInteger>>(map.entrySet());
		Collections.sort(entries, new ByValue<K>());
		return entries;
	}

	private static class ByValue<K> implements Comparator<Entry<K, AtomicInteger>> {
		public int compare(Entry<K, AtomicInteger> o1, Entry<K, AtomicInteger> o2) {
			Integer o1Val = new Integer(o1.getValue().get());
			Integer o2Val = new Integer(o2.getValue().get());
			return o2Val.compareTo(o1Val);
		}
	}
	public void notifyTranslationDone() {
		this.notifyAll();
	}

	public boolean translateEnabled() {
		return translate;
	}
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
