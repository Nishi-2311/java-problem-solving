package com.logicalstatements;

import java.util.Scanner;

public class ConditionalStatementsDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:");
		int n=sc.nextInt();
		
		//check a number is Positive,Negative or Zero
		if(n>0)
			System.out.println("Positive");
		else if(n<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		System.out.println("***********************");
		
		//Largest number 
		System.out.println("Enter any two values to check larger number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int large=(a>b)?a:b;
		System.out.println("Largest number : "+large);
		
		//Smallest number
		int small=(a<b)?a:b;
		System.out.println("Smallest number : "+small);
		System.out.println("***********************");
		
		//Divisible by 5 or not
		if(n%5==0)
			System.out.println(n+" is divisible by 5");
		else
			System.out.println(n+" is not divisible by 5");
		System.out.println("***********************");
		
		//Divisible by both 2 and 3
		if(n%2==0 && n%3==0)
			System.out.println(n+" is divisible by 2 and 3");
		else
			System.out.println(n+" is not divisible by 2 and 3");
		System.out.println("***********************");
		
		//check whether a character is vowel or consonant
		System.out.println("Enter Character:");
		char c=sc.next().charAt(0);
		
		if(c=='a'|| c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
			System.out.println("You entered character is :Vowel");
		else
			System.out.println("You entered character is :Consonant");
		System.out.println("***********************");
		
		//multiple of 10
		if(n%10==0) 
			System.out.println(n+" is multiple of 10");
		else
			System.out.println(n+" is not multiple of 10");
		System.out.println("***********************");
		
		//Voting eligibility
		if(n>18)
			System.out.println("Eligible for Voting");
		else
			System.out.println("Not Eligible for Voting");
		System.out.println("***********************");
		
		//Single digit or not?
		System.out.println("Enter Number to check it is single digit or not:");
		int num=sc.nextInt();
		if(num>=~8 && num<=9)
			System.out.println("Single digit Number");
		else
			System.out.println("Not a Single digit Number");
		System.out.println("***********************");
	}

}
