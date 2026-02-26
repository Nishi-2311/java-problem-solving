package com.javafundamentals;

import java.util.Scanner;
public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Celsius to convert into fahrenheit: ");
		double celsius=sc.nextDouble();
		
		
		double fahrenheit=(((celsius*9)/5)+32);
		System.out.println("Fahrenheit Convertion: "+fahrenheit);
		
		
		System.out.println("Enter Fahrenheit to convert into celsius: ");
		fahrenheit=sc.nextDouble();
		
		celsius=(((fahrenheit-32)*5)/9);
		System.out.println("Celsius Convertion: "+celsius);
	}
	
}

