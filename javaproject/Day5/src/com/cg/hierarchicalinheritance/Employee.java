package com.cg.hierarchicalinheritance;

public class Employee extends Person{
	private int emIid;
	private float salary;
	
		
	public Employee() {
		System.out.println("Employee Details");
	}
	public Employee(String name, String gender, long phoneNo, String city) {
		super(name, gender, phoneNo, city);
		// TODO Auto-generated constructor stub
	}
	public Employee(int emIid, float salary) {
		super();
		this.emIid = emIid;
		this.salary = salary;
	}
	public int getEmIid() {
		return emIid;
	}
	public void setEmIid(int emIid) {
		this.emIid = emIid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emIid=" + emIid + ", salary=" + salary + ", getName()=" + getName() + ", getGender()="
				+ getGender() + ", getPhoneNo()=" + getPhoneNo() + ", getCity()=" + getCity() + "]";
	}
	

}
