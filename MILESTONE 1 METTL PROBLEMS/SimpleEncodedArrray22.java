package C;
import java.util.*;
public class SimpleEncodedArrray22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input2=sc.nextInt();
int input1[]=new int[input2];
int i=0,ans=0;
int b[]=new int[input2];
b[input2-1]=input1[input2-1];
for(i=input2-2;i>=0;i--)
{
	b[i]=input1[i]-b[i+1];
	ans=ans+b[i];
}
System.out.print(b[0]);
System.out.print(b[input2-1]+ans);

return new Result (b[0],ans+b[input2-1]);
	}

}
