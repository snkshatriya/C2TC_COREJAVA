package com.cg.collection;

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		Float arr[]= {3.0f,4.0f,6.8f,1.0f};
		MinMaximpl<Float> obj1=new MinMaximpl<Float>(arr);
		System.out.println("Minimial Vlaue is :"+obj1.min());
		System.out.println("Max Vlaue is :"+obj1.max());
		
		String arrOne[]= {"S","sneha","anu","vaishu"};
		MinMaximpl<String> obj12=new MinMaximpl<String>(arrOne);
		System.out.println("Minimial Vlaue is :"+obj12.min());
		System.out.println("Maximum Vlaue is :"+obj12.max());
		
		Person[] p=new Person[] {new Person("Sneha","bgk"),new Person("vaishu","dvg"),new Person("neha","mbl")};
		MinMaximpl<Person> obj2=new MinMaximpl<Person>(p);
		System.out.println("Minimial Vlaue is :"+obj2.min());
		System.out.println("Maximum Vlaue is :"+obj2.max());
	}

}
