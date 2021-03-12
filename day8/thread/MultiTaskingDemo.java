package day8.thread;

class megha extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}
class pranav extends Thread
{
	public void run()
	{
		for(int i=10;i<20;i++)
		{
			System.out.println(i);
		}
	}
}
class sneha extends Thread
{
	public void run()
	{
		for(int i=20;i<30;i++)
		{
			System.out.println(i);
		}
	}
}







public class MultiTaskingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		megha m=new megha();
		pranav p=new pranav();
		sneha s=new sneha();
		
		//m.run();
		//p.run();
		//s.run();
		
		m.start();
		p.start();
		s.start();

	}

}
