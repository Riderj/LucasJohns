import java.util.Scanner;
public class Prjct6_05 {
	public static void main(String[] args) {
		int[] nums = new int[101];
		Scanner scan = new Scanner(System.in);
		final int ESCAPE = -1;
		int choice = 45;
		//The storing method is the same as project 6.1 and 6.2, but it will differ in how we display the data.
		
		System.out.println("Input numbers from 1-100, -1 to quit.");
		while(choice > ESCAPE) {
			int num = scan.nextInt();
			if(num >=0) {
				if(num <= nums.length-1) {
					nums[num]+=1;
				}else {
					System.out.println("Enter a value between 1 and 100.");
				}
			}else {
				choice = num;
			}
		}
		
		/*
		 * I used a max value, that way we can increment it by 10, so we can have more values if wanted. I then use one loop to add a total so I can print 1 star for each number, so if it's 56 56 stars will print.
		 * the second loop deals with stars, it loops from 1-total. This correctly prints the stars.
		 */

		int max = 10;

		System.out.println("Each * represents a 5.\n");
		while(max<101) {
			int total = 0;
			System.out.println();
			System.out.print("| "+(max-9)+"-"+max+" | ");
			for(int i = max-9; i<max+1;i++) {
				total += nums[i];
			}
			for(int display = 1;display <= Math.floor(total/5); display++) { // Math.floor(total/5) will display  1 star for every 5 numbers in the number range.
				System.out.print("*");
			}
			max = max+10;
		}
		scan.close();
	}
}
