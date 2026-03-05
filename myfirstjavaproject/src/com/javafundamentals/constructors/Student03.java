package com.javafundamentals.constructors;

import java.util.Scanner;

//2️⃣ Student Record
//
//Create class Student.
//
//Variables:
//
//name
//
//branch
//
//marks
//
//Constructors:
//
//Student() → default name "Guest"
//
//Student(String name)
//
//Student(String name,String branch)
//
//Student(String name,String branch,int marks)
//
//Requirements:
//
//Use this() to call another constructor
//
//Initialize variables only in the last constructor
public class Student03 {
	String name;
	String branch;
	int marks;
	
	Student03(String name,String branch,int marks){
		this.name=name;
		this.branch=branch;
		this.marks=marks;
		System.out.println("Three-arg constructor called");
	}
	Student03(String name,String branch){
		this(name,branch,100);
		System.out.println("Two-arg constructor called");
	}
	
	Student03(String name){
		this(name,"CSE");
		System.out.println("One-arg constructor called");
	}
	
	Student03(){
		this("Guest");
		System.out.println("Student no-arg constructor called");
	}
	void show() {
		System.out.println("Name : "+name);
		System.out.println("Branch : "+branch);
		System.out.println("Marks : "+marks);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student03 s1=new Student03();
		s1.show();
	}

}
