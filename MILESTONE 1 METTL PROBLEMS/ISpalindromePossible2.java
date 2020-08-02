package C;
import java.util.*;
public class ISpalindromePossible2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int a[]=new int[10];
int i=0,r=0,c=0;
while(input1!=0)
{
	r=input1%10;
	a[r]++;
	input1=input1/10;
}
for(i=0;i<10;i++)
{
	if(a[i]%2!=0)
	c++;
}
if(c>1)
System.out.print(1);
else
	System.out.print(2);
	}

}
