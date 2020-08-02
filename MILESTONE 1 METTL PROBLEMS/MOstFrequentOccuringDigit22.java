package C;
import java.util.*;
public class MOstFrequentOccuringDigit22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input2=sc.nextInt();
int input1[]=new int[input2];
int i=0;
for(i=0;i<input2;i++)
{
	input1[i]=sc.nextInt();
}
int j=0,k=0,r=0,m=0;
int b[]=new int[10];
for(i=0;i<input2;i++)
{
	k=input1[i];
	while(k!=0)
	{
      r=k%10;
	  b[r]++;
	  k=k/10;
	}
}
int s=b[0];
m=0;
for(i=0;i<10;i++)
{
if(s<b[i])
{
  s=b[i];
}
if(s==b[i])
{
	if(m<i)
	m=i;
}
}
System.out.print(m);
	}

}
