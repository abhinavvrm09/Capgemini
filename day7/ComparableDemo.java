package day7;

import java.util.ArrayList;
import java.util.Iterator;
class emp
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

}




public class ComparableDemo {
	
	emp findByDept(emp e,ArrayList<emp> al)
	{
		ArrayList<emp> emp= new ArrayList<emp>();
		if(e.dept.equals("hr"))
			emp.add(e);
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<emp> al=new ArrayList<emp>();
	al.add(new emp(1,"ravi","hr",65000));
	al.add(new emp(2,"anil","developer",65000));
	al.add(new emp(17,"suresh","ui",65000));
	al.add(new emp(4,"kumar","developer",65000));
	
	System.out.println(al);
	
	Iterator<emp> it=al.iterator();
	while(it.hasNext())
	{
		emp e=it.next();
		if(e.dept=="developer")
			System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
	}

	}

}
