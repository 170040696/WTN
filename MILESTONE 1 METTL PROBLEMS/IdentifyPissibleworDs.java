package C;
import java.util.*;
public class IdentifyPissibleworDs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
String input2=sc.nextLine();
input1=input1.toUpperCase();

input2=input2.toUpperCase();
int l1=input1.length();
int l2=input2.length();
String str="";
char a[]=input1.toCharArray();
char b[]=input2.toCharArray();
int i=0,j=0,j1=0,k=0,m=0;

for(i=0,j=j1;i<l1&&j<l2;j++)
{
	if(b[j]==a[0]) {
		k=j;}
	if(a[i]!='_')
	{
		if(a[i]==b[j])
			i++;
		else
			i=0;
	}
	else if(a[i]=='_')
	{
		j=j+1;
		m=j+i;
		for(i=i+1,j=j+1;i<l1&&j<=m;)
		{
			if(a[i]==b[j]) {
				i++;j++;
			}
			else
				break;
		}
		if(i==l1)
		{
			str=str+input1.substring(k,j);
						
			str=str+":";
			i=0;j1=m+2;
		}
		else
		{i=0;j=m+3;}
	}
}
	}

}
