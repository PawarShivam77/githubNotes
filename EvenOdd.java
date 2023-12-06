package com.assignmentt;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	
	
	int a ;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("  Enter One New Number : ");
	
	a = scan.nextInt();
	
	if(a % 2==0) {
		System.out.print("This Is a Even Number  ");
	}
	else {
		System.out.print(" This Is Odd Number ");
	}
	

	
	
}
}
