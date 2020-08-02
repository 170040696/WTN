package B;
import java.util.*;

public class palinDromispossiblebyArranging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,n1=0,i=0,c=0,j,k=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       n1=n;
       String s=Integer.toString(n);
       char str[]=s.toCharArray();
       int l=s.length();
      
       for(i=0;i<l;i++)
       {  c=0;
       if(str[i]!=' ')
       {
    	 for(j=i+1;j<l;j++)
    	 {  
    		 if(str[i]==str[j]) 
    		 {
    			c++; 
    			str[j]=' ';
    		 }
    	 }
    	 c=c+1;
       }
  	 if(c%2!=0) 
  		 k++;
       }
       if(k>1)
    	   System.out.println("connot palindrome");
       else
    	   System.out.println("can palindrome");
	}

}
