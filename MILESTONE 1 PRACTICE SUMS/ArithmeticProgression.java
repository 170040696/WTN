package A;
import java.util.*;
public class ArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,d,i=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
     a=sc.nextInt();
     d=sc.nextInt();
     
     while(i<=n-1)
     {
    	 System.out.print(a+(i*d)+" ");
    	 i++;
     }
	}

}
