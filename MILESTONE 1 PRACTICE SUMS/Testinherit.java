package A;

class Animal
{
	int s=10;
}
class bird extends Animal
{
	int d=4;
}
public class Testinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bird ob=new bird();
		Animal sc=new Animal();
		System.out.println(ob.s);
		System.out.println(ob.d);

	}

}
