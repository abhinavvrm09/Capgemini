package capgemini;

class SavingAccount
{
	private int balance;
	private int rateOfInterest;
	public SavingAccount(int balance, int rateOfInterest) {
		super();
		this.balance = balance;
		this.rateOfInterest = rateOfInterest;
	}
	
	public void withdraw(int amount)
	{
		balance=balance-amount;
	}
	
	public void deposit(int amount)
	{
		balance+=amount;
	}
	
	public int interest()
	{
		balance+=balance*rateOfInterest/100;
		return balance;
	}
	
}


public class task2 {
public static void main(String args[])
{
	SavingAccount sa=new SavingAccount(1000,4);
	System.out.println("your balance "+sa.interest());
	sa.deposit(3000);
	System.out.println("your balance "+sa.interest());
}
}
