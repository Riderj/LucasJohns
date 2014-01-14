import java.util.Scanner;

public class Prjct6_01 {
	public static void main(String[] args) {
		int[] nums = new int[51];
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers from 0 to 50, use -1 when finished.");
		
		/*
		 *  As long as choice does not equal -1, it will keep prompting for integer inputs.
		 *  We check that the number does not equal -1, because we use the num integer
		 *  which holds the number input, as the index for the array. The index cannot be negative.
		 *  The number is stored by the value the user inputs, and increments the corresponding number by 1 
		 */
		
		while(choice != -1) {
			int num = scan.nextInt();
			if(num <= (nums.length-1)) {
				if(num != -1) {
					nums[num] += 1;
				}
			}else {
				System.out.println("Please enter a number from 0 to 50.");
			}
			choice = num;
		}

		System.out.println("\t Times each number was entered:");
		for(int pos = 0; pos<= (nums.length-1); pos++) {
			if(nums[pos] != 0) {
				System.out.println(pos +": "+nums[pos]);
			}
		}
		System.out.println("Others: 0");
		scan.close();
	}
}
