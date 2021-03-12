package capgemini;
class Account
{
	void minBalance()
	{
		System.out.println("1000");
	}
}

class SavingsAccount extends Account
{
	void minBalance()
	{
		System.out.println("10000");
	}
}

class CurrentAccount extends Account
{
	void minBalance()
	{
		System.out.println("25000");
	}
}


public class MinBal {
	public static void main(String args[])
	{
		Account account=new CurrentAccount();
	}

}
