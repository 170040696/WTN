package C;
import java.util.*;
public class COUNTNUMBEROFDIGITSINANUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
c=(int)Math.log10(n)+1;
System.out.print(c);
	}

}
