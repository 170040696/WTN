package A;

class Calculator {
  static double powerInt(int num1,int num2)
  {
	  return Math.pow(num2, num1);
  }
  static double powerDOuble(double num1,double num2)
  {
	  return Math.pow(num2, num1);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ob=new Calculator();
		double k=ob.powerInt(1, 2);
		System.out.println(k);
		double l=ob.powerDOuble(3.2, 2.4);
		System.out.println(l);

	}

}
