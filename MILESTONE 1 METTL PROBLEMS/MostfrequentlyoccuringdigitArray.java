package C;
import java.util.*;
public class MostfrequentlyoccuringdigitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input2=sc.nextInt();
int []input1=new int[input2];
int i=0,j=0,r=0,k=0,c=0,s=0,ans=0;
int []b=new int[10000];
for(i=0;i<input2;i++)
{
	input1[i]=sc.nextInt();
}
for(i=0;i<input2;i++)
{
while(input1[i]!=0)
{
	r=input1[i]%10;
	b[k]=r;
	k++;
    input1[i]=input1[i]/10;
}
}
for(i=0;i<k;i++)
{
	for(j=i+1;j<k;j++)
	{
		if(b[i]==b[j])
			c++;
	}
	if(s<c)
	{
		s=c;
		ans=b[i];
	}
	if(s==c)
	{
		if(b[i]>ans)
			ans=b[i];
	}
}
System.out.print(ans);
	}

}
