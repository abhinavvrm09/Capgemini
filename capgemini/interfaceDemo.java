package capgemini;


interface bank
{
	abstract void rateofInterest();// how to provide implementation -> by overriding
	int workingDays=27;
}
interface Loan
{
	abstract void creditLimit();
}
class qwe implements bank,Loan
{

	@Override
	public void rateofInterest() {
		System.out.println("4% of interest");
		System.out.println("bank workind day "+workingDays);
		
	}
	public void creditLimit()
	{
		System.out.println("upto 1cr for current account");
		System.out.println("upto 10 lakhs for savings account");
	}
	
}
public class interfaceDemo {
public static void main(String args[])
{
	
}
}
