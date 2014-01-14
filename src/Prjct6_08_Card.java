
public class Prjct6_08_Card {
	int cardNumber, suitID, value;
	/**
	 * @param id The id that identifies which suit it is (1-4, total of 4 suits)
	 * @param sNumber the card number (1-13, total of 13 cards including jack, king, queen)
	 * 
	 */
	public Prjct6_08_Card(int id, int sNumber){
		cardNumber = sNumber;
		suitID = id;
		value = sNumber+id;
	}
	
	/**
	 * This will return the card number, what's typically in the top left and bottom right.
	 * @return
	 */
	public int getCardNumber() {
		return cardNumber;
	}
	
	/**
	 * This will return the suitID, the suit ID is a value 1-4, this determines which suit it is(clubs, spade, diamond, hearts)
	 * @return
	 */
	public int getSuitID() {
		return suitID;
	}
	
	/**
	 * This method will return the value of the object, the value is used when sorting so that we can properly sort by value. 
	 * The value of a card is suitID+cardNumber (E.g: 1+13 = 14)
	 * @return
	 */
	public int getCardValue() {
		return value;
	}
	
	public String toString() {
		switch(suitID) {
		case 1:
			String suit = "Spades";
			if(getCardNumber() < 14 && getCardNumber() > 0) {
				if(getCardNumber() != 1 && getCardNumber() < 11) {
					return getCardNumber() + " of "+suit;
				}else if(getCardNumber() == 1) {
					return "Ace of "+suit;
				}else if(getCardNumber() > 10) {
					switch(getCardNumber()) {
					case 11:
						return "Jack of "+suit;
					case 12:
						return "Queen of "+suit;
					case 13:
						return "King of "+suit;
					}
				}
			}else {
				return "Invalid parmeter (arg 2 of "+this.getClass().getName()+" constructor) [Must be less than 14 but greater than 0]";
			}
		case 2:
			suit = "Clubs";
			if(getCardNumber() < 14 && getCardNumber() > 0) {
				if(getCardNumber() != 1 && getCardNumber() < 11) {
					return getCardNumber() + " of "+suit;
				}else if(getCardNumber() == 1) {
					return "Ace of "+suit;
				}else if(getCardNumber() > 10) {
					switch(getCardNumber()) {
					case 11:
						return "Jack of "+suit;
					case 12:
						return "Queen of "+suit;
					case 13:
						return "King of "+suit;
					}
				}
			}else {
				return "Invalid parmeter (arg 2 of "+this.getClass().getName()+" constructor) [Must be less than 14 but greater than 0]";
			}
		case 3:
			suit = "Hearts";
			if(getCardNumber() < 14 && getCardNumber() > 0) {
				if(getCardNumber() != 1 && getCardNumber() < 11) {
					return getCardNumber() + " of "+suit;
				}else if(getCardNumber() == 1) {
					return "Ace of "+suit;
				}else if(getCardNumber() > 10) {
					switch(getCardNumber()) {
					case 11:
						return "Jack of "+suit;
					case 12:
						return "Queen of "+suit;
					case 13:
						return "King of "+suit;
					}
				}
			}else {
				return "Invalid parmeter (arg 2 of "+this.getClass().getName()+" constructor) [Must be less than 14 but greater than 0]";
			}
		case 4:
			suit = "Diamonds";
			if(getCardNumber() < 14 && getCardNumber() > 0) {
				if(getCardNumber() != 1 && getCardNumber() < 11) {
					return getCardNumber() + " of "+suit;
				}else if(getCardNumber() == 1) {
					return "Ace of "+suit;
				}else if(getCardNumber() > 10) {
					switch(getCardNumber()) {
					case 11:
						return "Jack of "+suit;
					case 12:
						return "Queen of "+suit;
					case 13:
						return "King of "+suit;
					}
				}
			}else {
				return "Invalid parmeter (arg 2 of "+this.getClass().getName()+" constructor) [Must be less than 14 but greater than 0]";
			}
		}
		return "Invalid parmeter (arg 1 of "+this.getClass().getName()+" constructor) [Must be less than 5 but greater than 0]";
	}
}
