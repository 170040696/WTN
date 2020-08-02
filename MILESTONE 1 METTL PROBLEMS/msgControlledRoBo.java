package C;
import java.util.*;
public class msgControlledRoBo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int input2=sc.nextInt();
String input3=sc.nextLine();
String input4=sc.nextLine();
String ans="";
String a[]=input3.split("-");
int x1=Integer.parseInt(a[0]);
int y1=Integer.parseInt(a[1]);
char d=a[2].charAt(0);
String b[]=input4.split(" ");
int i=0,k=0,m=0;

for(i=0;i<b.length;i++)
{
if(b[i].equals("R"))
{	
if(d=='E')
d='S';
else if(d=='N')
d='E';
else if(d=='W')
d='N';
else
d='W';
}
else if(b[i].equals("L"))
{
if(d=='E')
d='N';
else if(d=='N')
d='W';
else if(d=='W')
d='S';
else
d='E';
}
if(b[i].equals("M"))
{
if(d=='S')
 y1--;
 else if(d=='E')
 x1++;
 else if(d=='N')
 y1++;
 else
 x1--;
}
if(x1>input1 || y1>input2 ||x1<0 ||y1<0)
{
k=x1;
m=y1;
if(x1>input1)
	x1=x1-1;
if(y1>input2)
	y1=y1-1;
break;
}	

}

String r=Integer.toString(x1);
String p=Integer.toString(y1);
if(k!=0 || m!=0)
ans=r+"-"+p+"-"+d+"-"+"ER";
else
ans=r+"-"+p+"-"+d;
System.out.print(ans);

}
}
	
