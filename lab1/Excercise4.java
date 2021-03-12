package lab1;
import java.util.*;
public class Excercise4 {

	public static int primeno(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		num=sc.nextInt();
		System.out.println("the prime numbers are :");
		
		for(int i=2;i<=num;i++)
		{
			if(primeno(i)==1)
			{
				System.out.println(i);
			}
		}
	}

}
