package B;
import java.util.*;
public class countnumberofvowelsandconsnents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int v=0,c=0,i=0;
s=s.toLowerCase();
System.out.println(s);
for(i=0;i<s.length();i++)
{
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		v++;
	else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		c++;
}
System.out.println(v+" "+c);
	}

}
