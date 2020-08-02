package C;
import java.util.*;
public class GEtCodeThroughString22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
String a[]=input1.split(" ");
int i=0,l=0,r=0,ans=0;
for(i=0;i<a.length;i++)
{
   l=l+a[i].length();
}
while(ans!=1){
while(l!=0)
{
r=r+l%10;
l=l/10;    
}
ans=(int)Math.log10(r)+1;
}
System.out.print(r);
	}

}
