package B;
class Rectangle 
{
	public void setColor(String a)
	{
		System.out.println(a);
	}
}
public class OnlineRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Rectangle r1=new Rectangle();
   r1.setColor("Color.blue");
   Rectangle r2=r1;
   r2.setColor("Color.red");
   
	}

}
