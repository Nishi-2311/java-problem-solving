package com.logicalstatements.loops;

import java.util.Scanner;

public class FibonacciUsingWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=sc.nextInt();
		
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		int n3;
		
		int i=1;
		while(i<=(n-2)) {
			n3=n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
		}
	}
}
