package day6;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("four.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Employee e=(Employee)ois.readObject();
		System.out.println(e.id+" "+e.name);

	}

}
