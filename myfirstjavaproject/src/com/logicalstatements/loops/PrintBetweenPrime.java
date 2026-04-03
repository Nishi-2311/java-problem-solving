package com.logicalstatements.loops;

import java.util.Scanner;

//Print prime numbers between two given numbers

public class PrintBetweenPrime {
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	static void printPrime(int n1,int n2) {
		for(int i=n1;i<=n2;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number:");
		int n1=sc.nextInt();
		System.out.println("Enter the end number:");
		int n2=sc.nextInt();
		printPrime(n1,n2);
	}

}
