package C;
import java.util.*;
public class Equalisnotcodingbat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   int l=str.length();
   int i=0,c=0,s=0;
   for(i=0;i<i+2;i++)
   {
     if(str.substring(i,i+2).equals("is"))
     c++;
   }
    for(i=0;i<i+3;i++)
   {
     if(str.substring(i,i+3).equals("not"))
     s++;
   }
   if(c==s)
   System.out.print("true");
   else
	   System.out.print("false");
	}

}
