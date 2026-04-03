package com.logicalstatements.loops;

import java.util.Scanner;

public class FactorialUsingRecursion {
	static int findFact(int n) {
		if(n==1) {
			return 1;
		}
		return n*findFact(n-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find factorial:");
		int n=sc.nextInt();
		int fact=findFact(n);
		System.out.println("Factorial of given number is:"+fact);
		sc.close();
	}

}
