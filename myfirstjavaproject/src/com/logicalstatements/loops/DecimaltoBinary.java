package com.logicalstatements.loops;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int r=0;
		String binary="";
		while(n>0) {
			r=n%2;
			n=n/2;
			binary=r+binary;
		}
		System.out.println("Binary Conversion of given number is:"+binary);

	}

}
