package A;

class Box {
	double w=0,h=0,d=0;
	Box(double width,double height,double depth){
		this.w=width;
		this.h=height;
		this.d=depth;
	}
	public double show()
	{
		return w*h*d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box ob=new Box(2.8,3.7,4.7);
		double k=ob.show();
		System.out.println(k+" volume of the Box");

	}
}


