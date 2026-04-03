package com.logicalstatements;

import java.util.Scanner;

public class FindNthPrime {
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
	static void findPrime(int n) {
		int count=0;
		for(int i=2;;i++) {
			if(isPrime(i)) {
				count++;
				if(count==n) {
					System.out.print(n+"th Prime Number is: "+i);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which number you want:");
		int n=sc.nextInt();
		findPrime(n);

	}

}
