package com.javafundamentals.constructors;
import java.util.Scanner;
public class CaseStudy {
	int orderID;
	String custName;
	String foodItem;
	int quantity;
	double price;
	double total;
	double finalbill;
	//double extraItem_total;
	
	CaseStudy(){
		orderID=0;
		custName="Guest";
		foodItem="Not Selected";
		quantity=0;
		price=0;
		this(0,"Guest");
	}
	CaseStudy(int orderID,String custName){
		this(orderID,custName,"Not Selected");
	}
	CaseStudy(int orderID,String custName,String foodItem){
		this(orderID,custName,foodItem,0,1);
	}
	CaseStudy(int orderID,String custName,String foodItem,int quantity,double price){
		this.orderID=orderID;
		this.custName=custName;
		this.foodItem=foodItem;
		this.quantity=quantity;
		this.price=price;
		this.total=price*quantity;
	}

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter Order ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Food Item: ");
		String item=sc.nextLine();
		System.out.println("Enter Quantity: ");
		int q=sc.nextInt();
		System.out.println("Enter Price: ");
		double p=sc.nextDouble();
		
		
		sc.nextLine();
		System.out.println("Enter Extra Item Name: ");
		String ext_item=sc.nextLine();
		System.out.println("Enter Extra Item Price: ");
		int ext_price=sc.nextInt();
		
		CaseStudy c=new CaseStudy(id,name,item,q,p);
		c.addExtraItem(ext_item,ext_price);
		
		c.displayOrder();
		
		
	}
	void displayOrder() {
		System.out.println("======Food Order Details======");
		System.out.println("Order ID :"+orderID);
		System.out.println("Customer Name :"+custName);
		System.out.println("Food Item :"+foodItem);
		System.out.println("Quantity :"+quantity);
		System.out.println("Price :"+price);
		//System.out.println("Initial Billing Price: "+calculateBill());
		System.out.println("Final Billing Price: "+calculateBill());
		System.out.println("===============================");
		
	}
	void addExtraItem(String item,int price) {
		this.total=this.price*this.quantity;
		System.out.println("Initial Billing Price: "+this.total);
		System.out.println("Newly Added Items Price: "+price);
		this.finalbill=this.total+price;
	}
	double calculateBill() {
		//total=price*quantity;
		if(this.finalbill>1000) {
			System.out.println("10% discount applied!!");
			finalbill=finalbill-(finalbill*0.1);
			//System.out.println(finalbill);
		}
		return this.finalbill;
	}

}
