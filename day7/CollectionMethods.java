package day7;
import java.util.ArrayList;
public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> o1=new ArrayList<Integer>();
		
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		System.out.println("elements are : "+o1);
		
ArrayList<Integer> o2=new ArrayList<Integer>();
		
		o2.add(3);
		o2.add(4);
		o2.add(100);
		o2.add(101);
		o2.add(102);
		
		System.out.println("elements are : "+o2);
		//o2.addAll(o1);//combines elements of o2 and o1
		//o2.removeAll(o1);// removes common elements in o2 and o1
		o2.retainAll(o1);// common elements between o2 and o1 will be there
		System.out.println("elements are : "+o2);
	}

}
