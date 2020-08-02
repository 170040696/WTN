package B;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creatperson c=new Creatperson("akanksha");
   Employee e=new Employee();
   c.show();
   e.setannulsalary(50000);
   e.setyear(2018);
   e.setinsurancenumber("12345678");
   System.out.println("annual salary "+e.getannualsalary());
   System.out.println("the year the employee started to work "+e.getyear());
   System.out.println("national insurance number  "+e.getinsurancenumber());
	}

}
