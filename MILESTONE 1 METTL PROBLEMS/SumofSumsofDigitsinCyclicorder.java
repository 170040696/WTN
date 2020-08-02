package C;
import java.util.*;
public class SumofSumsofDigitsinCyclicorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int r=0,k=0,i=0,j=0,s=0,l=0;
int []b=new int[10000];
while(input1!=0)
{
	r=input1%10;
	b[k]=r;
	k++;
	input1=input1/10;
}
for(i=k-1;i>=0;i--)
{s=0;
	for(j=i;j>=0;j--)
	{
		s=s+b[j];
	}
	l=l+s;
}
System.out.println(l);
	}

}
