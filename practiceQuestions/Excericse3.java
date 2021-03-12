package practiceQuestions;

class NExceptions extends RuntimeException{
	public NExceptions(String s) {
		super(s);
	}
}
class Employee{
	private String firstname;
	private String lastname;
	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public void valiation() throws NExceptions {
		if(firstname==(null) || lastname==(null)) {
			throw new NullPointerException("Entry Missing");
		}
		else if(firstname.length()<3 || lastname.length()<3) {
			throw new NExceptions("minimum should be 3 characters");
		}
		else {
			System.out.println("entered string is "+firstname+" "+lastname);
		}
	}
}
public class Excericse3 {

	public static void main(String[] args) throws NExceptions {
		// TODO Auto-generated method stub
		Employee emp= new Employee("QWQW","IOPI");
		emp.valiation();
	}

}