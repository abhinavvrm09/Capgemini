package capgemini;

class Bank2
{
	void rateofInterest()
	{
		System.out.println("1%");
	}
}

class sbi extends Bank2
{
	void rateofInterest()
	{
		System.out.println("5%");
	}
}
class kotak extends Bank2
{
	void rateofInterest()
	{
		System.out.println("6%");
	}
}
public class overridingDemo {
public static void main(String args[])
{
	Bank2 bank2=new kotak();
	bank2.rateofInterest();
}
}
