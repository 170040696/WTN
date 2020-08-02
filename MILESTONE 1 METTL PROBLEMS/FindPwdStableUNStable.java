package C;
import java.util.*;
public class FindPwdStableUNStable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int input2=sc.nextInt();
int input3=sc.nextInt();
int input4=sc.nextInt();
int input5=sc.nextInt();
int []freq= new int[20];
int []a= {input1,input2,input3,input4,input5};
int i=0,r=0,j=0,s=0,l=0,g=0,le=0,d=0;
for(i=0;i<5;i++)
{d=a[i];
	for(j=0;j<20;j++)
	{
		freq[j]=0;
	}
	while(a[i]!=0)
	{
		r=a[i]%10;
		freq[r]++;
		a[i]=a[i]/10;
	}
	for(j=0;j<20;j++)
	{
	  if(freq[j]!=0)
	  {
		s=freq[j];
		break;
	  }
	}
	for(j=0;j<20;j++)
	{
	  if(freq[j]!=0)
	  {
		if(freq[j]!=s)
			l++;
	  }
	}
	if(l>0)
		g=g+d;
	else
		le=le+d;
	l=0;s=0;
}
return le-g;
	}

}
