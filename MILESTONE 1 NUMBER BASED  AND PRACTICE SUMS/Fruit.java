package B;
class fruitss
{
	int size;
	String taste;
	public void eat()
	{
		System.out.println("name of the fruitss");
		System.out.println("taste of fruitss");
	}
}
class Apple extends fruitss
{
	public void eat()
	{  
		System.out.println("name of the fruit is APple");
		System.out.println("taste of Apple");
	}
}
class Orange extends fruitss
{
	public void eat()
	{
		
		System.out.println("name of the fruit is Orange");
		System.out.println("taste of Orange");
	}
}

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange o=new Orange();
		o.eat();
		Apple a=new Apple();
    a.eat();
    fruitss f=new fruitss();
    f.eat();
	}

}
