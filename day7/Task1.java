package day7;
import java.util.Iterator;
import java.util.ArrayList;
class product
{
	int pid;
	String pname;
	double price;
	public product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
    public String toString() {
        return "Product [proID=" + pid + ", name=" + pname + ", price=" + price + "]";
    }
}




public class Task1 {
	public static void main(String[] args)
	{
		ArrayList<product> ai=new ArrayList<product>();
		ai.add(new product(1,"prod1",300));
		ai.add(new product(2,"prod2",200));
		ai.add(new product(3,"prod3",100));
		
		Iterator<product> it=ai.iterator();
		while(it.hasNext())
		{
			product p=it.next();
			if(p.price<200)
			{
				System.out.println(p);
			}
			
		}
	}


}
