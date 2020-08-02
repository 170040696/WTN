package C;
import java.util.*;
public class Withoutstringcodingbat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String base=sc.nextLine();
		String remove=sc.nextLine();
		int l1=base.length();
		  int l2=remove.length();
		  int i=0,j1=0,j2=0;
		  for(i=0;i<i+l2;i++)
		  {
		    if((base.substring(i,i+l2)).equals(remove))
		    {
		      j1=i;
		      j2=i+l2;
		      break;
		    }
		  }
        StringBuffer sb=new StringBuffer(base);
        sb.replace(j1,j2,"");
        System.out.print(sb);
	}

}
