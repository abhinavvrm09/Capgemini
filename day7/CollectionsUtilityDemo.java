package day7;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> o1=new ArrayList<String>();
		o1.add("sachin");
		o1.add("rahul");
		o1.add("amit");
		o1.add("harshit");
		
		System.out.println("project1"+o1);
		Collections.sort(o1);
		System.out.println("project 1 after sorting"+o1);
		//Collections.reverse(o1);
		//System.out.println("project 1 after sorting"+o1);
		int index=Collections.binarySearch(o1,"sachin");
		System.out.println(index);
	}

}
