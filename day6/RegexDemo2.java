package day6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystring="hello123@java";
		System.out.println("string="+mystring);
		Matcher m1=Pattern.compile("[abc]").matcher(mystring);
		while(m1.find())
		{
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
		System.out.println("except a,b,c");
		Matcher m2=Pattern.compile("[^abc]").matcher(mystring);
		while(m2.find())
		{
			System.out.println(m2.start()+" "+m2.end()+" "+m2.group());
		}
		
		System.out.println("a-z");
		Matcher m3=Pattern.compile("[a-z]").matcher(mystring);
		while(m3.find())
		{
			System.out.println(m3.start()+" "+m3.end()+" "+m3.group());
		}
		
		System.out.println("digit");
		Matcher m4=Pattern.compile("\\d").matcher(mystring);
		while(m4.find())
		{
			System.out.println(m4.start()+" "+m4.end()+" "+m4.group());
		}
		
		
		System.out.println("digit");
		Matcher m5=Pattern.compile("\\w").matcher(mystring);
		while(m5.find())
		{
			System.out.println(m5.start()+" "+m5.end()+" "+m5.group());
		}
		
		System.out.println("digit");
		Matcher m6=Pattern.compile(".").matcher(mystring);
		while(m6.find())
		{
			System.out.println(m6.start()+" "+m6.end()+" "+m6.group());
		}
		
	}
	

}
