package com.javafundamentals.constructors;
//Create a class Student.
//
//Data members:
//
//id
//
//name
//
//marks
//
//Constructors:
//
//Parameterized constructor to initialize all values.
//
//Copy constructor that creates a new student object by copying another student object.
//
//Requirement:
//
//Create one student object.
//
//Create another object using the copy constructor.
//
//Display both objects.
public class StudCopyConst {
	int id;
	String name;
	int marks;
	StudCopyConst(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	StudCopyConst(StudCopyConst s){
		id=s.id;
		name=s.name;
		marks=s.marks;
	}
	void displayDetails() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println("******************");
	}
	public static void main(String[] args) {
		StudCopyConst s1=new StudCopyConst(1,"SIRI",95);
		s1.displayDetails();
		StudCopyConst s2=new StudCopyConst(s1);
		s2.displayDetails();
	}

}
