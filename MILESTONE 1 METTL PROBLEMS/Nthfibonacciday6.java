package C;
import java.util.*;
public class Nthfibonacciday6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int t1=0,t2=1,t3=0;
		int c=2;
		if(input1==1)
			System.out.print(0);
		if(input1==2)
			System.out.print(1);
		while(c!=input1)
		{
			t3=t2+t1;
			t1=t2;
			t2=t3;
			c++;
		}
		System.out.print(t3);

	}

}
