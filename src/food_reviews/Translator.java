package food_reviews;

import java.io.BufferedReader;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;


import org.json.*;
public class Translator implements Runnable {
	private static final String TEXT = "text";
	private Connection connection = ConnectionPool.getConnection();
	private Finder finder;
	private PriorityQueue<FoodReview> reviewsWaitingTranslation = new PriorityQueue<FoodReview>();
	private int amountOfCharsInReviewsWaitingTranslation = 0;
	private final int maxCharsInRequest = 1000;
	public Translator(Finder finder){
		this.finder = finder;
	}

	@Override
	public void run() {
		Integer id;
		ArrayList<FoodReview> translatedReviews = new ArrayList<FoodReview>();
		while( (id = finder.getIdToHandle()) != null){
			//System.out.println("Thread:" + Thread.currentThread().getName() + ", Started ID:" + id);
			FoodReview reviewToHandle = idToFoodReview(id);
			countWordsInReview(reviewToHandle);
			//System.out.println("Thread:" + Thread.currentThread().getName() + ", finished Counting Words ID:" + id);
			if(reviewToHandle.toString().length() >= maxCharsInRequest){
				translatedReviews.add(getTranslationLongReview(reviewToHandle));
			}
			else{
				amountOfCharsInReviewsWaitingTranslation += reviewToHandle.toString().length();
				reviewsWaitingTranslation.add(reviewToHandle);
			}
				//System.out.println("Thread:" + Thread.currentThread().getName() + ", added to translate queue:" + id);
			if(amountOfCharsInReviewsWaitingTranslation >= maxCharsInRequest && finder.translateEnabled()){
				//System.out.println("Thread:" + Thread.currentThread().getName() + "started translating");
				ArrayList<FoodReview> awaitingRestCall = new ArrayList<FoodReview>();
				FoodReview toTranslate;
				int charsInCurrentRound=0;
				String idsDone = "";
				while((toTranslate = reviewsWaitingTranslation.peek()) != null){
					if(charsInCurrentRound + toTranslate.toString().length() <= maxCharsInRequest){
						reviewsWaitingTranslation.remove();
						charsInCurrentRound += toTranslate.toString().length();
						awaitingRestCall.add(toTranslate);
						idsDone += toTranslate.getId() +",";
					}
					else{
						break;
					}

				//	System.out.println("Thread:" + Thread.currentThread().getName() + ", added to rest queue:" + id);
				}
				System.out.println("Thread:" + Thread.currentThread().getName() + ", charsInCurrentRound:" + charsInCurrentRound);
				amountOfCharsInReviewsWaitingTranslation -= charsInCurrentRound;
				translatedReviews.addAll(getTranslations(awaitingRestCall));
				System.out.println("Thread:" + Thread.currentThread().getName() + ", Finished IDs:" + idsDone);
			}
			//System.out.println("chars waiting to be translated: "+amountOfCharsInReviewsWaitingTranslation);
		}
		synchronized (finder) {
			finder.notifyTranslationDone();
		}
	}
	private FoodReview getTranslationLongReview(FoodReview reviewToHandle) {
		//split the review up into chunks of 1000 then do the rest call and return translated review
		int summaryParts = 0;
		int textParts = 0;
		boolean summaryWithFirstTextPart = false;
		reviewToHandle.getSummary();
		return null;
	}

	public ArrayList<FoodReview> getTranslations(ArrayList<FoodReview> awaitingRestCall) {
		ArrayList<FoodReview> result = new ArrayList<FoodReview>();
		String jsonStringRestCall = "";
		for(FoodReview fr : awaitingRestCall){
			jsonStringRestCall += fr.getPartialRest();
		}
		List<JSONObject> restResponse = getRestResponse(jsonStringRestCall);
		for(int i = 0; i < awaitingRestCall.size() ; i++){
			if(restResponse.size() > 2*i){
				try {
					result.add(new FoodReview(awaitingRestCall.get(i).getId(), restResponse.get(2*i).getString(TEXT), restResponse.get(2*i+1).getString(TEXT)));
					//System.out.println("Id: "+awaitingRestCall.get(i).getId()+ "\nTranslated Summary: "+ restResponse.get(2*i).getString(TEXT) + "\nTranslated Text: "+restResponse.get(2*i+1).getString(TEXT) +"\n");
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	private List<JSONObject> getRestResponse(String jsonStringRestCall) {
		ArrayList<JSONObject> result = new ArrayList<JSONObject>();
		StringReader reader = new StringReader(jsonStringRestCall);
		BufferedReader br = new BufferedReader(reader);
		String summary = "";
		String text = "";
		JSONObject summaryJSON = new JSONObject();
		JSONObject textJSON = new JSONObject();
		try {
			while((summary = br.readLine()) != null){
				text = br.readLine();
				summaryJSON =  new JSONObject(summary);
				textJSON =  new JSONObject(text);
				//System.out.println("responseSumm: "+'{'+ TEXT + ": '" + Util.EsacpeChars(summaryJSON.getString(TEXT).toUpperCase()) + "'}");
				summaryJSON = new JSONObject('{'+ TEXT + ": '" + Util.EsacpeChars(summaryJSON.getString(TEXT).toUpperCase()) + "'}");
				//System.out.println("responseText: " + '{'+ TEXT + ": '" + Util.EsacpeChars(textJSON.getString(TEXT).toUpperCase()) + "'}");
				textJSON = new JSONObject('{'+ TEXT + ": '" + Util.EsacpeChars(textJSON.getString(TEXT).toUpperCase()) + "'}");
				result.add(summaryJSON);
				result.add(textJSON);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("summary: "+ summary);
			System.out.println("text: "+ text);
			e.printStackTrace();
		}
		return result;
	}

	public FoodReview idToFoodReview(int id){
		try {
			PreparedStatement idQuery = connection.prepareStatement("select Summary,Text from reviews where id=?");
			idQuery.setInt(1, id);
			ResultSet idResult = idQuery.executeQuery();
			return new FoodReview(id, idResult.getString(1), idResult.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void countWordsInReview(FoodReview foodReview){
		List<String> wordsToCount = Arrays.asList((foodReview.toString()).split("\\W+"));
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		for(String word : wordsToCount){
			Integer countOld;
			if((countOld = wordMap.get(word)) != null)
				wordMap.put(word, countOld+1);
			else
				wordMap.put(word, new Integer(1));
		}
		for(String word : wordMap.keySet()){
			finder.addWordOccurrences(word, wordMap.get(word).intValue());
		}
	}

}