package practiceQuestions;

public class Excercise4 {
	public static String string(String a,String b)
	{
		char a1[]=a.toCharArray();
		char b1[]=b.toCharArray();
		int size;
		String s="";
		int i=0;
		if(a.length()<b.length())
		{
			size=a.length();
		}
		else
		{
			size=b.length();
		}
		for( i=0;i<size;i++)
		{
			s=s+a1[i];
			s=s+b1[i];
		}
		if(size==a.length())
		{
			for(int j=i;i<b.length();i++) {
				s+=b1[i];
			}
		}
		else {
			for(int j=i;i<a.length();i++) {
				s+=a1[i];
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(string("Hi","There"));

	}

}
