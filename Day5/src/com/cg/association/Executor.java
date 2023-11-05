package com.cg.association;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1= new Address(1,"xyz","bgk",586212);
		Person p1=new Person("Sneha",a1);
		//person is dependent on address so first we have to create the address object
		//Person p1 = new Person("Sneha", new Address(1,"xyz","bgk",586212));
		p1.display();
		//bcz its not single input and address is private so we have to create the to string in address
	}

}
