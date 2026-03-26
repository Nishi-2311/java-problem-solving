package com.javafundamentals.constructors;

class Vehicle{
	String brand;

	Vehicle(String brand){
		this.brand=brand;
	}
}
class Car extends Vehicle{
	String name;
	String model;
	double price;
	Car(String name,String model,double price,String brand){
		super(brand);
		this.name=name;
		this.model=model;
		this.price=price;
		
	}
	
}
public class ElectricCar extends Car {
	int batteryCapacity;
	
	ElectricCar(String name,String model,double price,String brand,int batteryCapacity){
		super(name,model,price,brand);
		this.batteryCapacity=batteryCapacity;
	}

	public static void main(String[] args) {
		
		ElectricCar e=new ElectricCar("Desire","Honda",2000000.00,"Hyundai",40);
		e.display();
	}
	
	void display() {
		System.out.println("Brand of Electric_Car: "+brand);
		System.out.println("Name of Electric_Car: "+name);
		System.out.println("Model of Electric_Car: "+model);
		System.out.println("Price of Electric_Car: "+price);
		System.out.println("Battery Capacity of Electric_Car: "+batteryCapacity);
	}
	

}
