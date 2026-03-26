package com.logicalstatements;

import java.util.Scanner;

public class SwitchEx1 {
//	Cardiology
//	Neurology
//	Orthopedic
//	Print doctor availability
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department: ");
		String dept=sc.next();
		switch(dept) {
			case "Cardio"-> System.out.println("Doctor is available in 10am to 4pm");
			case "Neuro"-> System.out.println("Doctor is available in 9am to 12pm");
			case "Ortho"-> System.out.println("Doctor is available in 11am to 6pm");
			default -> System.out.println("Entered department doctor is not available");
		}
	}

}
