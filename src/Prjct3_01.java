import java.text.DecimalFormat;
import java.util.Scanner;

public class Prjct3_01 {
	public static void main(String[] args){
		int sum = 0, value, count = 0;
		double average;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer (0 to quit)");
		value = scan.nextInt();
		
		while (value != 0){
			count++;
			
			sum += value;
			System.out.println("The sum so far is: "+ sum);
			
			System.out.println("Enter an integer (0 to quit)");
			value = scan.nextInt();
		}
		
		if (count != 0){
			System.out.println();
			System.out.println("Number of values entered: "+count);
			
			average = (double)sum / count;
			
			DecimalFormat fmt = new DecimalFormat("0.##");
			System.out.println("The average is "+fmt.format(average));
		}
		System.out.println("Goodbye!");
		scan.close();
	}
}
