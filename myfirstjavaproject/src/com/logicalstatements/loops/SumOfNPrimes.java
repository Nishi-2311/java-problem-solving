package com.logicalstatements.loops;

import java.util.Scanner;

//Return the sum of all prime numbers up to N
public class SumOfNPrimes {
	
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
	static int sumPrime(int n) {
		int sum=0;
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number upto where you want:");
		int n=sc.nextInt();
		System.out.println("Sum of all Prime Numbers upto "+n+" is: "+sumPrime(n));
	}

}
