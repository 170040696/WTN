package C;
import java.util.*;
public class WeightofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
int input2=sc.nextInt();
char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
input1=input1.toLowerCase();
char b[]=input1.toCharArray();
int i=0,j=0,s=0,c=0;
for(i=0;i<input1.length();i++)
{
if(b[i]!=' ')
{
 for(j=0;j<26;j++)
 {
	 if(b[i]==a[j])
	 {
      s=s+(j+1);
	 }
 }
}	
}
for(i=0;i<input1.length();i++)
{
if(b[i]!=' ' && b[i]!='a' && b[i]!='e' && b[i]!='i' && b[i]!='o' && b[i]!='u')
{
 for(j=0;j<26;j++)
 {
	 if(b[i]==a[j])
	 {
      c=c+(j+1);
	 }
 }
}	
}
if(input2==0)
	System.out.print(c);
else
	System.out.print(s);

	}

}
