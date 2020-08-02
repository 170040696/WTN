package A;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		i=n;
		while(n!=0)
		{
			r=(r*10)+(n%10);
			n=n/10;
		}
    if(i==r)
    	System.out.print("Palindrome");
    else
    System.out.print("not palindrome");
	}

}
