package day6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("a");// it finds for a
		Pattern p2=Pattern.compile("[abc]");// either a or b or c
		
		Matcher m1=p2.matcher("sachin");
		
		while(m1.find())
		{
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}

	}

}
