package com;

public class Constructoroverloading {
	int l,w,h;
	Constructoroverloading(){
		
		System.out.println("Box()");
	}
	Constructoroverloading(int l){
		this();
		System.out.println("Box(l)");
		this.l=l;
	}
	Constructoroverloading(int l,int w){
		this(l);
		System.out.println("Box(l,w)");
		this.l=l;
		this.w=w;
	}
	Constructoroverloading(int l,int w,int h){
		this(l,w);
		System.out.println("Box(l,w,h)");
		this.l=l;
		this.w=w;
		this.h=h;
	}
	public static void main(String args[])
	{
		Constructoroverloading c=new Constructoroverloading(10,10,10);
		
		
	}

}
