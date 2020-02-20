package javaprgms;

abstract class Shape {
              
	abstract double area(int l,int w);
	
}
class Rectangle extends Shape
{
	int l,w;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}
	double area(int l,int w)
	{
		return l*w;
	}
}
class Abstractshape
{
	public static void main(String[] args)
	{
		//Shape r=new Rectangle();
		Rectangle r=new Rectangle();
		double s=r.area(10,20);
		System.out.println(s);
		
	}
}
