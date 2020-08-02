package B;
import java.util.*;
public class mittle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int input1=sc.nextInt();
    int x,r=0,r1=0,i=0,x1,m1=0,m2=0;
    x=input1;
    x1=input1;
    double s=0,k=0;
   
    while(x!=0)
    {
    	r=x%10;
    	s=s+Math.pow(r,r1);
    	r1=r;
    	x=x/10;
    }
    s=s-1;
    while(x1!=0)
    {
    	m1=x1%10;
    	x1=x1/10;
    	break;
    }
    while(x1!=0)
    {
    	m2=x1%10;
    	x1=x1/10;
    	break;
    }
    k=Math.pow(m1,m2);
    s=s+k;
    float f=(float)s;
    long l=(long)f;
    int ans=(int)l;
    System.out.print(ans);
	}

}
