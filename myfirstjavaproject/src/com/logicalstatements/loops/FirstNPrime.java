package com.logicalstatements.loops;

import java.util.Scanner;

public class FirstNPrime{
	static boolean isPrime(int num) {
		if(num==0 || num==1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	static void findPrime(int n) {
		int count=0;
		for(int i=2;count<n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many prime numbers you want to print:");
		int n=sc.nextInt();
		findPrime(n);
	}
	
}
