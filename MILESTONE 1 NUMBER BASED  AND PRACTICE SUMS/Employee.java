package B;

public class Employee extends Creatperson{
private double annualsalary;
private int year;
private String insurancenumber;
Employee()
{
	super("akanksha");
}
public void setannulsalary(double annualsalary)
{
	this.annualsalary=annualsalary;
}
public double getannualsalary()
{
	return annualsalary;
}
public void setyear(int year)
{
	this.year=year;
}
public int getyear()
{
	return year;
}
public void setinsurancenumber(String insurancenumber)
{
	this.insurancenumber=insurancenumber;
}
public String getinsurancenumber()
{
	return insurancenumber;
}
}
