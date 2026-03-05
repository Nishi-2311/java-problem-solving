package com.javafundamentals.constructors;
//Create class Circle
//
//Data members:
//
//radius
//
//area
//
//circumference
//
//Requirements:
//
//Constructor should accept radius
//
//Calculate:
//
//area = π × r²
//
//circumference = 2 × π × r
//
//Display all details
public class Circle {
	double radius;
	double area;
	double circumference;
	
	Circle(double radius){
		System.out.println("One-arg Constructor called!");
		this.radius=radius;
		this.area=Math.PI*radius*radius;
		this.circumference=Math.PI*radius*2;
	}
	void show() {
		System.out.println("Area: "+area);
		System.out.println("Circumference: "+circumference);
	}
	public static void main(String[] args) {
		Circle circ=new Circle(5.3);
		circ.show();

	}

}
