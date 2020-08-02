package B;
import java.util.*;
public class ReadsecWordandChangetoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         char a[]=s.toCharArray();
         int i=0,l=0,k=0;
         l=s.length();
         String s1="";
         int b[]=new int[4];
         for(i=0;i<l;i++)
         {
        	 if(a[i]==' ')
        	 {
        		 b[k]=i;
        		 k++;
        	 }
         }
         for(i=b[0]+1;i<b[1];i++)
         {
        	 s1=s1+a[i];
         }
        
         String s2=s1.toUpperCase();
         System.out.print(s2);
	}

}
