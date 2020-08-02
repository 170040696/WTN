package A;

import java.util.Scanner;
import java.lang.Math;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		int n,i=0,t,c=0,r=0;
		double p=0;
		n=sc.nextInt();
		t=n;
		int z=n;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		while(z!=0)
		{
			r=z%10;
			z=z/10;
			p=p+(Math.pow(r, c));
		}
		if(p==t)
			System.out.println(t+" is An Amstrong number");
		else
			System.out.println(t+" is not an Amstrong number");
        
	}

}
