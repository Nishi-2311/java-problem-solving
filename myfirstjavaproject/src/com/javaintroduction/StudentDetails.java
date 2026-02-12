package com.javaintroduction;

import java.util.Scanner;
public class StudentDetails {
	String sname;
	int sid;
	int age;
	char gender;
	int tel;
	int eng;
	int hin;
	int maths;
	int science;
	int social;
	int total=0;
	float average=0.0f;
	public static void main(String[] args) {
		StudentDetails obj1=new StudentDetails();
		StudentDetails obj2=new StudentDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Student 1 Details:");
		System.out.println("Enter Name: ");
		obj1.sname=sc.nextLine();
		System.out.println("Enter ID: ");
		obj1.sid=sc.nextInt();
		System.out.println("Enter age: ");
		obj1.age=sc.nextInt();
		System.out.println("Enter Gender: ");
		obj1.gender=sc.next().charAt(0);
		System.out.println("Enter Telugu Marks: ");
		obj1.tel=sc.nextInt();
		System.out.println("Enter English Marks: ");
		obj1.eng=sc.nextInt();
		System.out.println("Enter Hindi Marks: ");
		obj1.hin=sc.nextInt();
		System.out.println("Enter Maths Marks: ");
		obj1.maths=sc.nextInt();
		System.out.println("Enter Scinece Marks: ");
		obj1.science=sc.nextInt();
		System.out.println("Enter Social Marks: ");
		obj1.social=sc.nextInt();
		
		//to clear buffer
		sc.nextLine();
		System.out.println();
		
		System.out.println("Student 2 Details:");
		System.out.println("Enter Name: ");
		obj2.sname=sc.nextLine();
		System.out.println("Enter ID: ");
		obj2.sid=sc.nextInt();
		System.out.println("Enter age: ");
		obj2.age=sc.nextInt();
		System.out.println("Enter Gender: ");
		obj2.gender=sc.next().charAt(0);
		System.out.println("Enter Telugu Marks: ");
		obj2.tel=sc.nextInt();
		System.out.println("Enter English Marks: ");
		obj2.eng=sc.nextInt();
		System.out.println("Enter Hindi Marks: ");
		obj2.hin=sc.nextInt();
		System.out.println("Enter Maths Marks: ");
		obj2.maths=sc.nextInt();
		System.out.println("Enter Scinece Marks: ");
		obj2.science=sc.nextInt();
		System.out.println("Enter Social Marks: ");
		obj2.social=sc.nextInt();
		
		obj1.display();
		obj2.display();
		
	}
	void display() {
		total=tel+eng+hin+maths+science+social;
		average=total/6;
		System.out.println("Student Name: "+sname);
		System.out.println("Student ID: "+sid);
		System.out.println("Student Age: "+age);
		System.out.println("Student Gender: "+gender);
		System.out.println("Sum of all subjects marks: "+total);
		System.out.println("Average of all subjects marks: "+average);
		System.out.println();
	}
}




