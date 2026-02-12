package com.javaintroduction;

public class TestDemo {
	static TestDemo t=new TestDemo();
	
	public static void run(){
		System.out.println("static method");
	}
	static{
		System.out.println("static block executed");
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		run();
		t.show();
	}
	{
		System.out.println("instance block executed");
	}
	void show() {
		System.out.println("instance method");
	}
}
