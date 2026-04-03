package com.logicalstatements.loops;

import java.util.Scanner;

// a positive integer that is equal to the sum of the factorials of its own digits
public class StrongNumber {
	
	static int fact(int r){
		if(r==1) {
			return 1;
		}
		return r*fact(r-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int temp=n;
		int r=0;
		int sum=0;
		int res=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			res=fact(r);
			sum=sum+res;
		}
		if(sum==temp) {
			System.out.println("Given number is Strong Number");
		}
		else {
			System.out.println("Given number is not a Strong Number");
		}
	}
	

}
