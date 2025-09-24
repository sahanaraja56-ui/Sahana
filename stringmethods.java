package com.p1;

public class stringmethods {

	public static void main(String[] args) {
		String a="Sahana";
		String b="Sahana";
		System.out.println("Equals="+a.equals(b));
		System.out.println("EqualsIgnorecase="+a.equalsIgnoreCase(b));
		System.out.println("Length="+a.length());
		System.out.println("CharAt="+a.charAt(0));
		System.out.println("Uppercase="+a.toUpperCase());
		System.out.println("Lowercase="+a.toLowerCase()); 
	     

		System.out.println("Replace="+a.replace("Sahana","Rajamannar"));
		System.out.println("contains="+a.contains("Sahana"));
		System.out.println("starts with="+a.startsWith("Saha"));
		System.out.println("Ends with="+a.endsWith("na"));
	}
}
		

       
       
