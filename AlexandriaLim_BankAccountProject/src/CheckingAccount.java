
public class CheckingAccount extends Account{

	private int day = 1;
	private double w = 1;
	public CheckingAccount(int a, double b, int d){
	super (a, b);
	day = d;
	}
	public double withdraw(int d, double b, double w){
	if (d> 30){
		return b - w;
	}
	return b;
	}
	public void day(){
		day++;
	}
	
}
