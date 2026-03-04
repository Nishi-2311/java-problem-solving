package com.javafundamentals.constructors;
import java.util.Scanner;
public class Student {
	String name;
	int eng_marks;
	int tel_marks;
	int soc_marks;
	int maths_marks;
	String branch;
	int total;
	double average;
	Student(){
		System.out.println("No-arg constructor");
	}
	
	Student(String name,int eng_marks,int tel_marks,int soc_marks,int maths_marks,String branch){
		this.name=name;
		this.eng_marks=eng_marks;
		this.tel_marks=tel_marks;
		this.soc_marks=soc_marks;
		this.maths_marks=maths_marks;
		this.branch=branch;
//		total=eng_marks+tel_marks+soc_marks+maths_marks;
//		average=total/4;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter Name: ");
		s.name=sc.nextLine();
		System.out.println("Enter English Marks: ");
		s.eng_marks=sc.nextInt();
		System.out.println("Enter Telugu Marks: ");
		s.tel_marks=sc.nextInt();
		System.out.println("Enter Social Marks: ");
		s.soc_marks=sc.nextInt();
		System.out.println("Enter Maths Marks: ");
		s.maths_marks=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Branch: ");
		s.branch=sc.nextLine();
		
		Student st1=new Student(s.name,s.eng_marks,s.tel_marks,s.soc_marks,s.maths_marks,s.branch);
		
		//Student s=new Student(s.name,s.eng_marks,s.tel_marks,s.soc_marks,s.maths_marks,s.branch);
		
		st1.show();
		sc.close();
	}
	void show() {
		total=eng_marks+tel_marks+soc_marks+maths_marks;
		average=total/4;
		System.out.println("total is: "+total);
		System.out.println("average is: "+average);
	}

}
