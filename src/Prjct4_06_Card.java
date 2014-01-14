import java.util.Random;


public class Prjct4_06_Card {
	private int faceValue;
	private final int maxFaceValue = 4;
	int value;
	
	public Prjct4_06_Card(){
		faceValue = 1;
	}
	
	public void dealCard(){
		Random random = new Random();
		int card = random.nextInt((maxFaceValue));
		faceValue = card;
		value = random.nextInt(13)+1;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getSuit(Prjct4_06_Card card){
		String suit = "";
		switch(this.faceValue){
		case 0:
			suit = "Clubs";
			break;
		case 1:
			suit = "Spades";
			break;
		case 2:
			suit = "Hearts";
			break;
		case 3:
			suit = "Diamonds";
			break;
		}
		return suit;
	}
	
}
