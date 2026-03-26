package com.operators;
import java.util.Scanner;
public class EvenOrOddUsingBitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int num=sc.nextInt();
		
		String res=(num & 1)==1 ? "Odd" : "Even";
		System.out.println(res);	
	}

}
