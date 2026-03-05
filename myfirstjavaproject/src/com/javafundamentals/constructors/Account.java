package com.javafundamentals.constructors;
//Create class Account
//
//Data:
//
//accountHolder
//
//balance
//
//Constructor:
//
//If balance < 0 → print error

//Otherwise assign value
public class Account {
	String accountHolder;
	double balance;
	Account(String accountHolder,double balance){
		this.accountHolder=accountHolder;
		this.balance=balance;
		if(balance<0) 
			System.out.println("Error-Insufficient Balance");
		else
			System.out.println("Account Holder: "+accountHolder);
			System.out.println("Balance is: "+balance);
	}
	public static void main(String[] args) {
		Account a=new Account("Siri",95230.50);

	}

}
