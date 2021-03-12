package day8;

import java.util.ArrayList;
import java.util.Collections;

class emp implements Comparable<emp>
{
	int id;
	String name;
	String dept;
	int salary;
	public emp(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(emp o)
	{
		if(id==o.id)
		{
			return 0;
		}
		else if(id>o.id)
		{
			return 1;
		}
		return -1;
	}
}

public class ComparableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<emp> al=new ArrayList<emp>();
		al.add(new emp(1,"ravi","hr",65000));
		al.add(new emp(2,"anil","developer",65000));
		al.add(new emp(17,"suresh","ui",65000));
		al.add(new emp(4,"kumar","developer",65000));
		System.out.println("before sorting");
		for(emp e:al)
		{
			System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
		}
		Collections.sort(al);
		
		System.out.println("after sorting");
		for(emp e:al)
		{
			System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
		}

	}

}
