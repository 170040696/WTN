package C;
import java.util.*;
public class FindStringCOde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
input1=input1.toLowerCase();
int l=input1.length();
char a[]=input1.toCharArray();
int d[]=new int[1000];
String str="";
int i=0,k1=0,k2=0,m=0,c1=0,c2=0,c3=0,l1=0,u=0,u1=0;
char b[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
for(i=0;i<l;i++)
{   c3=0;
	if(a[i]==' ')
	{u=i;c3=0;
		for(k1=u1,k2=i-1;k1<k2 && k2>k1;k1++,k2--)
		{    c1=0;c2=0;
			for(m=0;m<26;m++)
			{
				if(b[m]==a[k1]) {
				c1=m+1;}	
				if(b[m]==a[k2]) {
					c2=m+1;}	
			}
			c3=c3+Math.abs(c1-c2);
		}
		if(k1==k2) {
			for(m=0;m<26;m++) {
				if(b[m]==a[k1])
					c3=c3+(m+1);
			   }
				}
			
		d[l1]=c3;
		l1++;
		u1=i+1;
		c3=0;
	}
	if(i==l-1)
	{
		for(k1=u+1,k2=i;k1<k2 && k2>k1;k1++,k2--)
		{    c1=0;c2=0;
			for(m=0;m<26;m++)
			{
				if(b[m]==a[k1]) {
				c1=m+1;}	
				if(b[m]==a[k2]) {
					c2=m+1;}	
			}
			c3=c3+Math.abs(c1-c2);
		}
		if(k1==k2) {
			for(m=0;m<26;m++) {
				if(b[m]==a[k1])
					c3=c3+(m+1);
			   }
				}
			
		d[l1]=c3;
		l1++;
		k1=i+1;
	}
}

   for(i=0;i<l1;i++)
   {
	   str=str+Integer.toString(d[i]);
   }
   int ans=Integer.parseInt(str);
   System.out.print(ans);
}

}
