package com.javafundamentals.methods;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID: ");
		short sid=sc.nextShort();
		System.out.println("Enter Name: ");
		String name=sc.next();
		System.out.println("Enter Age: ");
		byte age=sc.nextByte();
		System.out.println("Enter Height: ");
		float h=sc.nextFloat();
		System.out.println("Enter Weight: ");
		double w=sc.nextDouble();
		System.out.println("Enter Fees: ");
		long fee=sc.nextLong();
		System.out.println("Enter Gender: ");
		char g=sc.next().charAt(0);
		System.out.println("Enter Marks: ");
		int marks=sc.nextInt();
		System.out.println("Are you Qualified: ");
		boolean bool=sc.nextBoolean();
		
		System.out.println("Student Details:");
		System.out.println(sid);
		System.out.println(name);
		System.out.println(age);
		System.out.println(h);
		System.out.println(w);
		System.out.println(fee);
		System.out.println(g);
		System.out.println(marks);
		System.out.println(bool);
		
		sc.close();

	}

}
