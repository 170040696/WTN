package B;

public class except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int k[]= {1,2,3};
			 k[5]= 6;
		try
		{
			int c=10/0;
		}
       catch(Exception e)
		{
    	   System.out.println(e);

   		System.out.println("with try ctach");
		}
		}
		catch(Exception e)
		{
			System.out.println("rathe");
		}
		finally
		{
			System.out.println("AKnaksha");
		}
		System.out.println("will be excuted");
	}

}
