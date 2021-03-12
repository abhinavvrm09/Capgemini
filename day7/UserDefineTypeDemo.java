package day7;
import java.util.ArrayList;
import java.util.Iterator;
class employee
{
	int id;
	String name;
	String dept;
	public employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
}





public class UserDefineTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee> emplist=new ArrayList<employee>();
emplist.add(new employee(1,"sachin","hr"));
emplist.add(new employee(2,"ravi","developer"));
emplist.add(new employee(3,"amit","tester"));

System.out.println("employee list :"+emplist);

Iterator<employee> it=emplist.iterator();
while(it.hasNext())
{
	employee e=it.next();
	System.out.println(e.id+" "+e.name+" "+e.dept);
}
	}

}
