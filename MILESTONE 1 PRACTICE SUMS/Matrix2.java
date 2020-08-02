package A;
import java.util.*;
public class Matrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][] =new int[n][m];
		int r[][] =new int[n][m];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				r[n-i-1][m-j-1]=a[i][j];
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}

}
