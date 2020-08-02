package B;
import java.util.*;
public class Firstelementduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
int i=0,j=0,c=0,ans=0;
for(i=0;i<n;i++)
	a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++)
	{
		if(a[i]==a[j]) {
			c=1;
			ans=a[i];
			break;}
	}
	if(c==1)
		break;
}
System.out.print(ans);
	}

}
