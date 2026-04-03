package com.logicalstatements.loops;

import java.util.Scanner;

public class CountPrime1ToN {
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
	static int countPrime(int n) {
		int count=0;
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto where you want count:");
		int n=sc.nextInt();
		System.out.println("Count of Prime Numbers from 1 to "+n+" is: "+countPrime(n));

	}

}
