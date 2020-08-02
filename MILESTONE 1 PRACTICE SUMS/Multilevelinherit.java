package A;

class A
{ 
	A()
	{
		System.out.println("A is no argument");
	}
	A(int a)
	{
		System.out.println("constructor A has argument");
	}
}
class B extends A
{
	B()
	{
		System.out.println("b1 has no argument");
	}
	B(int x)
	{
		super(10);
		System.out.println("constructor B has argument");	
	}
}
class C extends B
{
	C()
	{
		System.out.println("c1 has no argumentd");
	}
	C(String b)
	{
		super(100);
		System.out.println("c class has string");
	}
}
public class Multilevelinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 C ob=new C("aknksha");
		
		
	}

}
