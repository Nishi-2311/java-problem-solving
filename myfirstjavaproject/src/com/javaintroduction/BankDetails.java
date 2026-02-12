package com.javaintroduction;

import java.util.*;
public class BankDetails {
	static int sequence = 123450;
	int accNumber;
	String userName;
	long phoneNumber;
	int balance;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankDetails obj[] = new BankDetails[5];
		for (int i = 0; i < 5; i++) {
			obj[i] = new BankDetails();
			System.out.println("Enter details of Customer: " + (i + 1));
			System.out.println("Enter UserName: ");
			obj[i].userName = sc.nextLine();
			System.out.println("Enter Phone Number: ");
			obj[i].phoneNumber = sc.nextLong();
			System.out.println("Enter Balance: ");
			obj[i].balance = sc.nextInt();
			sc.nextLine();
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Customer" + (i + 1) + " Details: ");
			System.out.println("Customer Account Number :" + obj[i].accNumber);
			System.out.println("Customer" + (i + 1) + " UserName: " + obj[i].userName);
			System.out.println("Customer" + (i + 1) + " PhoneNumber: " + obj[i].phoneNumber);
			System.out.println("Customer" + (i + 1) + " Balance: " + obj[i].balance);
			System.out.println();
		}
	}
	
	{
		count+=1;
		accNumber=sequence +count;
	}
	
}

