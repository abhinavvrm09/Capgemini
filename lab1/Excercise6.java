package lab1;
import java.util.*;
public class Excercise6 {
public static int calculateDifference(int n)
{
	int square=(int)Math.pow(n*(n+1)/2,2);
	int sumsquare=(n*(n+1)*(2*n+1))/6;
	return square=sumsquare;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		
		result=calculateDifference(num);
		System.out.println(result);
	}

}
