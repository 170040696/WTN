package C;
import java.util.*
;public class DecreasingSequencingArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input2=sc.nextInt();
int []input1= new int[input2];
int i=0,j=0,k=0,c=0,s=0,l1=0,l2=0,m=0;
for(i=0;i<input2;i++)
{
	input1[i]=sc.nextInt();
}
for(i=j;i<input2;i++)
{k=input1[i];c=0;
	for(j=i+1;j<input2;j++)
	{
		if(k>input1[j])
		{
			k=input1[j];
			c++;
		}
		else
			break;
	}
	if(c>0)
		m++;
	if(s<c)
	{
		s=c;
	l1=i;l2=j-i;
	}
	i=j-1;
}
System.out.println(m);
System.out.println(l2);
	}

}
