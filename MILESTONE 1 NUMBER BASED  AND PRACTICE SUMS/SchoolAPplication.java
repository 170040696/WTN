package B;
class Wtnperson
{
	String dateOfBirth="29/09/1999";
	String name="akanksha";
	public void show()
	{
		System.out.println("dateOfBirth of person is "+dateOfBirth);
		System.out.println("name of person is "+name);
	}
}
class Teacher extends Wtnperson
{
	int salary=50000;
	String subject="java";
	public void show()
	{
		System.out.println("salary of teacher is "+salary);
		System.out.println("subject of the teacher "+subject);
	}
}
class Student extends Wtnperson
{
	int StuId=170040696;
	public void show()
	{
		System.out.println("Name of the student is "+StuId);
	}
}
class ClassStudent extends Student
{
 String colgname="KLU";
 int stdYear=3;
 public void show()
	{
		System.out.println("college name of the colgstudent "+colgname);
		System.out.println("college student studying year "+stdYear);
	}
}
public class SchoolAPplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wtnperson p=new Wtnperson();
		p.show();
		Teacher t=new Teacher();
		t.show();
		Student s=new Student();
		s.show();
		ClassStudent cl=new ClassStudent();
		cl.show();

	}

}
