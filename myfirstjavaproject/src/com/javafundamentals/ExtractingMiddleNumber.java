package com.javafundamentals;

import java.util.Scanner;

public class ExtractingMiddleNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int d=num/10;
		int n=d%10;
		System.out.println("Middle Digit is: "+n);
		

	}

}
