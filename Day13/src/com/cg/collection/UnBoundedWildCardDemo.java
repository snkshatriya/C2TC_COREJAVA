package com.cg.collection;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList =Arrays.asList(1,2,3);
		UnBoundedWildCard.display(intList);
		
		List<String> intString =Arrays.asList("Welcom to java");
		UnBoundedWildCard.display(intString);
		
		Person[] p=new Person[] {new Person("Sneha","bgk"),new Person("vaishu","dvg"),new Person("neha","mbl")};
		List<Person> intPerson =Arrays.asList(p);
		UnBoundedWildCard.display(intPerson);
	}

}
