package lab1;
import java.util.*;
public class Excercise5 {
	static int calculateSum(int num)
	{
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		int number,result=0;
		System.out.println("enter the number :");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		result=calculateSum(number);
		System.out.println(result);
	}
}
