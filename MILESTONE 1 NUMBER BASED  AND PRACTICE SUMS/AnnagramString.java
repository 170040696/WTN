package B;
import java.util.*;
public class AnnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
s1=s1.replaceAll("\\s","");
s2=s2.replaceAll("\\s","");
s1=s1.toLowerCase();
s2=s2.toLowerCase();
char str1[]=s1.toCharArray();
char str2[]=s2.toCharArray();
Arrays.sort(str1);
Arrays.sort(str2);
boolean k=true;
if(s1.length()!=s2.length())
	k=false;
else
{
k=Arrays.equals(str1,str2);	
}
if(k==false)
	System.out.print("not annagram");
else
	System.out.print("annagram");
	}

}
