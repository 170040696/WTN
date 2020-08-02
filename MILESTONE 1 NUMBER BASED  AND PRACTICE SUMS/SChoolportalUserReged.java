package B;
class InvalidCountaryException extends Exception
{
	InvalidCountaryException()
	{
		System.out.println("invalid");
	}
	InvalidCountaryException(String s)
	{
System.out.println(s);
	}
}
public class SChoolportalUserRegistraction {

	void registerUser(String uname,String ucountry) throws InvalidCountaryException
	{
		if(!ucountry.contentEquals("india"))
				{
					throw new InvalidCountaryException("User Outside India  cannot be registered");
				}
					else
					{
						System.out.println("user registration done succesfuly");
					}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SChoolportalUserRegistraction usr=new SChoolportalUserRegistraction();
		try
		{
			usr.registerUser("akanksha","india");
		}
		catch(InvalidCountaryException e)
		{
			System.out.println(e);
		}
	}

}
