package A;

class A
{
	public void eat()
	{
		System.out.println("eat");
	}
	public void sleep()
	{
		System.out.println("sleep");
	}
}
class B extends A
{
	public void eat()
	{
		System.out.println("bird eat");
	}
	public void sleep()
	{
		System.out.println("bird sleep");
	}
	public void fly()
	{
		System.out.println("fly");
	}
}
public class Animalbird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A sc=new A();
       ob=new B();
      sc.eat();
      sc.sleep();
      ob.eat();
      ob.sleep();
      ob.fly();
	}

}
