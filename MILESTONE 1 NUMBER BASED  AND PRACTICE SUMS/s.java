
package B;
import java.util.*;
class a{
	private int f() {return 0;}
	public int g() {return 3;}
}
class b extends a{
	private int f(){return 1;}
	public int g() {return f();}
}
class c extends b{
	public int f() {return 2;}
}
public class s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a ref1=new c();
b ref2=(b)ref1;
System.out.print(ref2.g());

	}

}
