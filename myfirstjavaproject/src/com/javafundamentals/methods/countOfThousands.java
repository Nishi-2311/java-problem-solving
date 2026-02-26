package com.javafundamentals.methods;
import java.util.Scanner;
public class countOfThousands {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
//		int count_of_thousands=num/1000;
//		int count_of_hundreds=(num%1000)/100;
//		num=num%100;
//		int count_of_tens=num/10;
//		int count_of_ones=(num%10)/1;
		int arr[]= {1000,100,10,1};
		for(int value:arr) {
			int count=num/value;
			num=num%value;
			System.out.println("Number of "+value+ " 's:"+count);
		}
//		System.out.println("Count of Thousands: "+count_of_thousands);
//		System.out.println("Count of Hundreds: "+count_of_hundreds);
//		System.out.println("Count of Tens: "+count_of_tens);
//		System.out.println("Count of Ones: "+count_of_ones);
		
	}

}
