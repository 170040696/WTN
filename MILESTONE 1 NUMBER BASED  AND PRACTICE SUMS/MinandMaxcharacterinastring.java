package B;
import java.util.*;
public class MinandMaxcharacterinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
s=s.toLowerCase();
String s1=s.replaceAll("\\s","");
int freq[]=new int[26];
int i=0,j=0,c=0;
for(i=0;i<s1.length();i++)
{
	freq[s1.charAt(i)-'a']++;
}
i=0;
c=freq[0];
int lar=freq[0];
char m=0;
char m2=0;
for(i=0;i<26;i++)
{
	if(freq[i]!=0)
	{
	if(freq[i]<c)
	{
		c=freq[i];
     m=(char)(i+97);
	}
	if(freq[i]>lar)
	{
		lar=freq[i];
		m2=(char)(i+97);
	}
	}
}
System.out.print(c+" "+m);
System.out.print(lar+" "+m2);

	}

}
