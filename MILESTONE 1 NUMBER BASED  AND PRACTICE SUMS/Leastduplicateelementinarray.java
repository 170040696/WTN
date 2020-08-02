package B;
import java.util.*;
public class Leastduplicateelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i=0,j=0,c=0,ans=0,l=0;
for(i=0;i<n;i++)
	a[i]=sc.nextInt();
l=a[0];
for(i=0;i<n;i++)
{
	if(l<a[i])
		l=a[i];
}
for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++)
	{
	if(a[i]==a[j])
	{
		c=a[i];
		break;
	}
	}
	if(c!=0) {
	if(c<l)
		l=c;}
}
if(c==0)
	System.out.print(a[0]);
else
System.out.print(l);
	}

}
