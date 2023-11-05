package com.cg.collection;

public class GenericMethod {
	
	public<E> void displayArrayElements(E[] elements) {
		for(E a:elements) {
			System.out.println(a);
		}
	}
	
}
