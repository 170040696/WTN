package C;
import java.util.*;
public class NOnrepeatedDIGItsCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []b=new int[10];
int i=0,r=0,c=0;
for(i=0;i<10;i++) {
b[i]=0;}
while(n!=0)
{
	r=n%10;
	b[r]++;
	n=n/10;
}
for(i=0;i<10;i++)
{
	if(b[i]==1)
	c++;
}
System.out.print(c);

	}

}
