package com.javafundamentals.constructors;

//Create class Person
//
//Data members:
//
//name
//
//age
//
//Task:
//
//If age < 0 → print "Invalid age"
//
//Otherwise store value
//
//Print person details


public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
		if(age<0) {
			System.out.println("Invalid age");
		}
		else {
			System.out.println("Name of the Person: "+name);
			System.out.println("Age of the Person: "+age);
		}
			
	}
	public static void main(String[] args) {
		Person p=new Person("Alex",22);

	}

}
