package C;
import java.util.*;
public class OneDigitToBeRemovedTOFormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int n1=input1;
int []a=new int[1000];
int n2=input1,r=0,i=0,c=0,l=0,j=0,k=0;
while(n1!=0)
{
	r=(r*10)+(n1%10);
	n1=n1/10;
}
n2=r;
if(r==input1)
	System.out.print("-1");
else
{
	while(n2!=0)
	{
		r=n2%10;
		a[l]=r;
		l++;
		n2=n2/10;
	}
	for(i=0;i<l;i++)
	{c=0;
	    
	    if(a[i]!=0)
	    {
		for(j=i+1;j<l;j++)
		{
			if(a[i]==a[j])
			{
				c++;
				a[j]=0;
			}
		}
		c=c+1;
		if(c%2!=0)
			k=a[i];
		}
	}
	System.out.print(k);
}

	}
}
