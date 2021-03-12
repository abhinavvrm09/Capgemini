package capgemini;
import java.util.*;
public class UserInputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("enter a value");
			int a=sc.nextInt();
			
			System.out.println("enter b value");
			int b=sc.nextInt();
			result=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("do not enter 0");
		}
		catch(InputMismatchException e)
		{
			System.out.println("enter only number");
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		finally
		{
			System.out.println("exit");
		}
		System.out.println("result =" +result);

	}

}
