package practiceQuestions;
import java.util.*;
public class Question5 {
	public String string(String str,int n)
	{
		String sr = str.substring(str.length()-n);
		String result = "";
		int num = n;
		while (num>0) {
			result += sr;
			num--;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question5 q=new Question5();
		Scanner sc=new Scanner(System.in);
		String str;
		int n;
		System.out.println("enter the string");
		str=sc.nextLine();
		
	System.out.println("enter the size");
	n=sc.nextInt();
	
	String result=q.string(str, n);
	System.out.println("the result is :" +result);
	}

}
