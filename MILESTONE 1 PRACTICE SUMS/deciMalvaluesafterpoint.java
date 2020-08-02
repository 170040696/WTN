package A;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class deciMalvaluesafterpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int i=0;
double s=0,avg=0;
int a[]=new int[n];
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
	s=s+(double)a[i];
}
avg=s/(double)n;
DecimalFormat df = new DecimalFormat("#.###");
df.setRoundingMode(RoundingMode.CEILING);
System.out.println(df.format(avg));
	}

}
