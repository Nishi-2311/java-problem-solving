package com.logicalstatements.loops;

import java.util.Scanner;

public class CountOfDigits {
	static int countDigits(int n) {
		int r=0,count=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println("Count of all digits of a given number is: "+countDigits(n));

	}

}
