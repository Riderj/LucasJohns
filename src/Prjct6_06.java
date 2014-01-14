import java.text.DecimalFormat;
import java.util.Scanner;


public class Prjct6_06 {
	public static Prjct6_06_Account accounts[] = new Prjct6_06_Account[31];
	private static Scanner scan = new Scanner(System.in);
	static int options = 0;
	public static String name;
	public static double initial;
	public static int accountsToRegister;
	
	
	public static void main(String args[]) throws InterruptedException {
		
		/* To allow multiple user inputs, we loop until options is -1 */
		
		while(options > -1) {
			System.out.println("What would you like to do? (Enter the number to choose)");
			System.out.println();
			System.out.println("0: Register Accounts\n1: Deposit\n2: Withdraw\n3: Balance\n\n-1 to quit");
			options = scan.nextInt();
			
			/* Using a switch statement to make it easier to write code for the number the user chose. */
			
			switch(options) {
			
			case 0: //Register accounts
				System.out.println("How many accounts would you like to register (Max = 30)");
				accountsToRegister = scan.nextInt();
				if(accountsToRegister < accounts.length) {
					for(int acctnum = 0; acctnum < accountsToRegister; acctnum++) {
						System.out.println("Enter the account owners first name:");
						name = scan.next();
						System.out.println("Enter the account owners last name:");
						name += " "+ scan.next();
						scan.reset();
						System.out.println("Enter the initial balance (ex: 5.00):");
						initial = scan.nextDouble();
						
						accounts[acctnum] = new Prjct6_06_Account(name, acctnum, initial);
					}
				}else {
					System.out.println("Sorry we can only register up to 30 accounts.");
				}
				break;
				
			case 1: //Deposit to account
				int numAccts = 0;
				
				/* This increments the numAccts variable so we can display how many accounts are currently registered
				 */
				for (int i=0;i<accounts.length; i++) {
					if(accounts[i] != null) {
						numAccts++;
					}
				}
				
				System.out.println("Which account id would you like to deposit to? \nAvailable Accounts: 0-"+(numAccts-1));
				
				int acctNumber = scan.nextInt();
				
				if(accounts[acctNumber] != null) {
					System.out.println("How much would you like to deposit to account id "+accounts[acctNumber].getAccountNumber());
					double amount = scan.nextDouble();
					if(amount >-1) {
						accounts[acctNumber].deposit(amount);
						System.out.println("You have deposited "+DecimalFormat.getCurrencyInstance().format(amount)+" to account id "+accounts[acctNumber].getAccountNumber());
					}else{
						System.out.println("Please use numbers greater than 0");
					}
				}else {
					System.out.println("That account does not exist!");
				}
				
				break;
				
			case 2: //Withdraw from account
				int numAccts2 = 0;
				
				for (int i=0;i<accounts.length; i++) {
					if(accounts[i] != null) {
						numAccts2++;
					}
				}
				
				System.out.println("Which account id would you like to withdraw from? \nAvailable Accounts: 0-"+(numAccts2-1));
				
				int acctNumber2 = scan.nextInt();
				
				if(accounts[acctNumber2] != null) {
					System.out.println("How much would you like to withdraw from account id "+accounts[acctNumber2].getAccountNumber());
					
					double amount = scan.nextDouble();
					
					if(amount > -1) {
						if(accounts[acctNumber2].getBalance() >= amount) {
							accounts[acctNumber2].withdraw(amount, 0);
							System.out.println("You have withdrew "+DecimalFormat.getCurrencyInstance().format(amount)+" from account id "+acctNumber2);
						}else {
							System.out.println("The account id "+acctNumber2+" does not have "+DecimalFormat.getCurrencyInstance().format(amount)+" in their account!");
						}
					}else{
						System.out.println("Please use numbers greater than 0");
					}
				}else {
					System.out.println("That account does not exist!");
				}
				break;
				
			case 3: //Balance of every registered account
				int emptyaccounts = 0;
				
				for(int i = 0; i< accounts.length;i++) {
					if(accounts[i] != null) {
						System.out.println("Accounts Number: "+ accounts[i].getAccountNumber()+"\tBalance: "+accounts[i].getBalance());
					}else if(emptyaccounts == accounts.length-1) {
						System.out.println("Sorry, but we do not have any accounts on record. You can easily register one by choosing Register Accounts.\n");
					}else {
						emptyaccounts += 1;
					}
				}
				break;
			}
			wait(2);
		}
	}
	
	public void addInterestToAll() {
		double RATE = .03;
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				accounts[i].addInterest(RATE);
			}
		}
	}
	
	public static double wait(int seconds) throws InterruptedException {
		Thread.sleep((seconds*1000));
		return seconds;
	}
}
