package com.javafundamentals.constructors;
//Create class Product
//
//Data members:
//
//productName
//
//quantity
//
//pricePerUnit
//
//totalAmount
//
//Requirements:
//
//Constructor accepts productName, quantity, pricePerUnit
//
//Calculate totalAmount = quantity × pricePerUnit
//
//Display product bill
public class ProdBilling {
	String productName;
	int quantity;
	int pricePerUnit;
	double totalAmount;
	
	ProdBilling(String productName,int quantity,int pricePerUnit){
		this.productName=productName;
		this.quantity=quantity;
		this.pricePerUnit=pricePerUnit;
		this.totalAmount=quantity*pricePerUnit;
		System.out.println("Three-arg constuctor called");
		
	}
	
	ProdBilling(String productName,int quantity){
		this(productName,2,70);
		System.out.println("Two-arg constuctor called");
		
	}
	
	ProdBilling(String productName){
		this(productName,2);
		System.out.println("One-arg constuctor called");
	}
	
	ProdBilling(){
		this("Mobile");
		System.out.println("Product no-arg constuctor called");
	}
	public static void main(String[] args) {
		ProdBilling pb=new ProdBilling();
		System.out.println("Product Bill: "+pb.totalAmount);
	}

}
