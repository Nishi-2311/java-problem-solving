package com.javafundamentals.constructors;

//Create class Product
//
//Data:
//
//productName
//
//price
//
//discount
//
//finalPrice
//
//Constructor should:
//
//Calculate finalPrice = price - discount



public class Product {
	String productName;
	double price;
	double discount;
	double finalPrice;
	Product(String productName,double price,double discount){
		this.productName=productName;
		this.price=price;
		this.discount=(discount*price)/100;
		this.finalPrice=price-this.discount;
		System.out.println("Product Name :"+productName);
		System.out.println("Final Price :"+finalPrice);
		
	}

	public static void main(String[] args) {
		Product p=new Product("Laptop",125000,20);

	}

}
