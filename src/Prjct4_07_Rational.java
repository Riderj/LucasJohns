
public class Prjct4_07_Rational {
	private int numerator, denominator;
	
	/*
	 * Sets up the rational number by ensuring a nonzero denominator and makinb only the numerator signed. 
	 * 
	 */
	
	public Prjct4_07_Rational(int numer, int denom){
		if(denom == 0){
			denom = 1;
		}
		if(denom <0){
			numer = numer * -1;
			denom = denom * -1;
		}
		
		numerator = numer;
		denominator = denom;
		
		reduce();
	}
	
	/*
	 * Returns the numerator of the rational number.
	 * 
	 */
	
	public int getNumerator(){
		return numerator;
	}
	
	/*
	 * Returns the denominator of the rational number.
	 * 
	 */
	
	public int getDenominator(){
		return denominator;
	}
	
	/*
	 * Returns the reciprocal of the rational number
	 * 
	 */
	
	public Prjct4_07_Rational reciprocal(){
		return new Prjct4_07_Rational(denominator, numerator);
	}
	
	/*
	 * Adds the rational number to the one passed as a parameter.
	 * A common denominator is found by multiplying the individual denominators.
	 * 
	 */
	
	public Prjct4_07_Rational add(Prjct4_07_Rational op2){
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;
		return new Prjct4_07_Rational(sum,commonDenominator);
	}
	
	/*
	 * Subtracts the rational number passed as a parameter.
	 * 
	 */
	
	public Prjct4_07_Rational subtract(Prjct4_07_Rational op2){
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;
		return new Prjct4_07_Rational(difference,commonDenominator);
	}
	
	/*
	 * Multiplies the rational number passed as a parameter.
	 * 
	 */
	
	public Prjct4_07_Rational multiply(Prjct4_07_Rational op2){
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();
		return new Prjct4_07_Rational(numer,denom);
	}
	
	/*
	 * divides the rational number passed as a parameter by multiplying by reciprocals.
	 * 
	 */
	
	public Prjct4_07_Rational divide(Prjct4_07_Rational op2){
		return multiply(op2.reciprocal());
	}
	
	/*
	 * Determines if the rational number is eaqual to theo ne passed as a parmaete.r assumes they are both reduced.
	 * 
	 */
	
	public boolean equals(Prjct4_07_Rational op2){
		return(numerator == op2.getNumerator()&& denominator == op2.getDenominator());
	}
	
	/* Returns the rational number as a string. */
	
	public String toString(){
		String result;
		
		if (numerator == 0){
			result = "0";
		}else{
			if(denominator == 1){
				result = numerator + "";
			}else{
				result = numerator + "/" + denominator;
			}
		}
		return result;
	}
	
	/*
	 * Reduces this rational number by diuviding botht he numerator and the denominator by their greatest common divisior.
	 * 
	 */
	
	private void reduce(){
		if(numerator != 0){
			int common = gcd(Math.abs(numerator), denominator);
			
			numerator = numerator/common;
			denominator = denominator/common;
		}
	}
	
	/*
	 * Computes and returns the greatest common divisor of the two positive parameters. uses euclid's algorithm.
	 * 
	 */
	
	private int gcd(int num1, int num2){
		while (num1 != num2){
			if(num1 > num2){
				num1 -= num2;
			}else{
				num2 -= num1;
			}
		}
		return num1;
	}
}
