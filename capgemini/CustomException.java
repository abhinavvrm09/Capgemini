package capgemini;

class LateException extends RuntimeException
{
	public LateException(String msg)
	{
		super(msg);
	}
}

class Employee
{
	public void login(int time) throws LateException
	{
		if(time<=9)
		{
			System.out.println("u are present");
		}
		else
		{
			throw new LateException("you are absent");
		}
	}
}




public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.login(9);

	}

}
