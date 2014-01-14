import java.util.Scanner;
public class Prjct3_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type a sentence: \n");
		String str = scan.nextLine();
		for(int i =0; i<str.length();i++){
			System.out.println(" \t"+str.charAt(i));
		}
		scan.close();
	}
}
