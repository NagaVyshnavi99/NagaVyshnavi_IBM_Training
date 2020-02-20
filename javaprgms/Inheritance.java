package javaprgms;


class A
{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	void showClass()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	void showClass()//method overriding
	{
		super.showClass();//firstly super class method is called
		System.out.println("Class B");
	}
	
}
public class Inheritance {
public static void main(String args[])
{
	B b=new B();
	A a=new A();
	b.setA(10);
	System.out.println(b.a);
	b.showClass();
	a.showClass();
}
}
