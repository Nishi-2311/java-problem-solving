package com.logicalstatements;

import java.util.Scanner;

public class CondStatDemo6 {
//	Units:
//
//		0–100 → ₹1/unit
//		101–200 → ₹2/unit
//		201–500 → ₹5/unit
//
//		500 → ₹7/unit
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***********Electricity Bill Generator************");
		System.out.println("Enter the units you consumed:");
		int units=sc.nextInt();
		if(units<=100) {
			System.out.println("cost per unit is: ₹1/unit");
			System.out.println("Total bill:"+units*1);
		}
		else if(units>100 && units<=200) {
			System.out.println("cost per unit is: ₹2/unit");
			System.out.println("Total bill:"+units*2);
		}
		else if(units>200 && units<=500) {
			System.out.println("cost per unit is: ₹5/unit");
			System.out.println("Total bill:"+units*5);
		}
		else {
			System.out.println("cost per unit is: ₹7/unit");
			System.out.println("Total bill:"+units*7);
		}
		
	}

}
