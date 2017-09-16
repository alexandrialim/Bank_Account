import java.util.*;
public class MainBank extends Account{
	private boolean quit;
	private double endOfMonth;
	public MainBank(int a, double b, boolean q, double m) {
		super(a, b);
		// TODO Auto-generated constructor stub
		quit = q;
		endOfMonth = m;
		
	}

	public static void main(String[] args) {
		ArrayList<Account> accountList = new ArrayList<Account>();
		SavingAccount savacc1 = new SavingAccount(1,0,0);
		accountList.add(savacc1);
		Account chekacc1 = new Account(2,0);
		accountList.add(chekacc1);
		String i;
		int parm1;
		double parm2 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Array List Accounts:" );
		
		boolean o = true;
		boolean f = false;
		while(f == false){

				System.out.println("A)dd Account, D)eposit, W)ithdrawl, M)onth End, Q)uit");
				System.out.println("");
				i = scanner.next();
				
			if(i.equals("A") && i.equals("a")){
				System.out.println("........");
				System.out.println("C)hecking  S)avings");
				i = scanner.next();
				System.out.println("");
				if(i.equals("C") && i.equals("c")){
					Account newacc = new Account (accountList.size()+1, 0);
					accountList.add(newacc);
				}
				if(i.equals("S") && i.equals("s")){
					SavingAccount newsavacc = new SavingAccount (accountList.size() +1,0,0);
					accountList.add(newsavacc);
				}
				if (i.equals("C") || i.equals("c")) {
					o = false;
					f = true;
				}
		   }
			while (o == false) {
				System.out.println("W)ithdraw   D)eposit   M)onth End   Q)uit");
				System.out.println("");
				i = scanner.next();
				
				if (i.equals("W") || i.equals("w")) {
					System.out.println("Account Number: ");
					System.out.println("");
					parm1 = scanner.nextInt();
					System.out.println("Amount to withdraw? ");
					System.out.println("");
					parm1 = scanner.nextInt();
					accountList.get(parm1).withdraw(parm2);
				}
				
				if (i.equals("D") || i.equals("d")) {
					System.out.println("Amount to deposit? ");
					System.out.println("");
					parm2 = scanner.nextDouble();
					for (Account personInArrayList: accountList) {
						personInArrayList.deposit(parm2);
				   }
				}
				
	            if (i.equals("EM") || i.equals("em")) {
					
					System.out.println("Ending account month. ");
					System.out.println("");
					
					for (Account personInArrayList: accountList) {
						personInArrayList.monthEnd();
			       }
				}
	            
	            if (i.equals("AL") || i.equals("al")) {
					
					System.out.println("Displaying accountList: ");
					System.out.println("");
					
					for (Account personInArrayList: accountList) {
						personInArrayList.displayBalance();
			       }
				}
				if (i.equals("Q") || i.equals("q")) {
					System.out.println("Quit");
					o = true;
					scanner.close();
				}
			}
		}
	}
}









