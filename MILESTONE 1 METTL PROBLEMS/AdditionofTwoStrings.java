package C;
import java.util.*;
public class AdditionofTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		int l1=input1.length();
		   int l2=input2.length();
		   String s="";
		   int i=0,j=0,l=0,k=0,r=0,m=0,c=0,l3=0;
		   int a1[]=new int[10000];
			    int a[]=new int[l1];
				int b[]=new int[l2];
				for(i=0;i<l1;i++){
				a[i]=(input1.charAt(i)-48);
				}
				for(i=0;i<l2;i++){
				b[i]=(input2.charAt(i)-48);
				}
		       for(i=l1-1,j=l2-1;i>=0&&j>=0;i--,j--)
			   {
		        k=a[i]+b[j]+c;
				l=(int)Math.log10(k)+1;
				if(l==1){
				a1[m]=k;
				m++;
				c=0;}
				if(l>1)
				{
					while(k!=0)
					{
		             r=k%10;
		                a1[m]=r;
						m++;
						c=k/10;
						break;
					}
				}
				if(l1==l2)
		           {
		           	if(i==0||j==0)
		           	{
		           		a1[m]=c;
		           		m++;
		           	}
		           }
				
			   }
		       
			if(l1>l2)
			{
				l3=l1-l2;
				for(i=l3-1;i>=0;i--){
				a1[m]=b[i]+c;
				m++;
				c=0;}
			}
			if(l2>l1)
			{
				l3=l2-l1;
				for(i=l3-1;i>=0;i--)
				{
					a1[m]=a[i]+c;
					m++;
					c=0;
				}
			}
			  for(i=0;i<m;i++)
			   {
				   s=s+Integer.toString(a1[i]);
			   }
			 StringBuffer sb=new StringBuffer(s);
			 String ans=(sb.reverse().toString());
			 System.out.print(ans);  
	          
			}
			}

	
