package javaprgms;
class Student
{
	int id;
	String name;
	String course;
	String branch;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", branch=" + branch + "]";
	}
	
	public Student(int id, String name, String course, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.branch = branch;
	}
	
	
}
class address extends Student
{
	String city;
	int pin;
	@Override
	public String toString() {
		return "address [city=" + city + ", pin=" + pin + ", id=" + id + ", name=" + name + ", course=" + course
				+ ", branch=" + branch + "]";
	}
	public address(int id, String name, String course, String branch,String city,int pin) {
		super(id, name, course, branch);
		this.city=city;
		this.pin=pin;
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}

public class Studentinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		address a=new address(103,"Vyshnavi","B.E","EIE","Chennai",600100);
		System.out.println(a);
		

	}

}
