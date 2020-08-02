package B;
class Person
{
	int n=10;
	void m()
	{
		System.out.println("m");
	}
}
class Employ extends Person
{
	int n=20;
  
	void m()
	{
		super.m();
		System.out.println("n");
	}
	void n()
	{
		System.out.println(super.n);
		System.out.println("over");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ ob=new Employ();
		ob.m();
		ob.n();
		
	}

}
