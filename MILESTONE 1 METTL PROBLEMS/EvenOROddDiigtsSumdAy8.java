package C;
import java.util.*;
public class EvenOROddDiigtsSumdAy8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		int x1=0,r=0,ans=0,rat=0,x2=0;
			while(n!=0)
			{
				r=n%10;
				n=n/10;
				if(r%2==0)
					x1=x1+r;
				if(r%2!=0)
					x2=x2+r;
			}
			if(s.equals("even"))
				System.out.println(x1);
			if(s.equals("odd"))
				System.out.println(x2);
	}

}
