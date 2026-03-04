package com.javafundamentals.constructors;


//Create class Employee
//
//Data members:
//
//name
//
//basicSalary
//
//hra
//
//da
//
//grossSalary
//
//Requirements:
//
//Constructor should accept name and basicSalary
//
//Calculate:
//
//hra = 20% of basicSalary
//
//da = 10% of basicSalary
//
//grossSalary = basicSalary + hra + da
//
//Create method to display all details


public class Employee {
	String name;
	int basicSalary;
	int hra;
	int da;
	int grossSalary;
	Employee(String name,int basicSalary){
		this.name=name;
		this.basicSalary=basicSalary;
		this.hra=(20*basicSalary)/100;
		this.da=(10*basicSalary)/100;
		this.grossSalary=basicSalary + hra +da;
	}

	public static void main(String[] args) {
		Employee emp=new Employee("SIRI",40000);
		emp.show();
	}
	void show() {
		System.out.println("Employee Name: "+name);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("Gross Salary: "+grossSalary);
	}

}
