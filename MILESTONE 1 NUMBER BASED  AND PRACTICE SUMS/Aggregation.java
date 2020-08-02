package B;
class Address
{
	private String country;
	private String state;
	public String getcountry() {
		return country;
	}
	public void setcountry(String country)
	{
		this.country=country;
	}
	public void setstate(String state)
	{
		this.state=state;
	}
	public String getstate()
	{
		return state;
	}
}
class Employe
{
	private int n;
	private String empname;
	private Address addr;
	public void setn(int n)
	{
		this.n=n;
	}
	public int getn()
			{
		return n;
			}
	public void setempname(String empname)
	{
		this.empname=empname;
	}
	public String getempname()
	{
		return empname;
	}
	public void setAddr(Address addr)
	{
		this.addr=addr;
	}
	public Address getAddr()
	{
		return addr;
	}
}
public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address();
		ad.setcountry("india");
		ad.setstate("andhra");
		Employe sc=new Employe();
		sc.setn(10);
		sc.setempname("ratnesh");
		sc.setAddr(add);

	}

}
