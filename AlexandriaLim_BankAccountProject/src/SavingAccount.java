
public class SavingAccount extends Account{
	private static double interest;
	public SavingAccount(double b, int a, double i){
		super(a, b);
		interest = i;
	}
	
	public static final void setinterest(double i){
	interest = 0.0314;
	}
	public double setBalance(double b, double i){
		return i* b;
	}

	public int add(int Account) {
		return Account++;
	}
	public void withdraw(double amt) {
		setBalance(getBalance() - amt);
		System.out.println("ACCOUNT: " + getaccountNumber()
				+ "\n -- BALANCE: " + getBalance());
		addWithdrawal();
		if (getFreeWithdrawsValue() > 3) {
			setBalance(getBalance() - 1);
			System.out.println("Account Number" + getaccountNumber() + " was charged a processing fee.");
		}
		System.out.println("");
	}
	
	public void monthEnd() {
		resetWithdrawals();
		setBalance((interest * getBalance()) + getBalance());
		setBalance(Math.round(100 * getBalance()));
		setBalance(getBalance() / 100);
		displayBalance();
	}
}
