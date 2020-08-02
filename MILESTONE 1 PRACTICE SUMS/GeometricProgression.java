package A;

import java.util.Scanner;

public class GeometricProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,r,i=1;
		double k=0;
     	Scanner sc=new Scanner(System.in);
     	a=sc.nextInt();
     	r=sc.nextInt();
     	n=sc.nextInt();
     	System.out.print(a+" ");
     	while(i<=n-1)
     	{
     		k=Math.pow(r,i);
     		 float f=(float)k;
       	   long l=(long)f;
       	   int s=(int)l;
       	  
     	System.out.print(a*s+" ");i++;
     	
     	}
	}

}
