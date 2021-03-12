package capgemini;

interface eligibility
{
	String checkAge(int age);
}
public class LamdbaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
eligibility e1=(age)->
{
	if(age<18)
		return "you cant vote";
	return "you can vote";
};

System.out.println("result= "+e1.checkAge(19));
	}

}
