package B;
import java.util.*;
public class smallestLargestPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String arr[]=s.split(" ");
int i=0,k=0,m=0;
int b[]=new int[arr.length];
String c[]=new String[arr.length];
for(i=0;i<arr.length;i++)
{
	StringBuilder sb=new StringBuilder(arr[i]);
			String rev=(sb.reverse()).toString();
			if(arr[i].equals(rev))
			{
	         b[k]=arr[i].length();
	         k++;
	         c[m]=arr[i];
	         m++;
			}			
}
int lar=b[0];
int sml=b[0];
String smll="";
String larr="";
for(i=0;i<k;i++)
{ 
	if(b[i]<=sml) {
		sml=b[i];smll=c[i];
		}
	if(b[i]>=lar) {
		lar=b[i];larr=c[i];
		
}
}
System.out.print(smll+" "+larr);
	}

}
