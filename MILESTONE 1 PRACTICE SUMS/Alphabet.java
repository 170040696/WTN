package A;
import java.util.*;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r=0,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n!=0)
		{
			r=(r*10)+(n%10);
			n=n/10;
		}
		while(r!=0)
		{
			j=r%10;
			r=r/10;
			if(j==0)
				System.out.print("ZERO ");
			if(j==1)
				System.out.print("ONE ");
			if(j==2)
			   System.out.print("TWO ");
			if(j==3)
				System.out.print("THREE ");
			if(j==4)
	          System.out.print("FOUR ");	
	        if(j==5)
	      	System.out.print("FIVE "); 							 								
	      		if(j==6)
	      	System.out.print("SIX ");
	      			if(j==7)
	      		System.out.print("SEVEN ");
	      			if(j==8)
	    				System.out.print("EIGHT ");
	      			if(j==9)
	    				System.out.print("NINE ");
		}
	}

}
