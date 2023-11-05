package com.cg.association;

public class Person {
	private String name;
	private Address address;
	//here user defined class is used as a data type(non primitive type)
	//address is a combination of alpha numeric
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		
		System.out.println(name);
		System.out.println(address);
		
	}
	

}
