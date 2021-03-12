package day7;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class student
{
	private int id;
	private String name;
	private String dept;
	public student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}




public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<student,Integer> marklist=new HashMap<student,Integer>();
		marklist.put(new student(1,"sachin","mech"),89);
		marklist.put(new student(1,"sachin","mech"),90);
		marklist.put(new student(3,"ravi","mech"),67);
		
		
		for(Entry<student,Integer> stu:marklist.entrySet())
		{
			System.out.println(stu);
		}

	}

}
