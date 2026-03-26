package com.javafundamentals.constructors;
//Create a class Product.
//
//Data members:
//
//productId
//
//productName
//
//price
//
//Constructors:
//
//Parameterized constructor
//
//Copy constructor
//
//Requirement:
//
//Create a product object.
//
//Create a second product using the copy constructor.
//
//Apply 10% discount only to the copied product.
//
//Display both products.
public class ProductDisc {
	int prodId;
	String prodName;
	double price;

	ProductDisc(int prodId,String prodName,double price){
		this.prodId=prodId;
		this.prodName=prodName;
		this.price=price;
	}
	ProductDisc(ProductDisc p1){
		this.prodId=p1.prodId;
		this.prodName=p1.prodName;
		this.price=p1.price-p1.price*0.1;
	}
	void display() {
		System.out.println("Product ID: "+prodId);
		System.out.println("Product Name: "+prodName);
		System.out.println("Price: "+price);
		System.out.println("*****************");
	}
	public static void main(String[] args) {
		
		ProductDisc p1=new ProductDisc(1,"SAMSUNG",35000.0);
		p1.display();
		ProductDisc p2=new ProductDisc(p1);
		p2.display();
	}
}
