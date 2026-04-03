package com.logicalstatements.loops;

import java.util.Scanner;

public class Print1ToNPrimeUsingMethods {
	static boolean isPrime(int num) {
		boolean flag=true;
		if(num==0 || num==1) {
			flag=false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number upto where you want:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			boolean status =isPrime(i);
			if(status) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
