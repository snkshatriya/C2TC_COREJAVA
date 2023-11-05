package com.cg.map;

import java.util.HashTable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		HashTable<String,String> hm1=new HashTable<>();
		hm1.put("snk", "snk@gmail.com");
		hm1.put("vnk", "vnk@gmail.com");
		hm1.put("rnk", null);
		hm1.put(null, "abc@gmail.com");
		hm1.put("har", "har@gmail.com");
		hm1.put(null, null);
		System.out.println(hm1);
		

	}

}
