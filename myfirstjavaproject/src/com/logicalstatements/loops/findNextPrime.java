package com.logicalstatements.loops;

//Find next prime after a given number
import java.util.Scanner;
public class findNextPrime {
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
	static void nextPrime(int n) {
		int count=0;
		for(int i=(n+1);count<=1;i++) {
			if(isPrime(i)) {
				System.out.print("Next Prime Number is: "+i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to get next prime:");
		int n=sc.nextInt();
		nextPrime(n);
	}

}
