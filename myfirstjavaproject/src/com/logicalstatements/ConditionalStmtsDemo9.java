package com.logicalstatements;
import java.util.Scanner;
public class ConditionalStmtsDemo9 {
//	Employee Bonus
//	Experience > 5 years
//	Salary < 50k → 20% bonus
//	else → 10%
//	Else → 5%
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Bonus Scheme");
		System.out.println("Enter your experience:");
		int exp=sc.nextInt();
		System.out.println("Please enter your salary:");
		double salary=sc.nextInt();
		
		if(exp>5) {
			System.out.println("Oh that's nice!! You have a good number as experience.. ");
			if(salary<50000.00) {
				System.out.println("Congrats !! You got 20% bonus this year");
				display(salary,20);
			}
			else {
				System.out.println("Congrats !! You got 10% as bonus");
				display(salary,10);
			}
		}
		else {
			System.out.println("Congrats !! You got 5% bonus\nWork hard to get better bonus");
			display(salary,5);
		}

	}
	static void display(double sal,int bonus) {
		sal=((100+bonus)*sal)/100;
		System.out.println("Your Updated Salary is :"+sal);
	}

}
