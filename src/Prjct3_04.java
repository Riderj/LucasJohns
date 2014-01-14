import java.util.Scanner;
public class Prjct3_04 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a max value to add up to (greater than or equal to 2):");
		int sum=0;
		int max = scan.nextInt();
		if(max >= 2){
			for (int i=0; i <= max;i+=2){ //Less than max because we'll add the max to the sum at the end.
				sum += i; //Add up all the evens excluding the max.
			}
		}else{
			System.out.println("You must enter a value greater than or equal to 2");
		}
		
		if(max >= 2){
			System.out.println("The sum of the even integers between 2 and "+max+"(inclusive) is: "+(sum));
		}
		scan.close();
	}
}
