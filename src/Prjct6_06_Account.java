import java.text.NumberFormat;
public class Prjct6_06_Account {
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	private int acctNumber;
	private double balance;
	private String name;
	
	public Prjct6_06_Account(String owner, int account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}

	public double deposit(double amount) {
		if (amount < 0){
			System.out.println();
			System.out.println("Error: Deposit amount is invalid.");
			System.out.println(acctNumber + " " + fmt.format(amount));
		}else{
			balance += amount;
		}
		return balance;
	}

	public double withdraw(double amount, double fee) { // Need to fix these methods to display the parameters.
		amount += fee;
		if(amount < 0){
			System.out.println();
			System.out.println("Error: Withdraw amount is invalid.");
			System.out.println("Account: "+acctNumber);
			System.out.println("Requested: "+fmt.format(amount));
		}else{
			if(amount > balance){
				System.out.println();
				System.out.println("Error: Insufficient funds.");
				System.out.println("Account: "+acctNumber);
				System.out.println("Requested: "+fmt.format(amount));
				System.out.println("Available: "+fmt.format(balance));
			}else{
				balance -= amount;
			}
		}
		return balance;
	}

	public double addInterest(double RATE) {
		balance += (balance * RATE);
		return balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public int getAccountNumber(){
		return acctNumber;
	}
	

	public void transferMoney(Prjct6_06_Account acct, double amount){
		if(amount > balance){
			System.out.println();
			System.out.println("Error: Transfer amount is invalid.");
			System.out.println("Account: "+acctNumber);
			System.out.println("Requested: "+fmt.format(amount));
			System.out.println("Available: "+fmt.format(balance));
		}else{
			acct.deposit(amount);
			balance -= amount;
			System.out.println();
			System.out.println("Remaining Balance: "+fmt.format(balance));
		}
	}
	
	public String toString(){
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}

}
