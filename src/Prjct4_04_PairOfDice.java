public class Prjct4_04_PairOfDice {
	Prjct4_04_Die die = new Prjct4_04_Die();
	Prjct4_04_Die die2 = new Prjct4_04_Die();
	
	public void rollDice(){
		die.roll();
		die2.roll();
	}
	public boolean equals(int num){
		if(die.getFaceValue() == num && die2.getFaceValue() == num){
			return true;
		}
		return false;
	}
}
