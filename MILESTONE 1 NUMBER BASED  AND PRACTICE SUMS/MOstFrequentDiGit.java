package B;
import java.util.*;
public class MOstFrequentDiGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n1,n2,n3,n4;
  n1=sc.nextInt();
  n2=sc.nextInt();
  n3=sc.nextInt();
  n4=sc.nextInt();
  int a[]=new int[20];
  int i=0,r=0,k=0,j=0,c=0,s=0,ans=0;
  while(n1!=0)
  {
	  r=n1%10;
	  a[i]=r;
	  i++;
	  n1=n1/10;
  }
  while(n2!=0)
  {
	  r=n2%10;
	  a[i]=r;
	  i++;
	  n2=n2/10;
  }
  while(n3!=0)
  {
	  r=n3%10;
	  a[i]=r;
	  i++;
	  n3=n3/10;
  }
  while(n4!=0)
  {
	  r=n4%10;
	  a[i]=r;
	  i++;
	  n4=n4/10;
  }
  for(k=0;k<i;k++)
  {c=0;
  for(j=k+1;j<i;j++)
  {
	  if(a[k]==a[j])
		  c++;
  }
  c=c+1;
  if(s<c)
  {
	  s=c;
	  ans=a[k];
  }
  else if(s==c)
  {
	  if(ans<a[k])
		  ans=a[k];
  }
  }
  System.out.print(ans);
	}

}
