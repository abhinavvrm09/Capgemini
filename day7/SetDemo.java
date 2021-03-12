package day7;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s=new HashSet();
		
		s.add(3);
		s.add(3);
		s.add(45);
		s.add("hello");
		s.add("hello");
		s.add(100);
		System.out.println(s);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("hi");
		lhs.add("hello");
		lhs.add("hi");
		lhs.add(45);
		lhs.add(100);
		lhs.add("thank you");
		
		System.out.println(lhs);
		
		TreeSet ts=new TreeSet();
	}

}
