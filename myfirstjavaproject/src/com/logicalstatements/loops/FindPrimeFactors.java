package com.logicalstatements.loops;

import java.util.Scanner;

public class FindPrimeFactors{
	static void findFactors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				if(findPrimeFactors(i)) {
					System.out.print(i+" ");
				}
			}
		}
	}

	static boolean findPrimeFactors(int n) {
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		findFactors(n);
		sc.close();
	}

}
