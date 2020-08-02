package B;

import java.util.Scanner;

public class PINsecurity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1,input2,input3;
		input1=sc.nextInt();
		input2=sc.nextInt();
		input3=sc.nextInt();
int i=0,s0=0,s1=0,s2=0,s3=0,r=0,j=0;
int a[]=new int[11];
while(input1!=0)
{
	r=input1%10;
	a[j]=r;
	j++;
	input1=input1/10;
}

while(input2!=0)
{
	r=input2%10;
	a[j]=r;
	j++;
	input2=input2/10;
}

while(input3!=0)
{
	r=input3%10;
	a[j]=r;
	j++;
	input3=input3/10;
}
s0=a[0];
for(i=0;i<j;i=i+3)
{
	if(s0>a[i])
		s0=a[i];
}
s1=a[1];
for(i=1;i<j;i=i+3)
{
	if(s1>a[i])
		s1=a[i];
}
s2=a[2];
for(i=2;i<j;i=i+3)
{
	if(s2>a[i])
		s2=a[i];
}
s3=a[0];
for(i=0;i<j;i++)
{
	if(s3<a[i])
		s3=a[i];
}
int k=s3*1000;
k=k+s2*100;
k=k+s1*10;
k=k+s0;
System.out.print(k);

	}

}
