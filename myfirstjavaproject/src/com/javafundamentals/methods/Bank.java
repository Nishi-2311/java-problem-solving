package com.javafundamentals.methods;
import java.util.Scanner;
public class Bank {
	long accNumber;
	String name;
	int balance;
	int pin;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b[]=new Bank[3];
		for (int i = 0; i <b.length; i++) {
			b[i]=new Bank();
			System.out.println("-----Enter the "+(i+1)+" User Details--------");
			System.out.println("Enter Account Number: ");
			b[i].accNumber=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Name: ");
			b[i].name=sc.nextLine();
			System.out.println("Enter Balance: ");
			b[i].balance=sc.nextInt();
			System.out.println("Enter PIN: ");
			b[i].pin=sc.nextInt();
			
			
			System.out.println("-------Bank Operations--------");
			System.out.println("Enter amount to deposit: ");
			int dp=sc.nextInt();
			b[i].deposit(dp);
			System.out.println("Enter amount to withdraw: ");
			int w=sc.nextInt();
			b[i].withdraw(w);
			b[i].getBalance();
			b[i].changePin(sc);
			
			System.out.println("Details of User: "+(i+1));
			System.out.println("Account Number: "+b[i].accNumber);
			System.out.println("Name: "+b[i].name);
			System.out.println("Balance: "+b[i].balance);
			System.out.println("Current PIN: "+b[i].pin);	
			
		}	
	}
	
	
	
	void deposit(int d) {
		balance+=d;
		System.out.println("Amount after Deposit: "+balance);
	}
	void withdraw(int w) {
		balance-=w;
		System.out.println("Amount after Withdraw: "+balance);
	}
	void getBalance() {
		System.out.println("Current Balance: "+balance);
	}
	void changePin(Scanner sc) {
	        System.out.println("Do you want to change PIN? (yes/no)");
	        String choice = sc.next();

	        if (choice.equalsIgnoreCase("yes")) {
	            System.out.println("Enter new PIN:");
	            pin = sc.nextInt();
	            System.out.println("PIN changed successfully!");
	        }
	      }
	
	

}
