package C;

import java.util.Scanner;

public class PINsecurity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1,input2,input3;
		input1=sc.nextInt();
		input2=sc.nextInt();
		input3=sc.nextInt();

		int a[]=new int[10000];
		int i=0,j=0,r=0,n1=0,n2=0,n3=0,n4=0;
		String s="";
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
		n1=a[0];
     for(j=0;j<i;j++)
	{
		if(a[j]>n1)
		n1=a[j];
	}
		s=s+Integer.toString(n1);
		  n4=a[2];
   for(j=2;j<i;j=j+3)
   {
	   if(a[j]<n4)
	   n4=a[j];
   }
		s=s+Integer.toString(n4);
   
   n3=a[1];
   for(j=1;j<i;j=j+3)
   {
	   if(a[j]<n3)
	   n3=a[j];
   }
   	s=s+Integer.toString(n3);
	   n2=a[0];
   for(j=0;j<i;j=j+3)
   {
	   if(a[j]<n2)
	   n2=a[j];
   }
   	s=s+Integer.toString(n2);
	   int k=Integer.parseInt(s);
 System.out.print(k);
	}

}
