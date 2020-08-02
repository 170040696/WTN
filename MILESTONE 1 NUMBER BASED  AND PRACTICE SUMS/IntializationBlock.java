package B;
class c
{
	int o=10;
	public void k()
	{
		System.out.println("k");
	}
	c()
	{
		System.out.println("c");
	}
	{
		System.out.println("initialization block c");
	}
}
class d extends c
{
	public void k()
	{
		super.k();
		System.out.println("t");
	}
	public void l()
	{
		System.out.println(super.o);
	}
	d()
	{
		System.out.println("d");
	}
	{
		System.out.println("initialization block d");
	}
}
public class IntializationBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    d s=new d();
   s.k();
   s.l();
	}

}
