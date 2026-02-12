package com.javaintroduction;

import java.util.Scanner;
public class TestDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Amount:");
		int userAmount=sc.nextInt();
		System.out.println("Enter cost of Pencil:");
		int costOfPencil=sc.nextInt();
		//int userAmount=100;
		//int costOfPencil=7;
		System.out.println("User can buy number of pencils : "+userAmount/costOfPencil);
		System.out.println("Remaining Balance Amount: "+userAmount%costOfPencil);
	}
}
