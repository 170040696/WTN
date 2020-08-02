package B;
import java.util.Scanner;
public class ExceptQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        try {
        	System.out.println("enter an integer");
        	String str=sc.next();
        	int num=Integer.parseInt(str);
        	System.out.println("the sqr of the number"+(num*num));
        	System.out.println("The work has been done successfully");
        }
        catch(NumberFormatException e)
        {
        	System.out.println("enter input is not a valid format for an integer");;
        }
	}

}
