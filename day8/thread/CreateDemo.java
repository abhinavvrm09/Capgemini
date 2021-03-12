package day8.thread;

class A extends Thread
{
	public void run()
	{
		System.out.println("this is my class");
	}
}

class B implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("this is my task created by runnable interface");
	}
}


public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A o=new A();
		o.start();
		B o1=new B();
		Thread t1=new Thread(o1);
		t1.start();

	}

}
