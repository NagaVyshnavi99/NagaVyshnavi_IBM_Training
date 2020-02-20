package com;
class New
{
	static int c=8;

	static void setc()
	 {
		System.out.println(c);
     }
}

public class Staticmethod {
	static int a;//static variable-static variables initialize automatically
	int b;//non static and instance variable
	
	 static void seta()
	 {
		 //int c;//local variables require initialization
		 System.out.println(a);
		 //System.out.println(c);
		 //System.out.println(b);//cannot access non static variables in static method
		 
	 }
	public static void main(String[] args)
	{
		seta();
		New.setc();
		
		//System.out.println(b);//cannot access b
	}

}
