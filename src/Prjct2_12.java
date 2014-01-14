import java.text.NumberFormat;
import java.util.Scanner;
public class Prjct2_12 {
	public static void main(String[] args){
		int quarters,dimes,nickels,pennies;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many quarters do you have?: ");
		quarters = scan.nextInt();
		System.out.println("How many dimes do you have?: ");
		dimes = scan.nextInt();
		System.out.println("How many nickels do you have?: ");
		nickels = scan.nextInt();
		System.out.println("How many pennies do you have?: ");
		pennies = scan.nextInt();
		scan.close();
		double coinValue = (quarters*.25)+(dimes*.1)+(nickels*.05)+(pennies*.01);
		System.out.println("The total amount of money you have is: "+NumberFormat.getCurrencyInstance().format(coinValue));
		
	}
}
