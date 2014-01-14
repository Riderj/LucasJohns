import java.util.Scanner;


public class Prjct5_01 {
	public static void main(String[] args0) {
		String sentence, result, another = "y";
		Scanner scan = new Scanner ( System.in);
		
		while (another.equalsIgnoreCase("y")) {
			System.out.println("Enter a sentence (no punctuation)");
			sentence = scan.nextLine();
			
			System.out.println();
			result = Prjct5_01_PigLatinTranslator.translate(sentence);
			System.out.println("That sentence in pig latin is: ");
			System.out.println(result);
			
			System.out.println();
			System.out.println("Translate another sentence (y/n)?");
			another = scan.nextLine();
		}
	}
}
