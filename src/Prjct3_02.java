import java.util.Scanner;
public class Prjct3_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		
		System.out.println("What year do you want to check if it's a leap year?: ");
		year = scan.nextInt();
		
		if(year >= 1582){// year the gregorian calendar was adopted.
			if(year%4 == 0){
				if(year%100 == 0 && year%400 == 0){ //The modulus is used so that we can compare the value returned to zero, if it's remainder is 0 that means it evenly divided into the year. Otherwise, it'll not equal zero and we can do the checks needed.
					System.out.println("The year: "+year+" is a leap year.");
				}else if(year%100 !=0){// As long as the year is not divisible by 100, but is divisible by 400 it's a leap year.
					System.out.println("The year: "+year+" is a leap year.");
				}else{// if it's not divisible by 400, but 100 then it's not a leap year.
					System.out.println("The year: "+year+" is not a leap year.");
				}
			}else{// if it's not divisible by 4 then it's not a leap year.
				System.out.println("The year: "+year+" is not a leap year.");
			}
		}else{
			System.out.println("That is not a valid number, please enter a value greater than 1582 (The date the gregorian calender was adopted)");
		}
		scan.close();
	}

}
