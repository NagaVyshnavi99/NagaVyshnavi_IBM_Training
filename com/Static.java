//search "static keyword in java" in javatpoint

package com;

public class Static {
	String stname;
	int stid;
	String stCourse;
	//default constructor
	static String college="St.Joseph's";
	Static()
	{
		this.stname="any name";
		this.stid=100;
		this.stCourse="any course";
	}
	
	
	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStCourse() {
		return stCourse;
	}

	public void setStCourse(String stCourse) {
		this.stCourse = stCourse;
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s1=new Static();
		System.out.println(s1.getStname());
		System.out.println(s1.getStid());
		System.out.println(s1.getStCourse());
		System.out.println(Static.college);//or s1.college
		
	}

}
