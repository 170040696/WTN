package C;
import java.util.*;
public class isPalindromeNUMber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sk=new Scanner(System.in);
int input1=sk.nextInt();
String s=Integer.toString(input1);
StringBuilder sc=new StringBuilder(s);
String rev=(sc.reverse().toString());
if(s.equals(rev))
System.out.print(2);
else
	System.out.print(1);	

	}

}
