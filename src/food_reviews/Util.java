package food_reviews;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;

public class Util {
	public static final String TRANSLATED_REVIEWS = "translatedReviews";
	public static ArrayList<String> columnAsStringList(int columnNum, ResultSet rs){
		ArrayList<String> result = new ArrayList<String>();
		try {
			while(rs.next()) {
				result.add(rs.getString(columnNum));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public static ArrayList<Integer> columnAsIntegerList(int columnNum, ResultSet rs){
		ArrayList<Integer> result = new ArrayList<Integer>();
		try {
			while(rs.next()) {
				result.add(new Integer(rs.getInt(columnNum)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public static String EsacpeChars(String string) {
		String result;
		result = string.replace("\\", "\\\\");
		result = result.replaceAll("'", "\\\\'");
		return result;
    }

}
