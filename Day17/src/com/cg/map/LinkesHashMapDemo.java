package com.cg.map;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkesHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> lhm=new LinkedHashMap<>();
		lhm.put("snk", new Student(1,"snk"));
		System.out.println(lhm);
	}

}
