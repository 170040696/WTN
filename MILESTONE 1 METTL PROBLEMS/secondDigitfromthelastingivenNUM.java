package C;
import java.util.*;
public class secondDigitfromthelastingivenNUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
	int l=Math.abs(input1);
	int r=0,k=0,c=0;
	while(l!=0)
	{
		r=l%10;
		c++;
		if(c==2){
		k=r;break;}
		l=l/10;
	}	
	if(l==0)
	System.out.print(-1);
	else if(c==1)
		System.out.print(r);
	else
	System.out.print(k);
	}
}