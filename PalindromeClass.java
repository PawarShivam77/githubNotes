package com.string;

public class PalindromeClass {

	public static void main(String[] args) {
		
	
		String a="dad";
		String b;
		StringBuilder sb;
		System.out.println(" Real Name is :"+a);
		sb=new StringBuilder(a);
		b=sb.reverse().toString();
		System.out.println(" Reverse name is : "+b);
		if (a.equals(b)) {
			System.out.println("This is Palindrome");
		} else {
			System.out.println("This is Not Palindrome");
		}
	
	
	}
	
	
	
}
