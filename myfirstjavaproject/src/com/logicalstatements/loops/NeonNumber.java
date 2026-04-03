package com.logicalstatements.loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sq=n*n;
		int temp=n;
		int r=0;
		int sum=0;
		while(sq!=0) {
			r=sq%10;
			sq=sq/10;
			sum=sum+r;
		}
		if(sum==temp)
			System.out.println("Given number is Neon Number");
		else
			System.out.println("Given number is not a Neon Number");
	}

}
