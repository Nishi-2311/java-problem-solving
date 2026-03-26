package com.logicalstatements;
import java.util.Scanner;
public class ConditionalStmtsDemo8 {
//	Student Scholarship
//	Marks > 85
//	Income < 2L → full scholarship
//	else → partial
//	Else → no scholarship
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Scholarship Scheme");
		System.out.println("Enter your marks:");
		int marks=sc.nextInt();
		
		if(marks>85) {
			System.out.println("Good !! You are eligible for next process");
			System.out.println("Enter your family income:");
			double income=sc.nextDouble();
			if(income<200000.00)
				System.out.println("Congrats!! You got 100% scholarship for further studies");
			else
				System.out.println("Congrats!! You are selected for partial scholarship scheme");
		}
		else {
			System.out.println("Sorry !! You are not eligible for this Scholarship Scheme");
			System.out.println("Try to get good marks to be eligible");
		}
	}

}
