package com.logicalstatements.loops;

import java.util.Scanner;

public class PerfectNumber {
	static void perfNumber(int num){
		int sum=0;
		for(byte i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("Sum is: "+sum);
		String res=(sum==num)?"Given Number is Perfect":"Given Number is Not a Perfect";
		System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		perfNumber(num);
		sc.close();
	}

}
