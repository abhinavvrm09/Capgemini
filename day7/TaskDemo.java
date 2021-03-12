package day7;
import java.util.ArrayList;
public class TaskDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> o1=new ArrayList<String>();
		o1.add("sachin");
		o1.add("rahul");
		o1.add("amit");
		o1.add("harshit");
		
		ArrayList<String> o2=new ArrayList<String>();
		o2.add("roshan");
		o2.add("varsha");
		o2.add("rahul");
		o2.add("amit");
		o2.add("harshit");
		
		o2.removeAll(o1);
		System.out.println(o2);
		o2.addAll(o1);
		System.out.println(o2);
	}

}
