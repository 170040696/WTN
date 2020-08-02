package C;
import java.util.*;
public class sumOfthenumbersatNOnprimeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input2=sc.nextInt();
int []input1=new int[input2];
int i=0,c=0,j=0,ans=0;
for(i=0;i<input2;i++)
	input1[i]=sc.nextInt();
for(i=0;i<input2;i++)
{c=0;
	for(j=1;j<=i;j++)
	{
     if(i%j==0)
      c++;
	}
	if(c!=2)
    ans=ans+input1[i];
}
System.out.print(ans);
	}

}
