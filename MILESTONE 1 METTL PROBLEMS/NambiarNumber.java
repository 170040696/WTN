package C;
import java.util.*;
public class NambiarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
int i=0,l=0,s=0,k=0;
l=input1.length();
int a[]=new int[l];
for(i=0;i<l;i++)
 a[i]=(input1.charAt(i)-48);
int c=0;
String str="";
if(a[0]%2==0)
c=0;
else
c=1;
for(i=0;i<l;i++)
{
	s=s+a[i];
	if(s%2!=0)
   k=1;
   else
   k=0;
   if(i==l-1)
  str=str+s;
   if(k!=c){
  str=str+s;
  s=0;i++;
  if(a[i]%2==0)
  c=0;
  else
  c=1;
  s=s+a[i];
  if(i==l-1)
  str=str+s;
   }
}
int ans=Integer.parseInt(str);
System.out.print(ans);
	}

}
