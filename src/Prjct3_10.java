import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Prjct3_10 {
	public static void main(String[] args){
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int number = 1+random.nextInt(100);
		int numGuesses = 0;
		
		int guess;
		try{
			System.out.println("Guess a number between 1 and 100 (-1 to quit)");
			guess = scan.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Guess a number between 1 and 100 (-1 to quit)");
			guess = scan.nextInt();
		}
		String another = "y";
		while (another.equalsIgnoreCase("y") && guess != -1){
			if(guess > 0 && guess <= 100){
				if(guess > number){
					System.out.println("Guess lower! (-1 to quit)");
					guess = scan.nextInt();
					numGuesses++;
				}else if(guess < number){
					System.out.println("Guess higher! (-1 to quit)");
					guess = scan.nextInt();
					numGuesses++;
				}else if(guess == number){
					numGuesses++;
					System.out.println("You won! Guesses: "+numGuesses);
					System.out.println("\n\nWant to play again? (y/n)");
					another = scan.next();
					
					if(another.equalsIgnoreCase("n")){
						System.out.println("\n\n\n\t Thanks for Playing!");
					}else{
						numGuesses = 0;
						number = 1+random.nextInt(100);
						System.out.println("Guess a number between 1 and 100 (-1 to quit)");
						guess = scan.nextInt();
					}
				}
			}else{
				System.out.println("Guess a number between 1 and 100 (-1 to quit)");
				guess = scan.nextInt();
			}
		}
		scan.close();
	}
}
