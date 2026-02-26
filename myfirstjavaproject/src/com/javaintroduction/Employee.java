package com.javaintroduction;

import java.util.Scanner;

public class Employee {
	String emp_name;
	int emp_id;
	int curr_salary;
	int hike;

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.emp_name="Employee 1";
		emp1.emp_id=1;
		emp1.curr_salary=50000;
		
		Employee emp2=new Employee();
		emp2.emp_name="Employee 2";
		emp2.emp_id=2;
		emp2.curr_salary=30000;
		
		Employee emp3=new Employee();
		emp3.emp_name="Employee 3";
		emp3.emp_id=3;
		emp3.curr_salary=70000;
		
		Employee emp[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i>=2;i++) {
			emp[i]=new Employee();
			System.out.println("Enter Employee"+i+" Details:");
			System.out.println("Enter ID:");
			emp[i].emp_id=sc.nextInt();
			System.out.println("Enter Name:");
			emp[i].emp_id=sc.nextInt();
			System.out.println("Enter ID:");
			emp[i].emp_id=sc.nextInt();
			
			
			
		}
		
		emp1.bonus();
		emp2.bonus();
		emp3.bonus();
		
		
		
	}
	void bonus() {
		hike=20;
		int inc_salary=((curr_salary*(100+hike))/100);
		System.out.println("Employee"+emp_id+" Details: "+emp_id);
		System.out.println("Name :" +emp_name);
		System.out.println("Current Salary: "+curr_salary);
		System.out.println("Incremented Salary: "+inc_salary);
		System.out.println();
		
		
	}

}
