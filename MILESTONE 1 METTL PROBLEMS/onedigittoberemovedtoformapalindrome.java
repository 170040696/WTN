package C;
import java.util.*;
public class onedigittoberemovedtoformapalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int k=input1,r=0,i=0,j=0;
int h[]=new int[10];
while(input1!=0)
{
	r=(r*10)+(input1%10);
	input1=input1/10;
}
if(k==r)
System.out.print(-1);
else
{
   while(k!=0)
   {
	   h[k%10]++;
	   k=k/10;
   }
}
for(i=0;i<10;i++)
{
	if(h[i]%2==1)
	j=i;
}
System.out.print(j);
	}

}
