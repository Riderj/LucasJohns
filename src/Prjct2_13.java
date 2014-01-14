

public class Prjct2_13 {
	public static void main(String[] args){
		double num1 = Math.random()*10;
		System.out.println("From 0 to 9: " + (int)num1);
		
		double num1Conversion;
		num1Conversion = (int)(Math.random()*20);//This variable is created so we can cast the floating point number into a whole number before we add it on to -10, this allows us to hit -10 without waiting a very long time for the random number generator to hit 0.
		num1 = 1 + Math.random() * 10;
		System.out.println("From 1 to 10: "+(int)num1);

		num1Conversion = (int)(Math.random()*15);
		num1 = 20 + num1Conversion;
		System.out.println("From 20 to 34: "+(int)num1);

		num1Conversion = (int)(Math.random()*20);
		num1 = -10 + num1Conversion;
		System.out.println("From -10 to 9: "+(int)num1);
		
		num1 = Math.random();
		System.out.println("A random double from 0 to 1: "+num1);
		
		num1Conversion = (int)(Math.random()*6);
		num1 = 1+num1Conversion;
		System.out.println("From 1 to 6: " +(int)num1);
	}
}
