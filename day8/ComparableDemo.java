package day8;
import java.util.ArrayList;
import java.util.Iterator;
class employee
{
	int id;
	String name;
	String dept;
	int salary;
	public employee(int id, String name, String dept, int salary) {
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
	
	employee findByDept(employee e,ArrayList<employee> al)
	{
		ArrayList<employee> emp= new ArrayList<employee>();
		if(e.dept.equals("hr"))
			emp.add(e);
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<employee> al=new ArrayList<employee>();
	al.add(new employee(1,"ravi","hr",65000));
	al.add(new employee(2,"anil","developer",65000));
	al.add(new employee(17,"suresh","ui",65000));
	al.add(new employee(4,"kumar","developer",65000));
	
	System.out.println(al);
	
	Iterator<employee> it=al.iterator();
	while(it.hasNext())
	{
		employee e=it.next();
		if(e.dept=="developer")
			System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
	}

	}

}
