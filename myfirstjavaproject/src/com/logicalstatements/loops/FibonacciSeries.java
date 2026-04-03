package com.logicalstatements.loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number upto where you want: ");
		int n=sc.nextInt();
		
		int n1=0,n2=1,n3=0;
		System.out.print(n1+ " "+n2);
		
		int sum=n1+n2;
		
		for(int i=0;i<(n-2);i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			sum+=n3;
		}
		System.out.println();
		System.out.println("Sum of first "+n+" terms of Fibonacci series is: "+sum);
	}

}
