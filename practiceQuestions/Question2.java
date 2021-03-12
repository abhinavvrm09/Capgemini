package practiceQuestions;
class shape
{
	public void draw()
	{
		System.out.println("Drawing shape");
	}
	public void erase()
	{
		System.out.println("Erasing shape");
	}
	
}

class circle extends shape
{
	@Override
	public void draw()
	{
		System.out.println("drawing circle");
	}
	@Override
	public void erase()
	{
		System.out.println("erasing cirlce");
	}
}

class triangle extends shape
{
	@Override
	public void draw()
	{
		System.out.println("drawing traingle");
	}
	@Override
	public void erase()
	{
		System.out.println("erasing traingle");
	}
}

class Square extends shape {
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	@Override
	public void erase() {
		System.out.println("Erasing Square");
	}

}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape cir=new circle();
		shape tri=new triangle();
		shape square=new Square();
		
		cir.draw();
		cir.erase();
		tri.draw();
		tri.erase();
		square.draw();
		square.erase();
	}

}
