package com.javafundamentals.methods;
import java.util.Scanner;
public class CarRentals {
	int daily_rent_rate = 1500;
	int insur_fee = 500;
	
	String greet() {
		return "Welcome to Zoom Car Rental ShowRoom!! ";
	}
	String displayName() {
		return "Zoom Car Rentals ShowRoom";
	}
	double totalCost(int days) {
		return (daily_rent_rate*days)+insur_fee;
	}
	

	public static void main(String[] args) {
		CarRentals c=new CarRentals();
		
		System.out.println(c.greet());
		System.out.println("Name of Car Rental Show Room is :" +c.displayName());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of days:");
		int no_of_days=sc.nextInt();
		
		System.out.println("Total Cost for Car Rent : "+c.totalCost(no_of_days));
	}

}
