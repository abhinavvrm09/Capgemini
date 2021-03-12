package lab1;
import java.util.*;
public class Excercise3 {
static void fib(int N)
{
	int num1=1,num2=1;
	int totalnum=0;
	
	while(totalnum<N)
	{
		System.out.println(num1+" ");
		
		int num3=num1+num2;
		num1=num2;
		num2=num3;
		totalnum++;
	}
}
public static void main(String args[])
{
	int N=10;
	fib(N);
}
}
