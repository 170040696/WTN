package C;
import java.util.*;
public class EncodedArraymettl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input2=sc.nextInt();
int a[]=new int[input2];
int i=0,output2=0,output1=0;
for(i=0;i<input2;i++)
{
	a[i]=sc.nextInt();
}
int b[]=new int[input2];
b[input2-1]=a[input2-1];
for(i=input2-2;i>=0;i--)
{
	b[i]=a[i]-b[i+1];
}
for(i=0;i<input2;i++)
{
	output2=output2+b[i];
}
output1=b[0];
System.out.println(output1);

System.out.print(output2);

	}

}
