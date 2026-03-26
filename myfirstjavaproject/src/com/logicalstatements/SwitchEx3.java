package com.logicalstatements;

import java.util.Scanner;

public class SwitchEx3 {
//	Main menu:
//
//		Account type
//		→ Savings / Current
//
//		Inside each:
//
//		Deposit / Withdraw / Balance
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance=0;
		String ch=" ";
		System.out.println("Welcome to Bank");
		System.out.println("Enter account type(savings/current):");
		String acc_Type=sc.next();
		do {
			switch(acc_Type) {
				case	 "savings"->{
					System.out.println("You choosed savings account!!");
					System.out.println("Choose one operation(deposit/withdraw/balance):");
					String op=sc.next();
					switch(op) {
						case "deposit"->{
							System.out.println("Enter amount to deposit:");
							double amount=sc.nextInt();
							balance+=amount;
							System.out.println(amount+" debited successfully");
							System.out.println("Total Amount : "+balance);
						}
						case "withdraw"->{
							System.out.println("Enter amount to withdraw:");
							double amount=sc.nextInt();
							balance-=amount;
							System.out.println(amount+" withdrawn successfully");
							System.out.println("Total Amount : "+balance);
						}
						case "balance"->{
							System.out.println("Balance Amount : "+balance);
						}
						default -> System.out.println("Enter operation is invalid");
					}
				}
			case	 "current"->{
				System.out.println("You choosed current account!!");
				System.out.println("Choose one operation(deposit/withdraw/balance):");
				String op=sc.next();
				switch(op) {
					case "deposit"->{
						System.out.println("Enter amount to deposit:");
						double amount=sc.nextInt();
						balance+=amount;
						System.out.println(amount+" debited successfully");
						System.out.println("Total Amount : "+balance);
					}
					case "withdraw"->{
						System.out.println("Enter amount to withdraw:");
						double amount=sc.nextInt();
						balance-=amount;
						System.out.println(amount+" withdrawn successfully");
						System.out.println("Total Amount : "+balance);
					}
					case "balance"->{
						System.out.println("Balance Amount : "+balance);
					}
					default -> System.out.println("Enter operation is invalid");
				}
			}
			default -> System.out.println("Entered account type is invalid");
		}
			System.out.println("Do you want to continue(y or n):");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("y"));
			
		
	}

}
