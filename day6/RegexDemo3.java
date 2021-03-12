package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mystring="aaabbaa";
		System.out.println("string="+mystring);
		Matcher m1=Pattern.compile("[a]").matcher(mystring);
		while(m1.find())
		{
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}

	}

}
