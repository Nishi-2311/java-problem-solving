package com.javafundamentals.methods;
import java.util.Scanner;
public class TestMethodsDemo1 {

//  No return_type and no args
//	void greet() {
//		byte a=74;
//		byte b=33;
//		System.out.println(a+b);	
//	}
	
	
//  With return_type and no args
//	int greet() {
//		int a=10;
//		int b=20;
//		
//		return a+b;
//	}
	
//  No return_type and With args
//	void greet(int a,int b) {
//		System.out.println(a+b);
//	}
	
//  With return_type and With args
//	int greet(int a,int b) {
//		return a+b;
//	}
	
	
//	int add(int a,int b) {
//		return a+b;
//	}
	
	
//	Write a method that returns the square of a number.
//	int square(int num) {
//		return num*num;
//	}
	
	
	
//	Write a method that returns the largest of three numbers.
//	import java.util.Scanner;
//	class Main {
//	    int largerNumber(int num1,int num2,int num3){
//	        if(num1>num2 && num1>num3)
//	            return num1;
//	        else if(num2>num1 && num2>num3)
//	            return num2;
//	        else
//	            return num3;
//	    }
//	    public static void main(String[] args) {
//	        Scanner sc=new Scanner(System.in);
//	        System.out.println("Enter three numbers: ");
//	        int num1=sc.nextInt();
//	        int num2=sc.nextInt();
//	        int num3=sc.nextInt();
//	        Main m=new Main();
//	        System.out.println(m.largerNumber(num1,num2,num3));
//	    }
//	}
	
	
//	Write a method that counts number of digits in a number.
//	import java.util.Scanner;
//	class Main {
//		public static void main(String[] args) {
//			Scanner sc=new Scanner(System.in);
//	        System.out.println("Enter three numbers: ");
//	        int num1=sc.nextInt();
//	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//boolean bool;
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		
		
//		Write a method that prints multiplication table of a given number.
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
//		TestMethodsDemo1 t1=new TestMethodsDemo1();
//		System.out.println(t1.square(num));
		
//		
		
//		Write a method that checks whether a number is even or odd.
//		if(num%2==0) {
//			bool=true;
//			System.out.println(bool);
//		}
//		else {
//			bool=false;
//			System.out.println(bool);
//		}
		
		
		
		//TestMethodsDemo1 t1=new TestMethodsDemo1();
		//t1.greet();
		//System.out.println(t1.greet());
		//t1.greet(10,20);
		//System.out.println(t1.greet(10,20));
		//System.out.println(t1.add(20,30));
	}

}
