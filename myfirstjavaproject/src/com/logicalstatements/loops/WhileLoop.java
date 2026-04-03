package com.logicalstatements.loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		//Print numbers from 1 to N using while
		int i=1;
		while(i<=n) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		//Print numbers from N to 1
		int j=n;
		while(j>=1) {
			System.out.print(j+" ");
			j--;
		}
		System.out.println();
		
		//Print even numbers up to N
		int k=1;
		while(k<=n) {
			if(k%2==0) {
				System.out.print(k+" ");
			}
			k++;
		}
		System.out.println();
		
		//Print odd numbers up to N
		int k1=1;
		while(k1<=n) {
			if(k1%2==1) {
				System.out.print(k1+" ");
			}
			k1++;
		}
		System.out.println();
		
		//Find sum of first N natural numbers
		int sum=0;
		int i1=1;
		while(i1<=n) {
			sum+=i1;
			i1++;
		}
		System.out.println("Sum is:"+sum);
		System.out.println();
		
		//Find factorial of a number
		System.out.println("Enter number to find its factorial:");
		int num=sc.nextInt();
		int fact=1;
		int i2=1;
		while(i2<=num) {
			fact*=i2;
			i2++;
		}
		System.out.print("Factorial of given number is:"+fact);
	}

}
