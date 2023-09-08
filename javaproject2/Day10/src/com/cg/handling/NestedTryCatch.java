package com.cg.handling;

public class NestedTryCatch {

	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("string length"+slength);
		String anotherstring=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("Index is out of bound"+ex.getMessage());
				
			}
			System.out.println("String length"+anotherstring.length());
			
		}
		
		catch(NullPointerException npe) {
			System.out.println("Exception is thrown"+npe.getMessage());
		}

	}

}
