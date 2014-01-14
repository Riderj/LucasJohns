import java.util.Scanner;
public class Prjct4_03 {
	public static void main(String[] args){
		int faces = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Want to roll the die I see, How many faces does it have (Minimum Sides: 6)?");
		
		faces = scan.nextInt(); 
		Prjct4_03_Die die = new Prjct4_03_Die(faces);
		
		System.out.println("Ah I see it's a "+die.getFaces()+" sided die. Lets roll the die to see what you get!");
		System.out.println("You've rolled a "+die.roll()+"!");
		
		scan.close();
	}
}
