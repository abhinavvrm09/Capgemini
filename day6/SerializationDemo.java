package day6;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

class Employee implements Serializable
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Employee emp=new Employee(1,"sachin");
		FileOutputStream fos=new FileOutputStream("Four.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		System.out.println("serialization completed..");

	}

}
