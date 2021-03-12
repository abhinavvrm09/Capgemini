package day6;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("three.txt");
		String msg="hello";
		fos.write(67);
		fos.write('a');
		fos.flush();
		fos.close();
		
	}

}
