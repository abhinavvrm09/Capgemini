package practiceQuestions;
import java.util.*;
class Fruit
{
	String name;
	String taste;
	
	public void eat()
	{
		System.out.println("the fruit is "+name+"tastes "+taste);
	}
	
}
class apple extends Fruit
{
	String name="apple";
	String taste="sweet";
	@Override
	public void eat() {
		System.out.println("the fruit is "+ name +" tastes "+ taste);
	}
	
}

class orange extends Fruit
{
	String name="orange";
	String taste="sour";
	@Override
	public void eat()
	{
		System.out.println("the fruit is "+ name +" tastes "+ taste);
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Fruit a=new apple();
		a.eat();
		Fruit o=new orange();
		o.eat();

	}

}
