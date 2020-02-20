package javaprgms;

public class Wageemployee extends Employee {
	int hours;
	int rate;
	@Override
	public String toString() {
		return "Wageemployee [hours=" + hours + ", rate=" + rate + ", empname=" + empname + ", empid=" + empid
				+ ", empsalary=" + empsalary + ", location=" + location + "]";
	}//to get superclass datamembers in toString select Checkbox inherited members.
  /*  public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}*/
	
    public Wageemployee(String empname, int empid, int empsalary, String location,int hours,int rate) {
		super(empname, empid, empsalary, location);
		this.hours=hours;
		this.rate=rate;
		// TODO Auto-generated constructor stub
	}//constructor generated from super class.Select Wageemployee->source->generate constructor from superclass.
	
	

}
