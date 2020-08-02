package B;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Chocolet {
    public static void main(String[] args)
     {
     Scanner sc=new Scanner(System.in);
     int t,i=0;
     t=sc.nextInt();
     for(i=0;i<t;i++)
     {
         int n,c,m,w=0,k=0,r=0;
         n=sc.nextInt();
         c=sc.nextInt();
         m=sc.nextInt();
         w=n/c;
         k=w;
         while(w>=m)
         {
        	 r=w%m;
             w=w/m;
             k=k+w;
             w=w+r;
         }
         System.out.println(k);
     }     
    }
}
