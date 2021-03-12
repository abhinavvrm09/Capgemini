package day7;

import java.util.ArrayList;
import java.util.ListIterator;	
public class ListIteratiorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> o1=new ArrayList<Integer>();
		
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		ListIterator<Integer> it=o1.listIterator();
		System.out.println("forward direction");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
