package com.logicalstatements.loops;

import java.util.Scanner;

// Print primes in reverse order

public class PrimesInReverse {
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
	static void printPrime(int n) {
		for(int i=n;i>=1;i--) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number from where you want to print:");
		int n=sc.nextInt();
		printPrime(n);

	}

}
