package com.javafundamentals.constructors;
class Vehicle1{
	String brand;
	Vehicle1(String brand){
		this.brand=brand;
		System.out.println("Vehicle Created!!");
	}
	void start() {
		System.out.println("Vehicle starting");
	}
}
class Car1 extends Vehicle1{
	String model;
	double price;
	Car1(String brand,String model,double price){
		super(brand);
		this.model=model;
		this.price=price;
		System.out.println("Car Created!!");
	}
	void start() {
		System.out.println("Car starting");
		super.start();
	}
	void displayCarDetails() {
		System.out.println("************Car Info***********");
		System.out.println("Brand of the Car :"+brand);
		System.out.println("Model of the Car :"+model);
		System.out.println("Price of the Car :"+price);
	
	}
}
public class Drive{
	public static void main(String[] args) {
		Car1 c1=new Car1("Maruti","Suzuki",570000.00);
		Car1 c2=new Car1("Hyundai","Venue",800000.00);
		Car1 c3=new Car1("Mahindra","Scorpio N",1300000.00);
		c1.start();
		c1.displayCarDetails();
		c2.displayCarDetails();
		c3.displayCarDetails();
	}
}
