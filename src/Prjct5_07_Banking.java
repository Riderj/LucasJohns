
public class Prjct5_07_Banking {
	public static void main(String[] args){
		Prjct5_07_Account acct1 = new Prjct5_07_Account ("Ted Murphy", 72354, 102.56);
		Prjct5_07_Account acct2 = new Prjct5_07_Account ("Anita Gomez", 69713, 40.00);
		Prjct5_07_Account acct3 = new Prjct5_07_Account ("Sanchit Reddy", 93757, 759.32);
		
		acct1.setLock(111);
		acct2.setLock(111);
		acct3.setLock(111);
		
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
		
		System.out.println("\n\nWe unlock the objects and add interest");
		acct1.unlock(111);
		acct2.unlock(111);
		acct3.unlock(111);
		
		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();
		
		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);
	}
}
