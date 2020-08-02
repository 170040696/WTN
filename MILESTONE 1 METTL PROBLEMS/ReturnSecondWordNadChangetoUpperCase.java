package C;
import java.util.*;
public class ReturnSecondWordNadChangetoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
String a[]=input1.split(" ");
if(a.length==1)
System.out.print("LESS");
a[1]=a[1].toUpperCase();
System.out.print(a[1]);

	}

}
