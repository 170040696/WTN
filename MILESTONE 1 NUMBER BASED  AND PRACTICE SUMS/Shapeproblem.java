package B;
class Shape
{
	public void draw()
	{
		System.out.println("DRawing shape");
	}
  public void erase()
  {
	  System.out.println("Erasing shape");
  }
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}
	public void erase()
	{
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing triangle");
	}
	public void erase()
	{
		System.out.println("erasing trianglr");
	}
}
class Square extends Shape
{
	public void draw()
	{
		System.out.println("Drawing square");
	}
	public void erase()
	{
		System.out.println("derasind square");
	}
}
public class Shapeproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		Triangle t=new Triangle();
		Circle c=new Circle();
		s.draw();
       s.erase();
       t.draw();
       t.erase();
       c.draw();
       c.erase();
	}

}
