package A;
import java.util.*;

public class SumArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,d,i=0,ans=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
     a=sc.nextInt();
     d=sc.nextInt();
     
     while(i<=n-1)
     {
    	 ans=ans+(a+(i*d));
    	 i++;
    	
     }
     System.out.print(ans);
	}


}
