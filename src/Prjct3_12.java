/*
 * 
 *  This will print out different star patterns.
 * 
 */
public class Prjct3_12 {
	public static void main(String args[]){
		
		//a
		System.out.println("\nA\n");
		
		for(int row=10; row>=1; row--){
			for(int stars=1; stars<=row; stars++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//b
		System.out.println("\nB\n");
		
		for(int row=1; row<=10; row++){
			for(int spaces = 1; spaces <=(10-row); spaces++){
				System.out.print(" ");
			}
			for(int stars=1; stars<=row; stars++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//c
		System.out.println("\nC\n");
		
		for(int row=10; row>=1; row--){
			for(int spaces = 1; spaces <=(10-row); spaces++){
				System.out.print(" ");
			}
			for(int stars=1; stars<=row; stars++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//D
		System.out.println("\nD\n");
				
		for(int row=1; row<=10; row+=2){
			for(int spaces=1; spaces <= (10-(row/2));spaces++){
				System.out.print(" ");
			}
			for(int stars = 1; stars<=row; stars++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=9; row>=1; row-=2){
			for(int spaces=1; spaces <= (10-(row/2));spaces++){
				System.out.print(" ");
			}
			for(int stars = 1; stars<=row; stars++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
