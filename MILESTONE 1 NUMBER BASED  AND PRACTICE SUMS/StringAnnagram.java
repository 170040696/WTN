package B;
import java.util.*;
public class StringAnnagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
String str1 = s1.replaceAll("\\s", ""); 
String str2 = s2.replaceAll("\\s", "");
str1=str1.toLowerCase();
str2=str2.toLowerCase();
int i=0;
int l1=str1.length();
int l2=str2.length();
char a1[]=str1.toCharArray();
char a2[]=str2.toCharArray();
Arrays.sort(a1);
Arrays.sort(a2);
boolean k=true;
if(l1!=l2)
	k=false;

else if(Arrays.equals(a1, a2));
k=true;
if(k==false)
	System.out.print("not annagram");
else
	System.out.print("annagram");
	}

}
