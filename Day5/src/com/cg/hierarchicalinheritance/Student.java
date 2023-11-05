package com.cg.hierarchicalinheritance;

public class Student extends Person{
	private String department;
	private float cgpa;
	
	
	
	public Student() {
		System.out.println("Student Details");
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String gender, long phoneNo, String city, String department, float cgpa) {
		super(name, gender, phoneNo, city);
		this.department = department;
		this.cgpa = cgpa;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [department=" + department + ", cgpa=" + cgpa + ", getName()=" + getName() + ", getGender()="
				+ getGender() + ", getPhoneNo()=" + getPhoneNo() + ", getCity()=" + getCity() + "]";
	}
	

}
