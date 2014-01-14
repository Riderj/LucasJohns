import java.text.DecimalFormat;


public class Prjct5_02_Rational implements Comparable{
	private int numerator, denominator;
	
	/*
	 * Sets up the rational number by ensuring a nonzero denominator and makinb only the numerator signed. 
	 * 
	 */
	
	public Prjct5_02_Rational(int numer, int denom){
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
	
	public Prjct5_02_Rational reciprocal(){
		return new Prjct5_02_Rational(denominator, numerator);
	}
	
	/*
	 * Adds the rational number to the one passed as a parameter.
	 * A common denominator is found by multiplying the individual denominators.
	 * 
	 */
	
	public Prjct5_02_Rational add(Prjct5_02_Rational op2){
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;
		return new Prjct5_02_Rational(sum,commonDenominator);
	}
	
	/*
	 * Subtracts the rational number passed as a parameter.
	 * 
	 */
	
	public Prjct5_02_Rational subtract(Prjct5_02_Rational op2){
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;
		return new Prjct5_02_Rational(difference,commonDenominator);
	}
	
	/*
	 * Multiplies the rational number passed as a parameter.
	 * 
	 */
	
	public Prjct5_02_Rational multiply(Prjct5_02_Rational op2){
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();
		return new Prjct5_02_Rational(numer,denom);
	}
	
	/*
	 * divides the rational number passed as a parameter by multiplying by reciprocals.
	 * 
	 */
	
	public Prjct5_02_Rational divide(Prjct5_02_Rational op2){
		return multiply(op2.reciprocal());
	}
	
	/*
	 * Determines if the rational number is eaqual to theo ne passed as a parmaete.r assumes they are both reduced.
	 * 
	 */
	
	public boolean equals(Prjct5_02_Rational op2){
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
 
	public int compareTo(Object ratObj) {
		DecimalFormat fmt = new DecimalFormat("#.####");
		double value1, value2;
		
		double  nume1 = getNumerator();
		double  denom1 = getDenominator();
		
		double  nume2 = ((Prjct5_02_Rational) ratObj).getNumerator();
		double  denom2 = ((Prjct5_02_Rational) ratObj).getDenominator();
		
		value1 = nume1/denom1;
		value2 = nume2/denom2;
		
		if(fmt.format(value1).equals(fmt.format(value2))) {
			return 1;
		}else {
			return 0;
		}
	}
}
