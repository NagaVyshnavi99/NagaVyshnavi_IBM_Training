package com;

public class Student {
	String stname;
	int stid;
	String stCourse;
	//default constructor
	Student()
	{
		this.stname="any name";
		this.stid=100;
		this.stCourse="any course";
	}
	//parameterized constructor
	Student(String stname,int stid,String stCourse)
	{
		this.stname=stname;
		this.stid=stid;
		this.stCourse=stCourse;
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

	
	
	/*void setSt(String stname,int stid,String stCourse)
	{
		this.stname=stname;
		this.stid=stid;
		this.stCourse=stCourse;
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println(s1.getStname());
		System.out.println(s1.getStid());
		System.out.println(s1.getStCourse());
		s1.setStname("Vyshnavi");
		s1.setStid(103);
		s1.setStCourse("EIE");
		/*s1.setSt("Vyshnavi", 103, "EIE");*/
		System.out.println(s1.getStname());
		System.out.println(s1.getStid());
		System.out.println(s1.getStCourse());
		
		
		
		
		

	}

}
