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
//Parameterized constructor
//
//Copy constructor
//
//Requirement:
//
//Create one student object.
//
//Create another student using the copy constructor.
//
//Change the marks of the copied object.
//
//Display both objects and observe the difference.
public class StudCopyConst02 {
	int id;
	String name;
	int marks;
	
	StudCopyConst02(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	StudCopyConst02(StudCopyConst02 s1){
		this.id=s1.id;
		this.name=s1.name;
		this.marks=s1.marks;
	}
	void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println("*****************");
	}
	public static void main(String[] args) {
		StudCopyConst02 s1=new StudCopyConst02(1,"Siri",95);
		s1.display();
		StudCopyConst02 s2=new StudCopyConst02(s1);
		s2.marks=100;
		s2.display();
	}

}
