package lab2;

import java.util.Arrays;
import java.util.Scanner;
public class Excercise3 {
	public static int[] getSorted(int a[])
	{
		StringBuilder string=new StringBuilder();
		for(int i=0;i<a.length;i++)
		{
			string.append(a[i]);
		}
		string.reverse();
		System.out.println(string);
		Arrays.sort(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,array[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		size=sc.nextInt();
		System.out.println("enter the array elements :");
		array=new int[size];
		
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		array=getSorted(array);
		for(int i=0;i<size;i++)
		{
			System.out.print(array);
		}
		
	}

}
