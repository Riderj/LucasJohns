
public class Prjct4_06 {
	public static void main(String[] args){
		Prjct4_06_Card card = new Prjct4_06_Card();
		for(int i = 1; i<=20; i ++){
			card.dealCard();
			if(card.getValue() <= 10) {
				System.out.println(i+". "+card.getSuit(card)+" | Value: "+card.getValue());
			}else if(card.getValue() >=11) {
				switch(card.getValue()) {
				case 11:
					System.out.println(i+". "+card.getSuit(card)+" | Value: Jack");
					break;
				case 12:
					System.out.println(i+". "+card.getSuit(card)+" | Value: King");
					break;
				case 13:
					System.out.println(i+". "+card.getSuit(card)+" | Value: Queen");
					break;
				}
			}
		}
	}
}
