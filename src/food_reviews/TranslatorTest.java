package food_reviews;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TranslatorTest {
	Finder finder = new Finder(true);
	Translator translator = new Translator(finder);
	
	@Test
	public void testIdToFoodReview() {
		FoodReview foodReview = new FoodReview(9, "Yay Barley", "Right now I'm mostly just sprouting this so my cats can eat the grass. They love it. I rotate it around with Wheatgrass and Rye too");
		Assert.assertEquals(foodReview.getText(), translator.idToFoodReview(9).getText());
		Assert.assertEquals(foodReview.getSummary(), translator.idToFoodReview(9).getSummary());
	}
	
	@Test
	public void testCountWordsInReview() {
		FoodReview foodReview = new FoodReview(9, "Yaa, bla2", "bla1 bla3 bla2 bla1. bla3 bla1, bla3");
		translator.countWordsInReview(foodReview);
		Assert.assertEquals(1,finder.wordOccurrences.get("Yaa").get());
		Assert.assertEquals(2,finder.wordOccurrences.get("bla2").get());
		Assert.assertEquals(3,finder.wordOccurrences.get("bla3").get());
		Assert.assertEquals(3,finder.wordOccurrences.get("bla1").get());
		System.out.println(finder.getMostUsedWords(3));
	}
	@Test
	public void testgetTranslations() {
		FoodReview foodReview1 = new FoodReview(9, "Yaa, bla1", "bla1 bla1 bla1 bla1. bla1 bla1, bla1");
		FoodReview foodReview2 = new FoodReview(7, "Yaa, bla2", "bla2 bla2 bla2 bla2. bla2 bla2, bla2");
		FoodReview foodReview3 = new FoodReview(6, "Yaa, bla3", "bla3 bla3 bla3 bla3. bla3 bla3, bla3");
		ArrayList<FoodReview> toTranslate = new ArrayList<FoodReview>();
		toTranslate.add(foodReview1);
		toTranslate.add(foodReview2);
		toTranslate.add(foodReview3);
		translator.getTranslations(toTranslate);
	}
	

}
