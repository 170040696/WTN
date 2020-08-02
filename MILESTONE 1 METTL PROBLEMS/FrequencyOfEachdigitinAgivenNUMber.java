package C;
import java.util.*;
public class FrequencyOfEachdigitinAgivenNUMber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []freq=new int[15];
int i=0,r=0,c=0,s=0,l=0;
for(i=0;i<15;i++)
{
	freq[i]=0;
}
while(n!=0)
{
	r=n%10;
	freq[r]++;
	n=n/10;
}
for(i=0;i<15;i++)
{
  if(freq[i]!=0)
  {
	s=freq[i];
	break;
  }
}
for(i=0;i<15;i++)
{
  if(freq[i]!=0)
  {
	if(freq[i]!=s)
		l++;
  }
}
if(l>0)
	System.out.print("not equal");
else
	System.out.print(" equal");
	}

}
