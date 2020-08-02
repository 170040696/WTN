package C;
import java.util.*;
public class SeriesandfindNthelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int N=sc.nextInt();
int d1=b-a;
int d2=c-b;
int n=3;n=n+1;
while(n!=N+1)
{
	if(n%2==0)
	{
		c=c+d1;
	}
	if(n%2!=0)
	{
		c=c+d2;
	}	
	n++;
}
System.out.println(c);
	}
}
