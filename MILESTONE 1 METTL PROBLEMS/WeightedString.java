package C;

import java.util.Scanner;

public class WeightedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
    char a[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String s=sc.nextLine();
    int input=sc.nextInt();
    int i=0,l=0,j=0,a1=0,ans=0,rat=0;
    l=s.length();
    String s2=s.toLowerCase();
    char s1[]=s2.toCharArray();
    for(i=0;i<l;i++)
    {
    	if(Character.isLetter(s1[i])) 
    	{
    	for(j=0;j<26;j++)
    	{
    		if(s1[i]==a[j]) 
    		{
    			a1=j+1;
    			break;
    			}
    	}
    	ans=ans+a1;
    	}
    }
    a1=0;
    for(i=0;i<l;i++)
        {
        	if(Character.isLetter(s1[i])) 
        	{
        		if(s1[i]!='a'&&s1[i]!='e'&&s1[i]!='i'&&s1[i]!='o'&&s1[i]!='u') 
        		{
        	  for(j=0;j<26;j++)
        	   {
        		if(s1[i]==a[j]) 
        		    {
        			a1=j+1;
        			break;
        			}
        	    }
        	  rat=rat+a1;
        		}
        	}
        }
    	if(input==1)
    		System.out.println(ans);
    	if(input==0)
    		System.out.println(rat);
	}

}
