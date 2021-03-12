package day7;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Lab6Excericse1 {
	
	
	List getValues(HashMap<Integer,Integer> h)
	{
		List l=new ArrayList<>();
		for(Integer values: h.values())
		{
			l.add(values);
		}
		Collections.sort(l);
		return l;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(1,10);
		hm.put(2,15);
		hm.put(3,5);
		Lab6Excericse1 d=new Lab6Excericse1();
		
	}

}
