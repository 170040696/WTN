package C;
import java.util.*;
public class UniqueDigItsCounT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int a[]=new int[1000];
		int i=0,k=0,j=0,c=0,r=0;
		while(input1!=0)
		{
        r=input1%10;
		a[k]=r;
		k++;
		input1=input1/10;
		}
		for(i=0;i<k;i++)
		{
			for(j=i+1;j<k;j++)
			{
				if(a[i]==a[j])
					a[i]=' ';
			}
		}
		for(i=0;i<k;i++)
		{
			if(a[i]!=' ')
				c++;
		}
     System.out.print(c);
	}

}
