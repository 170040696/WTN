package A;
import java.util.*;
public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,t1=0,t2=1,t3=0,i=2,j,c=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(t3<n)
		{
			t3=t1+t2;
			t1=t2;
			t2=t3;
			if(t3==n)
			{
				System.out.print("YES fibonaci");
				c=1;
				break;
			}
			if(t3>n)
				break;
		}
		if(c==0)
			System.out.print("not fibonacii");
		
	}

}
