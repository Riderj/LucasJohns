import java.util.Scanner;
public class Prjct2_05 {
	public static void main(String args[]){
		final double MILE = 1.60934; // one mile is equal to 1.60935 kilometers
		@SuppressWarnings("resource")
		Scanner r = new Scanner(System.in);
		
		System.out.println("Enter how many miles:");
		double miles = r.nextInt();
		double kilometers = miles*MILE;
		
		System.out.println(miles + " miles is the same as " + kilometers +" kilometers.");
	}
}
