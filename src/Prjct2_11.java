import java.text.DecimalFormat;
import java.util.Scanner;
public class Prjct2_11 {
	public static void main(String[] args){
		Scanner r = new Scanner(System.in);
		
		System.out.println("At what mileage did you begin your trip: (Number only)");
		
		double startingMiles = r.nextDouble();
		
		System.out.println("At what mileage did your trip end: (Number only)");
		
		double endingMiles = r.nextDouble();
		
		System.out.println("How much gas do you have: (Number only)");
		
		double gallons = r.nextDouble();
		double mpg = (endingMiles - startingMiles);
		DecimalFormat form = new DecimalFormat("0.###");
		
		r.close();
		
		System.out.println("Starting miles: "+startingMiles );
		System.out.println("Ending miles: "+endingMiles );
		System.out.println("Total miles driven: "+(endingMiles-startingMiles));
		System.out.println("Gallons: "+form.format(gallons) );
		System.out.println("MPG: "+form.format(mpg) );
	}
}
