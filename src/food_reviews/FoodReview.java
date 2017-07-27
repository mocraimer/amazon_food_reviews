package food_reviews;


public class FoodReview implements Comparable<FoodReview> {
	private int id;
	private String summary;
	private String text;

	public FoodReview(int id, String summary, String text ){
		this.id = id;
		this.summary = summary;
		this.text = text;
	}
	public int getId(){
		return id;
	}
	public String getSummary(){
		return summary;
	}
	public String getText(){
		return text;
	}
	@Override
	//larger to smaller
	public int compareTo(FoodReview other) {
		if(other instanceof FoodReview){
			FoodReview otherReview =(FoodReview) other; 
			if((this.text + this.summary).length() == (otherReview.text + otherReview.summary).length())
				return 0;
			if((this.text + this.summary).length() > (otherReview.text + otherReview.summary).length())
				return -1;
			if((this.text + this.summary).length() < (otherReview.text + otherReview.summary).length())
				return 1;
		}
		return -1;
	}
	public String toString(){
		return this.summary + " " + this.text;
	}
	public String getPartialRest(){
		String summ = Util.EsacpeChars(this.getSummary());
		String text = Util.EsacpeChars(this.getText());
		String result = "{input_lang: ‘en’, output_lang: ‘UpperCase’, text: '"+summ+"'}"
				+ "\n{input_lang: ‘en’, output_lang: ‘UpperCase’, text: '"+text+"'}\n";
		return result;
	}
}
