package B;

public class except3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try
  {
	  int c=46/0;
	  try {
		  
		  int b=32/2;
		  System.out.println("ARuithmatic exception");
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("arthimetic");
	  }
	  try {
		  int a[]=new int[5];
		  
		  a[5]=3;
		  
	  }catch(Exception e) {
		  System.out.println(e);
		  System.out.println("ARraye elemnets");
	  }
  }
	  catch(Exception e)
	  {
		  System.out.println("exception caught");
	  }
	  System.out.println("out side parent");

	  
	}

}
