package A;

public class WTN {
 int a;
 int b;
 WTN(int a1,int a2)
 {
	 a=a1;
	 b=a2;
 }
 int add()
 {
	 return (a+b);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WTN sc=new WTN(10,80);
		
		System.out.println(sc.add());

	}

}
