package day6;
import java.util.ArrayList;
public class ArrayListDemo {
public static void main(String args[])
{
	ArrayList o=new ArrayList();
	System.out.println("before adding size is " +o.size());
	o.add(1);
	o.add("sachin");
	o.add("ravi");
	o.add(null);
	o.add('c');
	o.add(10.24);
	System.out.println("after adding the size is " +o.size());
	System.out.println("after adding elements " +o);
	
	o.add(2,"hello");
	System.out.println("after adding elements " +o);
	
	o.remove("ravi");
	System.out.println("after removing elements " +o);
	
	o.remove(Integer.valueOf(1));
	System.out.println("after removing elements " +o);
	
	System.out.println(o.contains("ravi"));
	
	o.clear();
	System.out.println("after clearing everything"+o);
}
}
