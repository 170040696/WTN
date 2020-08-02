package A;
 class Employeee {
private int empno;
private String name;
private double salary;

public int getEmp()
{
	return empno;
}
public void setEmp(int emp )
{
	empno=emp;
}
 }
 public class Empdetails
 {
	public static void main(String args[]) 
	{
		Employeee ed=new Employeee();
		ed.setEmp(101);
		System.out.println(ed.getEmp());
	 }
                                
  }
 