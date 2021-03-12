package practiceQuestions;
import java.util.*;
public class Question6 {
	public String repeatFront(String str, int n) {
		String result = "";
		while(n>0) {
			result += str.substring(0, n--);
		}
		return result;
	}
	public static void main(String[] args) {
		Question6 ob = new Question6();
		Scanner sc = new Scanner(System.in);
		String str;
		int size;
		System.out.println("Enter String");
		str = sc.nextLine();
		System.out.println("enter the size");
		size = sc.nextInt();
		String res = ob.repeatFront(str, size);
		System.out.println("Result: "+res);
		sc.close();
	}

}

