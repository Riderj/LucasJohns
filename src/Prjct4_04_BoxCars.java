public class Prjct4_04_BoxCars {
	public static void main(String[] args){
		final int rolls = 1000;
		int matches = 0;
		Prjct4_04_PairOfDice dice = new Prjct4_04_PairOfDice();
		for(int i = 1;i<=rolls;i++){
			dice.rollDice();
			if(dice.equals(6)){
				matches++;
			}
		}
		System.out.println("The number of times both dies rolled a six are: "+matches+" times.");
	}
}
