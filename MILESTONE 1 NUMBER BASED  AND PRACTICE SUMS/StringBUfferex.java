package B;
import java.util.*;
public class StringBUfferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rat="hi akanksha is a";
		String nagu="kanksha";
		int l2=nagu.length();
		StringBuffer sb=new StringBuffer(rat);
		StringBuffer sk=new StringBuffer(nagu);
			for(int v=0;v<v+l2;v++)
			  {
			    if(sb.substring(v,v+l2)==sk)
			    	sb.replace(v,v+l2,"");
			  }
		


StringBuffer s1=new StringBuffer("hai HELLOW PLease");
String s2="";
for(int i=0;i<s1.length();i++)
{
	if(Character.isLowerCase(s1.charAt(i)))
	{
		s2=s2+Character.toUpperCase(s1.charAt(i));
	}
	else
		s2=s2+Character.toLowerCase(s1.charAt(i));
}
String s3="A2b10Gfk";
int l3=s3.length();
String s4="";
for(int i=0;i<l3;i++)
{
	if(Character.isLetter(s3.charAt(i)))
	{
		if(Character.isLowerCase(s3.charAt(i)))
		{
			s4=s4+Character.toUpperCase(s3.charAt(i));
		}
		else
		{
			s4=s4+Character.toLowerCase(s3.charAt(i));
		}
	}
}
System.out.print(s4);
System.out.println();
StringBuffer s5=new StringBuffer(s4);
s5.reverse();
System.out.print(s5);
System.out.println();
String s6="";
for(int i=0;i<s5.length();i++)
{
	if(i%2==0)
	{
		s6=s6+s5.charAt(i);
		
	}
}
System.out.print(s6);
System.out.println();
int a2[]= {1,11,13,5,8,16};
Arrays.sort(a2);
for(int i=0;i<a2.length;i++)
{
	System.out.print(a2[i]+" ");
}
String k="sushmaakanksha";
StringBuffer ss=new StringBuffer(k);
ss.reverse();
if(k.equals(ss))
	System.out.print("yes");
else
	System.out.print("no");
	}
	
//small value in array
	
}
