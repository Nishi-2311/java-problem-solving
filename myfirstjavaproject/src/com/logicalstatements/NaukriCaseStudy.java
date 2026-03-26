package com.logicalstatements;
import java.util.Scanner;
public class NaukriCaseStudy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Iam calling from from XYZ Company");
		System.out.println("Are you applied for software developer position?");
		String str=sc.next();
		
		if(str.equalsIgnoreCase("yes")) {
			System.out.println("Briefly explain about yourself");
			String intro=sc.nextLine();
			sc.nextLine();
			System.out.println("How many years of experience do you have?");
			int exp=sc.nextInt();
			if(exp>=3 && exp<=5) {
				System.out.println("Great!! let's discuus further...");
				System.out.println("What's your current salary?");
				int sal=sc.nextInt();
				if(sal>=1200000 && sal<=2500000) {
					System.out.println("Okay,let's proceed");
					System.out.println("Are you willing to relocate");
					String rel=sc.next();
					if(rel.equalsIgnoreCase("yes")) {
						System.out.println("Great, we'll schedule an interview");
						System.out.println("You will recieve an update within one week");
					}
					else {
						System.out.println("Okay,thank you for your time and effort");
					}
				}
				else {
					System.out.println("Sorry, it doesn't fit for your profile");
				}	
			}
			else {
				System.out.println("Sorry, it doesn't match with the eligibility criteria");
			}
		}
		else {
			System.out.println("Sorry !! Your profile doesn't match with job role");
		}
		sc.close();
	}

}
