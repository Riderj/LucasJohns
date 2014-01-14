
public class Prjct4_08 {
	public static void main(String[] args){
		Prjct4_08_Address school = new Prjct4_08_Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
		
		Prjct4_08_Address jHome = new Prjct4_08_Address("21 Jump Street.", "Lynchburg", "VA", 24551);
		Prjct4_08_Student john = new Prjct4_08_Student("John","Gomez",jHome,school,98,86,88);
		Prjct4_08_Address mHome = new Prjct4_08_Address("123 Main Street", "Euclid", "OH", 44132);
		Prjct4_08_Student marsha = new Prjct4_08_Student("Marsha","Jones",mHome,school,67,54,0);
		
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);
		System.out.println("---------------------------------------");
		marsha.setTestScore(1,120);
		System.out.println(marsha);
	}
}
