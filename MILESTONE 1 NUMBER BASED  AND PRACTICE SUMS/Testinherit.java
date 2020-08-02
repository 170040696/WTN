package B;
class A
{
	A()
	{
		System.out.println("empty con A");
	}
	A(int a)
	{
		System.out.println("paramita const A");
	}
}
class B extends A
{
	B()
	{
		super(6);
		System.out.println("empty constru B");
	}
	B(int b)
	{
		System.out.println("paramit constru B");
	}
}
class C extends B
{
	C()
	{
		super();
		System.out.println("empty constru C");
	}
	C(int c)
	{
		System.out.println("paramit constru C");
	}
}
public class Testinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       C ob= new C();
	}

}
