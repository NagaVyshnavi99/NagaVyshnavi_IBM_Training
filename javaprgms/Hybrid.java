package javaprgms;

class D
{
	int d;

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	void showClass()
	{
		System.out.println("Class D");
	}
	
}
class E extends D
{
	int e;

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}
	void showClass()
	{
		super.showClass();
		System.out.println("Class E");
	}
	
}
class F extends D
{
	int f;

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	void showClass()
	{
		super.showClass();
		System.out.println("Class F");
	}
	
	
}
class G extends F
{
	int g;

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}
	void showClass()
	{
		super.showClass();
		System.out.println("Class G");
	}
	
}
public class Hybrid {
	public static void main(String args[])
	{
		G g=new G();
		g.showClass();
	}

}
