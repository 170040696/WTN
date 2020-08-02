package A;
import java.util.*;
public class Primenumr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int i=0,c=0,j=1,l=0;
       for(i=m;i<n;i++)
       {
    	   c=0;
    	   for(j=1;j<=i;j++)
    	   {
    		   if(i%j==0)
    		      c++;
    	   }
    	   if(c==2)
    		   l++;
       }
       System.out.print(l);
	}

}
