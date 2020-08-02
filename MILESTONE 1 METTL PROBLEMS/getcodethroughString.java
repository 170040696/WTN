package C;
import java.util.*;
public class getcodethroughString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
int l=input1.length();
char a[]=input1.toCharArray();
int i=0,c=0,s=0;
while(i!=l)
{
  c++;
  if(a[i]==' ')
  {
	  s=s+(c);
	  c=0;
  }
  i++;
}
System.out.print(s);
		}

}
