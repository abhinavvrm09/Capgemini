package day5;

public class Mutabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		System.out.println("s1="+s1);
		
		s1.concat("welcome to java");
		System.out.println("s1="+s1);
		
		s1=s1.concat("thank you");
		System.out.println("s1="+s1);

	}

}
