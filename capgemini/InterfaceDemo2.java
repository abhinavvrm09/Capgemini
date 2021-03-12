package capgemini;

interface vehicle
{
	abstract int noOfWheels();
}

class car implements vehicle
{
	public int noOfWheels()
	{
		return 4;
	}
}

class bike implements vehicle
{
	public int noOfWheels()
	{
		return 2;
	}
}

class bus implements vehicle
{
	public int noOfWheels()
	{
		return 8;
	}
}



public class InterfaceDemo2 {
public static void main(String args[])
{
	vehicle v=new bus();
	System.out.println(v.noOfWheels());
}
}
