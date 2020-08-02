package C;

import java.util.Scanner;

public class WeightofaHIllPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1,input2,input3;
		input1=sc.nextInt();
		input2=sc.nextInt();
		input3=sc.nextInt();
		int i=0,j=0,k=0;
		for(i=0;i<input1;i++)
		{
			for(j=0;j<=i;j++)
			{
				k=k+input2;
			}
			input2=input2+input3;
		}
		System.out.println(k);
	}

}
