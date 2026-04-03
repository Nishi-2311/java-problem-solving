package com.logicalstatements.loops;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialUsingLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int fact=1;
//		BigInteger fact=BigInteger.valueOf(1);
//		for(int i=1;i<=n;i++) {
//			fact=fact.multiply(BigInteger.valueOf(i));
//		}
		
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial of given number is: "+fact);

	}

}
