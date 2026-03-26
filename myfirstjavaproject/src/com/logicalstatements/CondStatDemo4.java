package com.logicalstatements;

import java.util.Scanner;

public class CondStatDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Grade System");
		System.out.println("Enter marks:");
		int marks=sc.nextInt();
		
		if(marks>100)
			System.out.println("Please enter valid marks");
		else if(marks>=90)
			System.out.println("Excellent !! You got A Grade");
		else if(marks>=75 && marks<=89)
			System.out.println("Good !! You got B Grade");
		else if(marks>=50 && marks<=74)
			System.out.println("Nice !! You got C Grade");
		else
			System.out.println("Oops!! You failed.\nTry to get good marks in next time.");
		sc.close();
	}
}
