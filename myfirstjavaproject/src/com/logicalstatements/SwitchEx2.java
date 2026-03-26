package com.logicalstatements;

import java.util.Scanner;

public class SwitchEx2 {
//	Java
//	Python
//	Data Science
//	Print course duration & fee
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course name:");
		String course=sc.nextLine();
		switch(course) {
			case "Java"->{
				System.out.println("Course duration is: 6 months");
				System.out.println("Fees : 32000");
			}
			case "Python"->{
				System.out.println("Course duration is: 6 months");
				System.out.println("Fees : 32000");
			}
			case "Data Science"->{
				System.out.println("Course duration is: 4 months");
				System.out.println("Fees : 25000");
			}
			case "AI"->{
				System.out.println("Course duration is: 5 months");
				System.out.println("Fees : 25000");
			}
			case "Testing"->{
				System.out.println("Course duration is: 4 months");
				System.out.println("Fees : 20000");
			}
			case "Cyber Security"->{
				System.out.println("Course duration is: 4 months");
				System.out.println("Fees : 50000");
			}
			case "Cloud"->{
				System.out.println("Course duration is: 5 months");
				System.out.println("Fees : 60000");
			}
			default -> {
				System.out.println("Entered course is not available");
			}
		}

	}

}
