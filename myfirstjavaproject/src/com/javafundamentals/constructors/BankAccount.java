package com.javafundamentals.constructors;


//Create class BankAccount
//
//Constructors:
//
//No-arg → balance = 0
//
//One parameter → balance = given value
//
//Two parameters → accountNumber + balance
//
//Use constructor chaining properly.


public class BankAccount {
	double balance;
	long accountNumber;
	BankAccount(){
		System.out.println("Balance is: "+balance);
	}

	BankAccount(double balance) {
		this();
		this.balance=balance;
		System.out.println("Balance is: "+balance);
	}

	BankAccount(double balance,long accountNumber) {
		this(balance);
		this.balance=balance;
		this.accountNumber=accountNumber;
		System.out.println("Balance is: "+balance);
		System.out.println("Account Number is: "+accountNumber);
	}


	public static void main(String[] args) {
		BankAccount b=new BankAccount(90000,123456789);
		
	}

}
