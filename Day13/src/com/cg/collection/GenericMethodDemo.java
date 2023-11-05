package com.cg.collection;

public class GenericMethodDemo {

	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,5,6};
		String[] str= {"java","python","c++"};
		Person[] p= {new Person("Sneha","bgk"),new Person("vaishu","dvg")};
		GenericMethod gm=new GenericMethod();
		gm.displayArrayElements(intArray);
		gm.displayArrayElements(str);
		gm.displayArrayElements(p);
		
	}

}
