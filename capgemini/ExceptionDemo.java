package capgemini;

public class ExceptionDemo {
public static void main(String args[])
{
	System.out.println("bangalore");
	System.out.println("100 km crossed");
	try
	{
		System.out.println(2/0);
	}
	catch(Exception ex)
	{
		System.out.println("do not divide with zero");
	}
	System.out.println("200 km crossed");
	System.out.println("300 km crossed");
	System.out.println("Chennai");
}
}
