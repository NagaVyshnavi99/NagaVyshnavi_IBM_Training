package com;

public class Methodoverloading {

	double add(int a,double b)
    {
  	  return a+b;
    }
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Methodoverloading m=new Methodoverloading();
		double sum1=m.add(2, 2.2);
		int sum2=m.add(2, 2);
		double sum3=m.add(2.2, 2.2);
		System.out.println("Sum1="+sum1);
		System.out.println("Sum2="+sum2);
		System.out.println("Sum3="+sum3);
		
      
	}

}
