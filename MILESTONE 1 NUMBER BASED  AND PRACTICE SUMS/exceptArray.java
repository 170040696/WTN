package B;
import java.util.*;
public class exceptArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n,i=0,k;


try {
	System.out.println("Enter the number of elements in the array");
	n=sc.nextInt();
	System.out.println("enter the array elements");
	int []a=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the index of the array element you want to access");
	k=sc.nextInt();
	System.out.println("The array element at index k = "+a[k]);
	System.out.println("The array element successfully accessed");
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
	}

}
