package C;
import java.util.*;
public class NonRepetedDiGItsCountDay7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int r=0,k=0,c=0,i=0,j=0,ans=0;
int a[]=new int[1000];
while(input1!=0)
{
	r=input1%10;
	a[k]=r;
	k++;
	input1=input1/10;
}
for(i=0;i<k;i++)
{c=0;
if(a[i]!=' ') 
{
	for(j=i+1;j<k;j++)
	{
		if(a[i]==a[j]) 
		{
         c++;
         a[j]=' ';
		}
	}
	if(c==0)
	ans++;
}
}
System.out.print(ans);
	}

}
