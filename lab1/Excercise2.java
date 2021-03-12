package lab1;
import java.util.*;
public class Excercise2 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the color");
	String color=sc.next();
	
	if(color.equals("red"))
	{
		System.out.println("stop");
	}
	else if(color.equals("yellow"))
	{
		System.out.println("Ready");
	}
	else
	{
		System.out.println("Go!");
	}
}
}
