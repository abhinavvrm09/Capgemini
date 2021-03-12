package lab2;
import java.util.Scanner;
public class Excercise1 {

	public static int secondsmallest(int a[],int b)
	{
		int temp;
		for(int i=0;i<b;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		System.out.println("the second smallest element is "+secondsmallest(a,5));

	}

}
