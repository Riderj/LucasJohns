import java.text.NumberFormat;
public class Prjct5_07_Account implements Prjct5_07_Lockable{
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	private final double RATE = .035;
	
	private int acctNumber, key;
	private double balance;
	private String name;
	private boolean isLocked = true;
	
	public Prjct5_07_Account(String owner, int account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}

	public double deposit(double amount) {
		if(isLocked == false) {
			if (amount < 0){
				System.out.println();
				System.out.println("Error: Deposit amount is invalid.");
				System.out.println(acctNumber + " " + fmt.format(amount));
			}else{
				balance += amount;
			}
		}
		return balance;
	}

	public double withdraw(double amount, double fee) { // Need to fix these methods to display the parameters.
		amount += fee;
		if(isLocked == false) {
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
		}
		return balance;
	}

	public double addInterest() {
		if(isLocked == false) {
			balance += (balance * RATE);
		return balance;
		}
		return 0;
	}
	
	public double getBalance(){
		if(isLocked == false) {
			return balance;
		}
		return 0;
	}
	
	public int getAccountNumber(){
		if(isLocked == false) {
		return acctNumber;
		}
		return 0;
	}
	

	public void transferMoney(Prjct5_07_Account acct, double amount){
		if(isLocked == false) {
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
	}
	
	public String toString(){
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}

	public boolean Locked() {
		return isLocked;
	}

	
	public void setLock(int key) {
		this.key = key;
	}

	
	public void lock(int key) {
		if(key == this.key) {
			isLocked = true;
		}
	}

	
	public void unlock(int key) {
		if(key == this.key) {
			isLocked = false;
		}
	}

}
