package C;
import java.util.*;
public class FindStringCode22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
input1=input1.toLowerCase();
String b[]=input1.split(" ");
String ans="";
int i=0,j=0,k=0,l=0,m=0,s=0,t=0,d=0;
for(i=0;i<b.length;i++)
{d=0;
	   char c[]=b[i].toCharArray();
 l=b[i].length();
 for(j=0,k=l-1;j<k&&k>j;j++,k--)
	{
   for(m=0;m<26;m++)
	  {
		  if(a[m]==c[j])
          {
				 s=m+1;
			 }
			 if(a[m]==c[k])
          {
				 t=m+1;
			 }
	  }
	  d=d+(int)Math.abs(s-t);
	}
	if(j==k)
	{
		for(m=0;m<26;m++)
		{
			if(a[m]==c[j])
			d=d+(m+1);
		}
	}
	ans=ans+Integer.toString(d);
}
int n1=Integer.parseInt(ans);
System.out.print(n1);
	}

}
