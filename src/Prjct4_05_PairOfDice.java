public class Prjct4_05_PairOfDice {
	Prjct4_05_Die die = new Prjct4_05_Die();
	Prjct4_05_Die die2 = new Prjct4_05_Die();
	
	public void rollDice(){
		die.roll();
		die2.roll();
	}
	public int rollDie(){
		return die.roll();
	}
	public boolean equals(int num){
		if(die.getFaceValue() == num && die2.getFaceValue() == num){
			return true;
		}
		return false;
	}
}
