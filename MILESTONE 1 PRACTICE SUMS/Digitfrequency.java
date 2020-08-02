package A;

import java.util.Scanner;

public class Digitfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r=0,i=0,d;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		d=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			if(r==d)
				i=i+1;
		}
System.out.print(i);
	}

}
