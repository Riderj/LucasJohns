// c= (5/9) * (f-32)
import java.util.Scanner;
public class Prjct2_04 {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner r = new Scanner(System.in);
		final int BASE = 32;
		double celsiusTemp; // The converted value from farenheit
		
		System.out.println("Enter a temperature in fahrenheit:");
		
		double fahrenheitTemp = r.nextDouble(); // The value to be converted to celsius
		
		celsiusTemp = (5.0/9.0) * (fahrenheitTemp-BASE);
		System.out.println("The converted temperature from "+fahrenheitTemp+" fahrenheit to celsius is: "+celsiusTemp+" ");
	}
}
