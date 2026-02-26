package com.javaintroduction;

import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base: ");
		int base=sc.nextInt();
		System.out.println("Enter Height: ");
		int height=sc.nextInt();
		double area=0.5*base*height;
		System.out.println("Area of Triangle is: "+area);

	}

}
