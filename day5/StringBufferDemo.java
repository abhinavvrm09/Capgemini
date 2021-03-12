package day5;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("length: "+sb.length());
		System.out.println("capacity: " +sb.capacity());
		sb.append("hello welcome");
		System.out.println("length: "+sb.length());
		System.out.println("capacity: " +sb.capacity());
		sb.append("to java");
		
		System.out.println("length: " +sb.length());
		System.out.println("capacity: "+sb.capacity());
		
		
	}

}
