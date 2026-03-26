package com.javafundamentals.methods;
import java.util.Scanner;
public class ATMSystem {
	int accNumber;
	String name;
	int balance;
	int currPin;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ATMSystem user=new ATMSystem();
		System.out.println("Enter Account Number: ");
		user.accNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		user.name=sc.nextLine();
		System.out.println("Enter Balance: ");
		user.balance=sc.nextInt();
		System.out.println("Enter PIN: ");
		user.currPin=sc.nextInt();
		
		System.out.println("Details of User: ");
		System.out.println("Account Number: "+user.accNumber);
		System.out.println("Name: "+user.name);
		System.out.println("Balance: "+user.balance);
		System.out.println("Current PIN: "+user.currPin);
		user.changePin(user.currPin);
		
		System.out.println("Enter your Choice:");
		int ch=sc.nextInt();
		while (ch != 5) {
			switch (ch) {
			case 1:
				System.out.println("Enter amount to deposit: ");
				int dp = sc.nextInt();
				user.deposit(dp);
				break;
			case 2:
				System.out.println("Enter amount to withdraw: ");
				int w = sc.nextInt();
				user.withdraw(w);
				break;
			case 3:
				user.checkBalance();
				break;
			case 4:
				user.changePin(user.currPin);
				break;
			case 5:System.out.println("Exit");
					
			}
		}
	}
	void deposit(int amount) {
		balance+=amount;
		System.out.println("Deposited: "+balance);
	}
	void withdraw(int amount) {
		if(amount>balance)
			System.out.println("Insufficient Balance");
		else
			balance-=amount;
			System.out.println("Withdrawn: "+balance);
	}
	void checkBalance() {
		System.out.println("Check Balance: "+balance);
	}
	void changePin(int oldPin) {
		if(oldPin==currPin) {
			System.out.println("Login Successful");
			System.out.println("ATM Operations:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Change PIN");
			System.out.println("5. Exit");
		}
		else {
			System.out.println("You entered Wrong PIN");
		}
	}
	

}
