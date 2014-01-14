import java.util.Scanner;
public class Prjct3_06 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check its odds,evens, and zeros: ");
		int num = scan.nextInt(),odd=0,even=0,zero=0;
		while (num != 0){
			if(num%10 == 0){
				zero++;
			}else if(num%2 == 0){
				even++;
			}else if(num%2 != 0){
				odd++;
			}
			num = num/10;
		}
		System.out.println("Odds: "+odd+" \nEvens: "+even+"\nZeros: "+zero);
		scan.close();
	}
}
