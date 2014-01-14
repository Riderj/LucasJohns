import java.util.Scanner;
public class Prjct4_05 {
	static final int MAX_SCORE = 100;
	static String userName;
	static Prjct4_05_Player player;
	static Prjct4_05_Player comp;
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello, Welcome to pig. What's your name?");
		userName = scan.next();
		
		player = new Prjct4_05_Player(userName);
		comp = new Prjct4_05_Player("Computer", true);
		
		System.out.println();
		System.out.println("Welcome, "+userName+" to a game called Pig... Lets begin");
		
		String playagain = "y";
		
		while(playagain.equalsIgnoreCase("y")) {
			while(player.getTotalScore() <MAX_SCORE && comp.getTotalScore() <MAX_SCORE) {
				player.roll();
				//The roll class will handle everything score and roll related. So basically it's the main method.
				comp.roll();
				
				//The code will keep running/rolling until the score is above 99
			}
			
			if(player.win){
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\t"+userName + " has won!");
			}else if(comp.win) {
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\tThe computer has won!");
			}
			System.out.println("\nWould you like to play again? (y/n)");
			playagain = scan.next();
			if(playagain.equalsIgnoreCase("y")) {
				resetGame();
			}
		}
		scan.close();
	}
	private static void resetGame() {
		player.resetGame();
		comp.resetGame();
	}
}
