package C;
import java.util.*;
public class FindCodeFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
int l=input1.length();
char a[]=input1.toCharArray();
int i=0,c=0,j=0,s=0,k=0;
for(i=i;i<l;i++)
{c=0;
	while(a[i]!=' ')
	{
		c++;
		
		System.out.print(c+" ");
		i++;
	}
	i=i+1;
	s=s+c;
	
}

	}

}
