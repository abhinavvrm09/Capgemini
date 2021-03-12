package day5;

public class task2 {

	public static void main(String[] args) {
		String s1="apple";
		for(int i=0;i<s1.length();i++)
		{
			if(i==s1.length()-1)
			{
			System.out.println(s1.charAt(i));
		}
			else
			{
				if(s1.charAt(i)==s1.charAt(i+1))
				{
					
				}
				else
				{
					System.out.println(s1.charAt(i));
				}
			}
		}

	}

}
