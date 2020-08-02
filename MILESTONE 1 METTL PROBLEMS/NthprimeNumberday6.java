package C;
import java.util.*;
public class NthprimeNumberday6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int i=2,j=0,c=0,ans=0,k=0;
for(i=2;i<100000;i++)
{c=0;
	for(j=1;j<=i;j++)
	{
		if(i%j==0)
		c++;
	}
	if(c==2)
	ans++;
	if(ans==input1){
		k=i;
	break;
    }
}
System.out.print(k);
	}

}
