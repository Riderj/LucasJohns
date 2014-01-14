import java.util.Random;


public class Prjct6_08_DeckOfCards {
	private Prjct6_08_Card[] cards = new Prjct6_08_Card[52];

	
	//We will setup the deck of cards so that we can display/manipulate them later. 
	//I used the cardPos variable to be able to store the cards in their respective positions in the table
	//if this was not used, it would only store to index 13
	public Prjct6_08_DeckOfCards() {
		int cardPos = 0;
		for (int suit = 0; suit < 4; suit++) {
			for(int cardNum = 0; cardNum < (cards.length/4); cardNum++) {
				cards[cardPos] = new Prjct6_08_Card(suit+1,cardNum+1);
				cardPos++;
			}
		}
	}
	
	public void displayDeck() {
		for(int i = 0; i < cards.length;i++) {
			System.out.println(cards[i]);
		}
	}
	public Prjct6_08_DeckOfCards shuffleDeck() {
		Prjct6_08_Card[] deck = cards;
		Prjct6_08_Card temp;
		Random random = new Random();
		int randomPos, times = 0;
		for (int shuffles = 0; shuffles <= random.nextInt(4)+1; shuffles++) {
			for (int index = 0; index < deck.length; index++) {
				randomPos = random.nextInt(deck.length);
				temp = deck[index];
				deck[index] = deck[randomPos];
				deck[randomPos] = temp;
				
			}
			times++;
		}
		System.out.println("The deck has been shuffled " + times + " times" );
		return this;
	}
}
