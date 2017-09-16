
public class Account {

	private double balance;
	private int accountNumber;
	private static double monthEnd = 30;
	private int fWD;

	public Account(int a, double b) {
		accountNumber = a;
		balance = b;

	}
	public int getaccountNumber(){
		return accountNumber;
	}
	public static double getMonthEnd() {
		return monthEnd;
	}
	public static void setMonthEnd(double monthEnd) {
		Account.monthEnd = monthEnd;
	}
	public double getBalance() {
		balance = Math.round(100 * balance);
		balance = balance / 100;
		return balance;
	}
	public void setBalance(double set) {
		balance = set;
	}
	public void deposit(double amt) {
		balance = balance + amt;
		balance = Math.round(100 * balance);
		setBalance(getBalance() / 100);
		System.out.println("Account: " + accountNumber + "\n + Balance: " + balance);
	}
	public void displayBalance(){
	System.out.println("Account: " + accountNumber + "\n + Balance: " + balance);
	}
	public void withdraw(double amt) {
					setBalance(getBalance() - amt);
			setBalance(Math.round(getBalance() * 100));
			setBalance(getBalance() / 100);
			System.out.println("ACCOUNT " + getaccountNumber()
					+ "\n -- BALANCE: " + getBalance());
			addWithdrawal();
			if (getFreeWithdrawsValue() > 3) {
				setBalance(getBalance() - 1);
				setBalance(Math.round(getBalance() * 100));
				setBalance(getBalance() / 100);
				System.out.println("Account Number" + getaccountNumber() + " was charged processing fee.");
			}
			System.out.println("Account: " + accountNumber + "\n +  Balance: " + balance);

		}
		
	
		public int getFreeWithdrawsValue() {
			return fWD;
		}
		
		public void addWithdrawal() {
			fWD++;
		}
		
		public void resetWithdrawals() {
			fWD = 0;
		}
		
		public void monthEnd() {
			fWD = 0;
			setBalance(Math.round(100 * getBalance()));
			setBalance(getBalance() / 100);
			displayBalance();
}
	
}
