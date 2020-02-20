package javaprgms;
class K
{
	int k;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	void showClass()
	{
		System.out.println("Class A");
	}
}
class L extends K
{
	int l;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}
	void showClass()//method overriding
	{
		super.showClass();//firstly super class method is called
		System.out.println("Class B");
	}
	
}
class C extends L
{
	int c;

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	void showClass()//method overriding
	{
		super.showClass();//firstly super class method is called
		System.out.println("Class C");
	}
}

public class Multilevel {
	public static void main(String args[])
	{
		C c=new C();
		c.setL(10);
		System.out.println(c.l);
		c.setK(20);
		System.out.println(c.k);
		c.showClass();
	}

}
