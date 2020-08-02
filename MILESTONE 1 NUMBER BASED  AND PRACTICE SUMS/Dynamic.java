package B;
class aka
{
	public void disp()
	{
		System.out.println("aka");
	}
	public void rat()
	{
		System.out.println("rat");
	}
}
class sus extends aka
{
	public void disp()
	{
		super.disp();
		System.out.println("sus");
	}
}
public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aka a=new aka();
		sus s=new sus();
		aka d=new sus();
		aka o;
		o=d;
		o.disp();
	}

}
