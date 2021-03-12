package capgemini;
import java.util.*;
public class ThrowDemo {
	
	void checkEligibility(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("you cant vote");
		}
		else
		{
			System.out.println("u can vote");
		}
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
}
}
