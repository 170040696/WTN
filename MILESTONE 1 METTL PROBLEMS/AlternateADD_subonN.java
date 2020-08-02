package C;
import java.util.*;
public class AlternateADD_subonN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int op=sc.nextInt();
int k=n;
int i=n-1;
int i1=n-1;
while(i!=0)
{
	n=n-i;
	i--;
	if(i!=0) {
	n=n+i;
	i--;}	
}
while(i1!=0)
{
	k=k+i1;
	i1--;
	if(i1!=0) {
	k=k-i1;
	i1--;}
	
}
if(op==1)
	System.out.print(n);
if(op==2)
	System.out.print(k);
	}

}
