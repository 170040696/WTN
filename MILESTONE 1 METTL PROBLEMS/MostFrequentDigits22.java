package C;
import java.util.*;
public class MostFrequentDigits22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int input2=sc.nextInt();
int input3=sc.nextInt();
int input4=sc.nextInt();
int i=0,r=0,j=0,m=0;
int f[]=new int[10];
 int a[]=new int[1000];
 if(input1==0 && input2==0 && input3==0 && input4==0 )
 System.out.print(0);
 if(input1==0)
 f[0]++;
 if(input2==0)
 f[0]++;
 if(input3==0)
 f[0]++;
 if(input4==0)
 f[0]++;
 while(input1!=0)
 {
 r=input1%10;
 a[i]=r;
 i++;
 input1=input1/10;
 }
 while(input2!=0)
 {
 r=input2%10;
 a[i]=r;
 i++;
 input2=input2/10;
 }
 while(input3!=0)
 {
 r=input3%10;
 a[i]=r;
 i++;
 input3=input3/10;
 }
 while(input4!=0)
 {
 r=input4%10;
 a[i]=r;
 i++;
 input4=input4/10;
 }
 for(j=0;j<i;j++)
 {
	 f[a[j]]++;
 }
 int l=f[0];
 m=0;
 for(j=0;j<10;j++)
 {
	if(f[j]==l)
	{
		if(j>m)
		m=j;
	}
	if(f[j]>l)
	{
		m=j;
		l=f[j];
	}
 }
 System.out.print(m);

	}

}
