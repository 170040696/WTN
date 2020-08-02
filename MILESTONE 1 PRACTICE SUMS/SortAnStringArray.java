package A;
import java.util.*;
public class SortAnStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String [] str= {"akanksha","anjana","alnksh","amjhdf","anhdg"};
int i=0,j=0;
for(i=0;i<str.length;i++)
{
	for(j=i+1;j<str.length;j++)
	{
		int k=str[i].compareTo(str[j]);
		if(k>0)
		{
			String s1=str[i];
			str[i]=str[j];
			str[j]=s1;
		}
	}
}
for(i=0;i<str.length;i++)
	System.out.println(str[i]);
	}

}
