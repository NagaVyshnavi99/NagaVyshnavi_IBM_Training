package com;

public class Box {
	int l;
	int w;
	int h;
	static int Boxcompany;
	static void change()
	{
		Boxcompany=5;
		
	}
	Box()
	{
		this.l=0;
		this.w=0;
		this.h=0;
	}
	Box(int l,int w,int h)
	{
		this.l=l;
		this.h=h;
		this.w=w;
	}
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


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}
    int Calculatevolume(int l,int w,int h)
    {
    	int vol;
    	vol=l*w*h;
    	return vol;
    }

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,10,10);
		int val;
		val=b.Calculatevolume(b.l, b.w, b.h);
		System.out.println(val);
		System.out.println("Before calling static method"+" "+Box.Boxcompany);
		Box.change();
		System.out.println("After calling static method"+" "+Box.Boxcompany);
		
		
		

	}

}
