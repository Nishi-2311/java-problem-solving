package com.logicalstatements.loops;

import java.util.Scanner;

public class ReverseNumber {
	static int reverseNum(int n) {
		int r=0;
		int rev=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Reverse of a given number is:"+reverseNum(n));
	}

}
