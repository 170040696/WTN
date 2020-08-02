package C;
import java.util.*;
public class nintydegreesanticlockwisedirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[][]=new int[100][100];
int i=0,j=0;
for(i=0;i<n;i++)
	for(j=0;j<n;j++)
		a[i][j]=sc.nextInt();
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		System.out.print(a[j][n-i-1]+" ");
	}
	System.out.println();
}
}

}
