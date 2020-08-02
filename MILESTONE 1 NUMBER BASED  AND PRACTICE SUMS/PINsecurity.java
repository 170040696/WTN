package B;
import java.util.*;
public class PINsecurity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1,input2,input3;
		input1=sc.nextInt();
		input2=sc.nextInt();
		input3=sc.nextInt();
int i=0,s0=0,s1=0,s2=0,s3=0;
String s=Integer.toString(input1);
s=s+Integer.toString(input2);
s=s+Integer.toString(input3);
int l=s.length();
char str[]=s.toCharArray();
s0=str[2];
for(i=2;i<l;i=i+3)
{
if(s0>str[i])
s0=str[i];
}
char n1=(char)s0;
s1=str[1];
for(i=1;i<l;i=i+3)
{
if(s1>str[i])
s1=str[i];
}
char n2=(char)s1;
s2=str[0];
for(i=0;i<l;i=i+3)
{
if(s2>str[i])
s2=str[i];
}
char n3=(char)s2;
s3=str[0];
for(i=0;i<l;i++)
{
if(s3<str[i])
s3=str[i];
}
char n4=(char)s3;
System.out.print(n4);
System.out.print(n3);
System.out.print(n2);
System.out.print(n1);
}
}