package com.logicalstatements.loops;

import java.util.Scanner;

public class ArmstrongNumb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int r=0;
		int n1=n;
		int temp=n;
		int count=0;
		int sum=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			count++;
		}
		while(n1!=0) {
			r=n1 %10;
			n1=n1/10;
			int power=1;
			for(int i=1;i<=count;i++) {
				power=power*r;
			}
			sum=sum+power;
		}
		if(sum==temp) {
			System.out.println("Given number is Armstrong Number");
		}
		else {
			System.out.println("Given number is not an Armstrong Number");
		}
	}

}
