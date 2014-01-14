import java.util.Random;
import java.util.Scanner;


/*
 * We are working on making it so when the round score + total is greater than 0, someone wins.
 */
public class Prjct4_05_Player {
	private String name;
	private int roundScore, totalScore;
	private boolean isComputer, isTurn;
	public static int round = 0;
	private int rollResult1, rollResult2;
	private final int CHANCE = 9;
	public boolean win = false;
	
	public Prjct4_05_Player(String userName) {
		name = userName;
		isComputer = false;
		isTurn = true;
	}

	public Prjct4_05_Player(String userName, boolean iscomputer) {
		if(iscomputer == false) {
			name = userName;
			isComputer = iscomputer;
			isTurn = true;
		}else {
			name = "Computer";
			isComputer = iscomputer;
			isTurn = false;
		}
	}

	public void roll() {
		Prjct4_05_PairOfDice die1 = new Prjct4_05_PairOfDice();
		Prjct4_05_PairOfDice die2 = new Prjct4_05_PairOfDice();
		String choice = "";
		Scanner scan = new Scanner(System.in);
		if(isComputer == false) {
			System.out.println("\n"+name+ ", it's your turn. Would you like to roll, or pass? (r/p)");
			choice = scan.next();
		}
		while(choice.equalsIgnoreCase("r")) {
			if(totalScore+roundScore <=100) {
				if(isComputer == false) {
						rollResult1 = die1.rollDie();
						rollResult2 = die2.rollDie();
						if(rollResult1 == 1 && rollResult2 == 1) { //We check to see if at least one die is a 1 because it's a rule of the game, if one die = 1 then the player loses all points for the round.
							totalScore = 0;
							roundScore = 0;
							System.out.println("You have rolled snake eyes (two 1's), you've lost all your points.");
							break;
						}else if(rollResult1 == 1 || rollResult2 == 1) { // Rule that if they get snake eyes, they lose all points.
							roundScore = 0;
							System.out.println("You have rolled a 1, you've lost all points for that round.");
							break; // This break ends the users turn
						}else {
							roundScore += (rollResult1+rollResult2);
						}
						System.out.println("You rolled a ("+rollResult1+") and a ("+rollResult2+")");
						System.out.println("Would you like to roll again, and risk it? (r/p)");
						choice = scan.next();
						if(choice.equalsIgnoreCase("t")){
							setTotalScore(99);
							choice = "r";
						}
				}else{ // If it's the computers turn... (set through the constructor, so it's a new object more the less)
		
					System.out.println("\n\n\n\nIt's the computers turn!\n");
					rollResult1 = die1.rollDie(); // ***********  The dice keep returning weird values, it does not add up correctly.
					rollResult2 = die2.rollDie();
					Random random = new Random();
					int passChance = random.nextInt(CHANCE);
					while(roundScore <= 20 && passChance != 0) {
						if(rollResult1 == 1 || rollResult2 == 1) { //We check to see if at least one die is a 1 because it's a rule of the game, if one die = 1 then the player loses all points for the round.
							roundScore = 0;
							break;
						}else if(rollResult1 == 1 && rollResult2 == 1) { // Rule that if they get snake eyes, they lose all points.
							totalScore = 0;
							roundScore = 0;
							break;
						}else {
							roundScore += (rollResult1+rollResult2);
						}

						if(totalScore+roundScore >100) {
							break;
						}
						passChance = random.nextInt(CHANCE);
					}
				}
			}else {
				win = true;
				break;
			}
		}
		totalScore += roundScore;
		System.out.println();
		System.out.println(this.getName() +" gained "+roundScore+" points that round making your total score: "+totalScore+" points");
		roundScore = 0;
	}
	
	private String getName() {
		return name;
	}

	public int getTotalScore() {
		return totalScore;
	}
	public void resetGame() {
		totalScore = 0;
		roundScore = 0;
	}
	public void setTotalScore(int score) {	
		totalScore = score;
	}
	public boolean isPlayerTurn() {
		return isTurn == true ? true : false;
	}
	public void setPlayerTurn(boolean turn) {
		isTurn = turn;
	}
}