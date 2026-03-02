package com.javafundamentals.methods;
import java.util.Scanner;
public class FoodOrder {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Price: ");
	double price=sc.nextDouble();
	System.out.println("Enter Quantity: ");
	int quantity=sc.nextInt();
	printBill(addDeliveryCharge(addGST(calculateItemTotal(price,quantity))));

	}
	static double calculateItemTotal(double price,int quantity) {
		double amount= price*quantity;
		System.out.println("Initial Bill excluding Taxes: "+amount);
		return amount;
	}
	static double addGST(double amount) {
		amount=1.05*amount;
		System.out.println("After Adding GST : "+amount);
		return amount;
	}
	static double addDeliveryCharge(double amount) {
		amount+=40;
		System.out.println("Affter adding Delivery Charges : "+amount);
		return amount;
	}
	static void printBill(double amount) {
		System.out.println("Final Bill : "+amount);
	}

}
