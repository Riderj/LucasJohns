import java.util.Scanner;

public class Prjct6_02{
	public static void main(String[] args) {
		int[] nums = new int[51];
		int choice = 0;
		final int ESCAPE = -26;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers from 0 to 50, use "+ESCAPE+" when finished.");
		
		/*
		 *  As long as choice does not equal -1, it will keep prompting for integer inputs.
		 *  We check that the number does not equal -1, because we use the num integer
		 *  which holds the number input, as the index for the array. The index cannot be negative.
		 *  The number is stored by the value the user inputs, and increments the corresponding number by 1 
		 */
		
		while(choice >= ESCAPE) {
			int num = scan.nextInt();
			if(num >= -(nums.length-26) && num <= (nums.length-26)) { // The range is between -25 and 25 inclusive, therefore we subtract 25 from 50, but since the arrays length is 51, we have to subtract an additional 1.
				if(num != -1) {
					nums[num+25] += 1; //To properly store the values, we must make them positive. The minumum value is -25, so we add 25 to make it 0.
				}
			}else {
				System.out.println("Please enter a number from -25 to 25.");
			}
			choice = num;
		}

		System.out.println("\t Times each number was entered:");
		for(int pos = 0; pos<= (nums.length-1); pos++) {
			if(nums[pos] != 0) {
				System.out.println((pos-25) +": "+nums[pos]);
			}
		}
		System.out.println("Others: 0");
		scan.close();
	}
}
