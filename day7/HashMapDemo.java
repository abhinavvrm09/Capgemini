package day7;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("sachin","sachin is a batsman");
		hm.put("rahul","rahul is a wicket keeper");
		hm.put("bumrah", "bumhrah is a bowler");
		System.out.println("hashmap" +hm);
		
		hm.replace("sachin","retired");
		System.out.println("hashmap after replace: "+hm);
		
		hm.remove("bumrah");
		System.out.println("after removing hashmap"+hm);
	}

}
