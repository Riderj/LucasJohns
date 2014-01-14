import java.util.Scanner;
public class Prjct4_07 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String choice;
		
		System.out.println("Do you want to add, subtract, multiply, or divide a fraction? ");
		choice = scan.next();
		
		//Using an if statement allows us to add multiple choices.
		
		if(choice.equalsIgnoreCase("add")){
			
			System.out.println("\nPlease enter the first fraction to add.");
			int fnum1 = scan.nextInt();
			int fnum2 = scan.nextInt();

			
			Prjct4_07_Rational fraction1 = new Prjct4_07_Rational(fnum1,fnum2); //using the rational class we create a new object and manipulate it.
			

			System.out.println("\nPlease enter the second fraction to add.");
			int f2num1 = scan.nextInt();
			int f2num2 = scan.nextInt();
			
			Prjct4_07_Rational fraction2 = new Prjct4_07_Rational(f2num1,f2num2);
			
			Prjct4_07_Rational result = fraction1.add(fraction2);
			
			System.out.println(fraction1 + " + "+fraction2+" = "+result.toString());
			
		}else if(choice.equalsIgnoreCase("subtract")){
			
			System.out.println("\nPlease enter the first fraction to subtract.");
			int fnum1 = scan.nextInt();
			int fnum2 = scan.nextInt();

			
			Prjct4_07_Rational fraction1 = new Prjct4_07_Rational(fnum1,fnum2);
			

			System.out.println("\nPlease enter the second fraction to subtract.");
			int f2num1 = scan.nextInt();
			int f2num2 = scan.nextInt();
			
			Prjct4_07_Rational fraction2 = new Prjct4_07_Rational(f2num1,f2num2);
			
			Prjct4_07_Rational result = fraction1.subtract(fraction2);
			
			System.out.println(fraction1 + " - "+fraction2+" = "+result.toString());
			
		}else if(choice.equalsIgnoreCase("multiply")){
			
			System.out.println("\nPlease enter the first fraction to multiply.");
			int fnum1 = scan.nextInt();
			int fnum2 = scan.nextInt();

			
			Prjct4_07_Rational fraction1 = new Prjct4_07_Rational(fnum1,fnum2);
			

			System.out.println("\nPlease enter the second fraction to multiply.");
			int f2num1 = scan.nextInt();
			int f2num2 = scan.nextInt();
			
			Prjct4_07_Rational fraction2 = new Prjct4_07_Rational(f2num1,f2num2);
			
			Prjct4_07_Rational result = fraction1.multiply(fraction2);
			
			System.out.println(fraction1 + " * "+fraction2+" = "+result.toString());
			
		}else if(choice.equalsIgnoreCase("divide")){

			System.out.println("\nPlease enter the first fraction to divide.");
			int fnum1 = scan.nextInt();
			int fnum2 = scan.nextInt();

			
			Prjct4_07_Rational fraction1 = new Prjct4_07_Rational(fnum1,fnum2);
			

			System.out.println("\nPlease enter the second fraction to divide.");
			int f2num1 = scan.nextInt();
			int f2num2 = scan.nextInt();
			
			Prjct4_07_Rational fraction2 = new Prjct4_07_Rational(f2num1,f2num2);
			
			Prjct4_07_Rational result = fraction1.divide(fraction2);
			
			System.out.println("("+fraction1 + ") / ("+fraction2+") = "+result.toString());
						
		}
		scan.close();
	}
}
