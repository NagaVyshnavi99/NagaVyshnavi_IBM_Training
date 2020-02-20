package com;

public class Parametrizedconstructor {
	String stname;
	int stid;
	String stCourse;
	
    Parametrizedconstructor(String stname,int stid,String stCourse)
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
		Parametrizedconstructor s1=new Parametrizedconstructor("Vyshnavi",103,"EIE");
		System.out.println(s1.getStname());
		System.out.println(s1.getStid());
		System.out.println(s1.getStCourse());
		

}
}