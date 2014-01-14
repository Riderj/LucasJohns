import java.util.Scanner;
import java.text.DecimalFormat;
public class Prjct2_10 {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		DecimalFormat DForm = new DecimalFormat("0.###");
		Scanner scan = new Scanner(System.in);
		double a,b,c,s;
		System.out.println("Enter a length of side 1");
		a = scan.nextDouble();
		System.out.println("Enter a length of  side 2");
		b = scan.nextDouble();
		System.out.println("Enter a length of side 3");
		c = scan.nextDouble();
		s = (a+b+c)/2;
		double area = Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
		
		System.out.printf("Side 1: %s Side 2: %s Side 3: %s Perimeter: %s \t Area: %s", a,b,c,s,DForm.format(area));
	}
}
