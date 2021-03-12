package day7;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> o2=new ArrayList<Integer>();
		
		o2.add(3);
		o2.add(4);
		o2.add(1);
		o2.add(2);
		o2.add(5);
		System.out.println("elemnets"+o2);
		Iterator<Integer> it=o2.iterator();
		while(it.hasNext())
		{
			int num=it.next();
			if(num<3)
			{
				it.remove();
				System.out.println(num);
			}
		}
		System.out.println("elements are :"+o2);
	}

}
