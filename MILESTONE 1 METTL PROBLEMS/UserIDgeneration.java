package C;
import java.util.*;
public class UserIDgeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
String input2=sc.nextLine();
int input3=sc.nextInt();
int input4=sc.nextInt();
String smallername="";
String longername="";
String ans="";
if(input1.length()>input2.length())
{
longername=input1;
smallername=input2;
}
else if(input1.length()<input2.length())
{
	longername=input2;
	smallername=input1;
}
else if((input1.compareTo(input2))<1)
{
longername=input2;
smallername=input1;
}
else
{
	longername=input1;
	smallername=input2;
}
ans=ans+smallername.charAt(smallername.length()-1);
ans=ans+longername;
String pin=Integer.toString(input3);
ans=ans+pin.charAt(input4-1);
ans=ans+pin.charAt(pin.length()-input4);
StringBuffer ans1=new StringBuffer(ans);
for(int i=0;i<ans1.length();i++)
{
	if(Character.isUpperCase(ans1.charAt(i)))
	ans1.setCharAt(i,Character.toLowerCase(ans1.charAt(i)));
	else
	ans1.setCharAt(i,Character.toUpperCase(ans1.charAt(i)));
}
System.out.print(ans1);

	}

}
