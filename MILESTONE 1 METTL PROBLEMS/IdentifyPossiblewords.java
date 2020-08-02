package C;
import java.util.*;
public class IdentifyPossiblewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
String input2=sc.nextLine();
input1=input1.toUpperCase();
input2=input2.toUpperCase();
String a[]=input2.split(":");	
char p[]=input1.toCharArray();
int i=0,j=0,c=0,k=0;
String ans="";
for(i=0;i<a.length;i++)
{    String d=a[i];c=0;
	if(d.length()==input1.length())
	{
		char d1[]=d.toCharArray();
     for(j=0;j<p.length;j++)
	 {
       if(d1[j]==p[j])
       c++;
	 }
	}
	if(c==(p.length)-1)
	{
		k++;
		if(k==1)
		ans=ans+d;
		else
	ans=ans+':'+d;	
	}
}
if(k==0)
System.out.print("ERROR-009");
System.out.print(ans);
	}

}
