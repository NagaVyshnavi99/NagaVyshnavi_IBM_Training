package javaprgms;
class M
{
	int m;
    public int getM() {
		return m;
	}


	public void setM(int m) {
		this.m = m;
	}


	void showClass()
	{
		System.out.println("Class M");
	}
}
class N extends M
{
	int n;
    public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	void showClass()//method overriding
	{
		super.showClass();//firstly super class method is called
		System.out.println("Class N");
	}
	
}
class O extends M
{
	int o;
    public int getO() {
		return o;
	}


	public void setO(int o) {
		this.o = o;
	}


	void showClass()//method overriding
	{
		super.showClass();//firstly super class method is called
		System.out.println("Class O");
	}
}


public class Hierarchical {
	public static void main(String args[])
	{
		O o=new O();
		o.setM(10);
		System.out.println(o.m);
		o.showClass();
	}

}
