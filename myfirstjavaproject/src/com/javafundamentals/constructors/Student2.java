package com.javafundamentals.constructors;

//Create class Student
//
//Constructors:
//
//Student(String name)
//
//Student(String name, int marks)
//
//If marks not given → default marks = 0
//Use this() for chaining.



public class Student2 {
	String name;
	int marks;
	
	Student2(String name){
		this.name=name;
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}
	Student2(String name, int marks){
		this(name);
		this.name=name;
		this.marks=marks;
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}

	public static void main(String[] args) {
		Student2 s2=new Student2("Alex",90);
		
	}

}
