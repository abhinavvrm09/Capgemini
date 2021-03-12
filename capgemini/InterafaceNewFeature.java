package capgemini;

interface college	
{
	void dept();
	default void lab()
	{
		System.out.println("you have to do lab");
	}
}

class mech implements college
{
	public void dept()
	{
		System.out.println("this is mech dept");
	}
	public void lab()
	{
		System.out.println("you have to do lab 1 excericise");
	}
}
public class InterafaceNewFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mech m =new mech();
		m.dept();
		m.lab();
	}

}
