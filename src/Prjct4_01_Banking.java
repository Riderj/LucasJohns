
public class Prjct4_01_Banking {
	public static void main(String[] args){
		Prjct4_01_Account acct1 = new Prjct4_01_Account ("Ted Murphy", 72354, 102.56);
		Prjct4_01_Account acct2 = new Prjct4_01_Account ("Anita Gomez", 69713, 40.00);
		Prjct4_01_Account acct3 = new Prjct4_01_Account ("Sanchit Reddy", 93757, 759.32);
		
		acct1.deposit(25.85);
		
		double gomezBalance = acct2.deposit(500.00);
		System.out.println("gomez balance after deposit: "+gomezBalance);
		
		System.out.println("gomez balance after withdrawal: "+acct2.withdraw(430.75,1.50));
		
		acct3.withdraw(800.00, 0);
		
		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();
		
		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);
		
		acct1.transferMoney(acct2, 200);
		acct1.transferMoney(acct2, 100);
		
		System.out.println();
		System.out.println(acct2);
	}
}
