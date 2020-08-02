package A;
import java.util.*;
public class usinghashtablefindfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0,j=0;
		int []a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int []f=new int[10];
		for(i=0;i<n;i++)
		{
			f[a[i]]++;
		}
		for(i=0;i<10;i++)
			System.out.print(f[i]+" ");
	}

}
