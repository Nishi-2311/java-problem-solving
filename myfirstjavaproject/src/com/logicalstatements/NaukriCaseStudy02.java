package com.logicalstatements;
import java.util.Scanner;
public class NaukriCaseStudy02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("We are calling from XYZ Company");
		System.out.println("Are you looking for a job..?");
		String str=sc.next();
		
		if(str.equalsIgnoreCase("yes")) {
			System.out.println("Tell me about yourself");
			String intro=sc.nextLine();
			sc.nextLine();
			System.out.println("How much percentage you got in your graduation?");
			int grad=sc.nextInt();
			if(grad>=60) {
				System.out.println("Great, let's discuss further.");
				System.out.println("Are you comfortable with Java?");
				String tech=sc.next();
				if(tech.equalsIgnoreCase("yes")) {
					System.out.println("Okay, let's proceed.");
					System.out.println("Do you have any relevant certifications or training ?");
					String cert=sc.next();
					if(cert.equalsIgnoreCase("yes")) {
						System.out.println("Okay, that's a plus.");
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
						System.out.println("That's ok.");
						System.out.println("Are you willing to relocate");
						String rel=sc.next();
						if(rel.equalsIgnoreCase("yes")) {
							System.out.println("We will get back you soon");
						}
						else {
							System.out.println("Okay,thank you for your time.");
						}
					}
				}
				else {
					System.out.println("Okay, no problem.");
					System.out.println("Are you willing to learn new skills?");
					String sk=sc.next();
					if(sk.equalsIgnoreCase("yes")) {
						System.out.println("Okay,let's proceed.");
						System.out.println("Are you willing to relocate");
						String rel=sc.next();
						if(rel.equalsIgnoreCase("yes")) {
							System.out.println("Okay, we will get back to you soon.");
						}
						else {
							System.out.println("Okay,thank you for your time.");
						}
					}
					else {
						System.out.println("Sorry!! Your skills doesn't match this role..");
					}
				}
			}
			else {
				System.out.println("Sorry !! Your profile doesn't match eligibility criteria");
			}
		}
		else {
			System.out.println("Sorry!! We are looking for  IT Employees");
		}

	}

}
