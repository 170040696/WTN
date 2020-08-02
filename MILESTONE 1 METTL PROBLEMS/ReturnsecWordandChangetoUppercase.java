package C;

import java.util.Scanner;

public class ReturnsecWordandChangetoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String s3="";
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
         if(k==1)
         {
        	 for(i=b[0]+1;i<l;i++)
        		 s3=s3+a[i];
         }
         for(i=b[0]+1;i<b[1];i++)
         {
        	 s1=s1+a[i];
         }
         if(k==0)
        	 System.out.print("LESS");
         if(k==1)
         {
        	 String s4=s3.toUpperCase();
        	 System.out.print(s4);
        	 }
         String s2=s1.toUpperCase();
         System.out.print(s2);
	}

}
