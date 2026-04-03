package com.logicalstatements.loops;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int r=0;
		int base=1;
		int dec=0;
		while(n!=0) {
			r=n%10;
			dec=dec+r*base;
			base=base*2;
			n=n/10;
		}
		System.out.println("Decimal conversion of given number is: "+dec);

	}

}
