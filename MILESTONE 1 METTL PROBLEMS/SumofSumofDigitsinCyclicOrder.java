package C;
import java.util.*;
public class SumofSumofDigitsinCyclicOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int x=input1;
int i=0,s=0,c=0,r=0,j=0;
int a[]=new int[10000];
while(x!=0)
{
  r=x%10;
 a[i]=r;
 i++;
 x=x/10;
}
while(i>=0)
{
for(j=0;j<i;j++)
{
s=s+a[j];
}
i--;
   }
    System.out.print(s);
 
	}

}
