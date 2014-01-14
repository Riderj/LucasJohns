import java.util.Scanner;
public class Prjct3_11 {
	public static void main(String[] args){
		String str, another = "y";
		int left,right;
		Scanner scan = new Scanner(System.in);
		
		while(another.equalsIgnoreCase("y")){
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine().toLowerCase();
			
			for (int i = 0; i<str.length(); i++){
				if(Integer.valueOf(str.charAt(i)) < 97 ||  Integer.valueOf(str.charAt(i)) > 122){
					str = str.replace(str.charAt(i), ' ');
				}
			}
			

			str = str.replaceAll(" ", "");
			left = 0;
			right = str.length()-1;
			
			while(str.charAt(left) == str.charAt(right) && left < right){
				left++;
				right--;
			}
			
			System.out.println();
			
			if(left < right ){
				System.out.println("That string is NOT a palindrome.");
			}else{
				System.out.println("That string IS a palindrome.");
			}
			
			System.out.println();
			System.out.println("Test another palindrome (y/n)?");
			another = scan.nextLine();
		}
		scan.close();
	}
}