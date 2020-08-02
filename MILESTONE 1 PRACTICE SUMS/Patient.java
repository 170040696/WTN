package A;
import java.util.*;
class Patient {
	Scanner sc=new Scanner(System.in);
	double height =sc.nextDouble();
	double weight =sc.nextDouble();
	String patientname=sc.nextLine();
 public double computeBMI()
 {
	 return weight/(height*height);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient ob=new Patient();
		double k=ob.computeBMI();
		System.out.println((ob.patientname)+" BMI is "+k);
	}

}
