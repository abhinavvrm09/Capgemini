package day7;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		
		System.out.println("the elements are :" +s);
		System.out.println("top element : "+s.peek());// peek gives the top element
		System.out.println("removed element "+s.pop());
		System.out.println("==========================");
		System.out.println("the elements are :" +s);
		System.out.println("top element : "+s.peek());// peek gives the top element
		System.out.println("removed element "+s.pop());
		System.out.println("==========================");
		System.out.println("the elements are :" +s);
		System.out.println("top element : "+s.peek());// peek gives the top element
		System.out.println("removed element "+s.pop());// removes the bottom element
		System.out.println("==========================");
		System.out.println(s);
	}

}
