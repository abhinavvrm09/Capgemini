package capgemini;

interface Vehicle1
{
	void wheel();
}

interface engine
{
	void engine();
}

class bmw implements Vehicle1,engine
{
	public void wheel()
	{
		System.out.println("4 wheel");
	}
	
	public void engine()
	{
		System.out.println("petrol engine");
	}
}
public class InterfaceDemo3 {
public static void main(String args[])
{
	bmw c=new bmw();
	c.engine();
	c.wheel();
}
}
