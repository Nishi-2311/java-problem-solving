package com.javafundamentals.methods;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Areas a = new Areas();
		System.out.println("Enter the values for Rectangle: ");
		System.out.println("Enter length:");
		double len = sc.nextDouble();
		System.out.println("Enter breadth:");
		double br = sc.nextDouble();
		System.out.println("Area of Rectangle is: " + a.arRect(len, br));
		
		System.out.println("Enter values for Triangle: ");
		System.out.println("Enter base:");
		double base = sc.nextDouble();
		System.out.println("Enter height:");
		double height = sc.nextDouble();
		System.out.println("Area of Triangle is: " + a.arTri(base, height));
		
		
		System.out.println("Enter values for Circle: ");
		System.out.println("Enter radius");
		double rad = sc.nextDouble();
		System.out.printf("Area of Circle is: %.2f" , a.arCirc(rad));
		System.out.println();
		System.out.println("Enter values for Square: ");
		System.out.println("Enter side");
		int side = sc.nextInt();
		System.out.println("Area of Square is: " + a.arSq(side));
		
		sc.close();

	}

	double arRect(double l, double b) {
		return l * b;
	}

	double arTri(double b, double h) {
		return 0.5 * b * h;
	}

	double arCirc(double r) {
		final double PI = 3.14;
		// return Math.PI*r*r;
		return PI * r * r;
	}

	int arSq(int s) {
		return s * s;
	}

}
