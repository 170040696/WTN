package C;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=s.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
			rev=rev+s.charAt(i);
		     if(s.equals(rev))
			System.out.print("palindrome");
			else
				System.out.print("not palindrome");
	}

}
