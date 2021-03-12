package capgemini;
import java.util.*;
public class ArrayDemo {
	public static void main(String args[])
	{
		int child=0,adult=0,senior=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int age[]=new int[size];
		
		for(int i=0;i<age.length;i++)
		{
			System.out.println("enter the age of passenger" +(i+1));
			age[i]=sc.nextInt();
		}
		for(int i=0;i<age.length;i++)
		{
			System.out.print(age[i]);
		}
		
		for(int i=0;i<age.length;i++)
		{
			if(age[i]<18)
			{
				
				++child;
			}
			else if(age[i]>18 && age[i]<50)
			{
				
				++adult;
			}
			else
			{
				
				++senior;
			}
			
		}
		System.out.println("the count of child is :" +child);
		System.out.println("the count of adult is :" +adult);
		System.out.println("the count of senior is :" +senior);
	}
}
