package com.javafundamentals.constructors;
//Create class ElectricityBill
//
//Data:
//
//units
//
//billAmount
//
//Rules:
//
//First 100 units → ₹5/unit
//
//Next 100 units → ₹7/unit
//
//Above 200 → ₹10/unit
//
//Calculate bill inside constructor.
import java.util.Scanner;
public class ElectricityBill {
	int units;
	double billAmount;
	ElectricityBill(){}
	ElectricityBill(int units){
		this.units=units;
		if(units<=100) {
			System.out.println("Bill Amount: "+(units*5));
		}
		else if(units>100 && units<200) {
			System.out.println("Bill Amount: "+(units*7));
		}
		else {
			System.out.println("Bill Amount: "+(units*10));
		}
	}
	public static void main(String[] args) {
		ElectricityBill b=new ElectricityBill();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Units:");
		b.units=sc.nextInt();
		ElectricityBill bill=new ElectricityBill(b.units);
	}
}
