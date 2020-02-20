package javaprgms;

public class Employee {
	String empname;
	int empid;
	int empsalary;
	String location;
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", empsalary=" + empsalary + ", location="
				+ location + "]";
	}
	
	public Employee(String empname, int empid, int empsalary, String location) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.empsalary = empsalary;
		this.location = location;
	}
	
	/*public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}*/
	
	

}
