package com.javafundamentals.constructors;
class A{
	void display() {
		System.out.println("This is Grandparent class method");
	}
}
class B extends A{
	void display() {
		super.display();
		System.out.println("This is Parent class method");
	}
}
class C extends B {
	
	void display() {
		super.display();
		System.out.println("This is Child class method");
	}
}
public class Task extends C{
	
	public static void main(String[] args) {
		Task t=new Task();
		t.display();

	}

}
