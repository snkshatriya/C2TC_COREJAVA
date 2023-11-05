package com.cg.hierarchicalinheritance;

public class HieraricalInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p1=new Person();
		//p1=new Student();
		Student p1=new Student();
		p1.setName("xyz");
		p1.setGender("female");
		p1.setPhoneNo(1234567890);
		p1.setCity("mbl");
		p1.setDepartment("cse");
		p1.setCgpa(8.03f);	
		System.out.println(p1);
		//Person p2=new Employee();
		//System.out.println(p2);
		
	}

}
