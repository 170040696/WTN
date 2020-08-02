package B;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		int []a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayList<Integer> ob=new ArrayList<Integer>(); 
		ArrayList<Integer> ak=new ArrayList<Integer>();
		for(i=0;i<n;i++) {
			if(a[i]>0)
        ob.add(a[i]);
			else
				ak.add(a[i]);
        }
		System.out.println(ob);
		System.out.println(ak);
	}

}
