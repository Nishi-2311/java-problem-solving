package com.javafundamentals.constructors;
//Create class CartItem
//
//Data:
//
//itemName
//
//quantity
//
//price
//
//totalPrice
//
//Constructor:
//
//Calculate totalPrice
//
//Create 3 objects and calculate grand total in main method.
import java.util.Scanner;
public class CartItem {
	String itemName;
	int quantity;
	double price;
	double totalPrice;
	CartItem(){}
	CartItem(String itemName,int quantity,double price){
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price;
		this.totalPrice=quantity*price;
	}
	public static void main(String[] args) {
		CartItem c[]=new CartItem[3];
		double grandTotal = 0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("*****Enter CartItem No: "+(i+1)+" Details******");
			System.out.println("Enter Item Name:");
			String itemName=sc.nextLine();
			System.out.println("Enter Quantity:");
			int quantity=sc.nextInt();
			System.out.println("Enter Price:");
			double price=sc.nextInt();
			
			sc.nextLine();
			
			c[i]=new CartItem(itemName,quantity,price);
			System.out.println("Total Price: " + c[i].totalPrice);
			grandTotal += c[i].totalPrice;
		}
		System.out.println("Grand Total: " + grandTotal);
	}

}
