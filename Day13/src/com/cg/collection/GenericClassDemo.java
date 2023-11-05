package com.cg.collection;

public class GenericClassDemo {

	public static void main(String[] args) {
		//Heterogeneous input can be given
		//wrapper class<Integer>
		//<>diamond bracket
		GenericClass<Integer> gc = new GenericClass<Integer>();
		gc.set(10);
		System.out.println(gc.get());
		
		GenericClass<Double> gc1 = new GenericClass<Double>();
		gc1.set(10.0);
		System.out.println(gc1.get());
		
	}

}
