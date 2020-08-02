package C;
import java.util.*;
public class SUMOFDIGITSINAGIVENNUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%9==0)
	System.out.print(9);
else
	System.out.print(n%9);
	}

}
