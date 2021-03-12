package day8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class student
{
	int id;
	String name;
	int marks;
	public student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}

class IdComparator implements Comparator<student>
{
	@Override
	public int compare(student o1,student o2)
	{
		if(o1.id==o2.id)
			return 0;
		else if(o1.id>o2.id)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<student>
{
	@Override
	public int compare(student o1,student o2)
	{
		return o1.name.compareTo(o2.name);
	}
}

class MarksComparator implements Comparator<student>
{
	@Override
	public int compare(student o1,student o2)
	{
		if(o1.marks==o2.marks)
			return 0;
		else if(o1.marks>o2.marks)
			return 1;
		else
			return -1;
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> stud=new ArrayList<student>();
		stud.add(new student(1,"kumar",87));
		stud.add(new student(2,"anil",69));
		stud.add(new student(3,"ravi",50));
		
		for(student s:stud)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
			
		}
		System.out.println("sorting by id");
		
		Collections.sort(stud, new IdComparator());
		for(student s:stud)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
			
		}
		
		System.out.println("sorting by name");
		Collections.sort(stud,new NameComparator());
		for(student s:stud)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
			
		}
		
System.out.println("sorting by marks");
		
		Collections.sort(stud, new MarksComparator());
		for(student s:stud)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
			
		}
	}

}
