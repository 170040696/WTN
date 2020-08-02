package C;
import java.util.*;
public class UserIdgeneration222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
String input2=sc.nextLine();
int input3=sc.nextInt();
int input4=sc.nextInt();
String  sname="";
String lname="";
String user="";
int i=0;
if(input1.length()>input2.length())
{
    lname=input1;
	sname=input2;
}
else if(input1.length()<input2.length())
{
	lname=input2;
	sname=input1;
}
else
{
	if(input1.compareTo(input2)>0)
	{
		lname=input1;
		sname=input2;
	}
	else
	{
		sname=input1;
		lname=input2;
	}
}
user=sname.charAt(sname.length()-1)+lname;
String pin=Integer.toString(input3);
user=user+pin.charAt(input4-1);
user=user+pin.charAt(pin.length()-input4);
StringBuffer user1=new StringBuffer(user);
for(i=0;i<user1.length();i++)
{
if(Character.isUpperCase(user1.charAt(i)))
user1.setCharAt(i,Character.toLowerCase(user1.charAt(i)));
else
user1.setCharAt(i,Character.toUpperCase(user1.charAt(i)));
}
String ans=user1.toString();
System.out.print(ans);

	}

}
