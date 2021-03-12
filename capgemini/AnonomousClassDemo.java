package capgemini;

class Bank4
{
	void rateOfInterest()
	{
		System.out.println("5%");
	}
}



//A class without name
public class AnonomousClassDemo {
public static void main(String args[])
{
	Bank4 sbi=new Bank4()
			{
				void rateOfInterest()
				{
					System.out.println("7%");
				}
			};
}
}
