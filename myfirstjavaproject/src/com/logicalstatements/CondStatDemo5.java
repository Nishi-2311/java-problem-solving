package com.logicalstatements;
import java.util.Scanner;
public class CondStatDemo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***********Income Tax Calculation*************");
		System.out.println("Enter your Salary:");
		double salary=sc.nextDouble();
		
		if(salary<250000.00)
			System.out.println("NO TAX");
		else if(salary>=250000.00 && salary<500000.00)
			System.out.println("You have to pay 5% as income tax");
		else if(salary>=500000.00 && salary<1000000.00)
			System.out.println("You have to pay 20% as income tax");
		else
			System.out.println("You have to pay 30% as income tax");
	}

}
