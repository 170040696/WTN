package A;

import java.util.Scanner;

class Fibonacci {
 public int fib(int n)
 {
	 int t1=1,t2=1,t3=0,k=2;
	 while(k<=n-1)
	 {
	 t3=t1+t2;
	 t1=t2;
	 t2=t3;
	 k++;
	 }
	 return t3;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci ob=new Fibonacci();
	
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
     System.out.print(ob.fib(s));
	}

}
