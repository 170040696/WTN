package B;
import java.util.*;
public class SwapingoftwowordsInasentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String arr[]=s.split(" ");
String a=arr[0];
String b=arr[arr.length-1];
a=a+b;
b=a.substring(0,a.length()-b.length());
a=a.substring(b.length(),a.length());
System.out.print(a+" "+b);
	}
}
