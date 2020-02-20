package javaprgm;

public class Wrapperexample {
	public static void main(String args[])
	{
		int a=75;//primitive type
		Integer i=new Integer(75);//wrapper type
		i=a;//autoboxing
		System.out.println("Autoboxing"+" "+i);
		int b;
		b=i;//unboxing
		
		System.out.println("Unboxing"+" "+b);
		
		System.out.println(i.byteValue());
		
		
	}

}
