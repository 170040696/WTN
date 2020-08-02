package B;
import java.util.*;
public class Firstoccuringduplicateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i=0,j=0,min=n-1,ans=0,k=0;
for(i=0;i<n;i++)
	a[i]=sc.nextInt();k=n;
for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++)
	{
		if(a[i]==a[j])
		{
			if(min>(j-i)) 
			{
				min=j-i;
				ans=a[i];
				k=j;
				break;
				}
		}
	}
}
System.out.print(ans);
	}

}
