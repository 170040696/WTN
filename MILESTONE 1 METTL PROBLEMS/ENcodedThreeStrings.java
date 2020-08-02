package C;
import java.util.*;
public class ENcodedThreeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
String input2=sc.nextLine();
String input3=sc.nextLine();
int l1=input1.length();
int l2=input2.length();
int l3=input3.length();
String str1="";
String str2="";
String str3="";
String str="";
int a[]={l1,l2,l3};
int i=0;
for(i=0;i<3;i++)
{
   if(i==0)
   str=input1;
   if(i==1)
   str=input2;
   if(i==2)
   str=input3;
int r1=0,r2=0,r3=0;
int q1=0,q2=0,q3=0;
r1=a[i]%3;
q1=a[i]/3;
if(r1==1)
{
 str1=str1+str.substring(0,q1);
 str2=str2+str.substring(q1,(2*q1)+1);
 str3=str3+str.substring((2*q1)+1,a[i]);
}
if(r1==2)
{
	str1=str1+str.substring(0,q1+1);
 str2=str2+str.substring(q1+1,(2*q1)+1);
 str3=str3+str.substring((2*q1)+1,a[i]);
}
if(r1==0)
{
	str1=str1+str.substring(0,q1);
 str2=str2+str.substring(q1,(2*q1));
 str3=str3+str.substring((2*q1),a[i]);
}
}
str3=str3.toUpperCase();
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
	}

}
