package com.javafundamentals.constructors;
//Create class Voter
//
//Data:
//
//name
//
//age
//
//isEligible
//
//Constructor:
//
//Accept name and age
//
//If age ≥ 18 → eligible
//
//Otherwise print "Not eligible"
import java.util.Scanner;
public class Voter {
	String name;
	int age;
	boolean isEligible;
	Voter(){ }
	Voter(String name,int age){
		this.name=name;
		this.age=age;
		if(age>=18)
			System.out.println("Eligible for voting");
		else
			System.out.println("Not eligible");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Voter v1=new Voter();
		System.out.println("Enter Name:");
		v1.name=sc.nextLine();
		System.out.println("Enter Age:");
		v1.age=sc.nextInt();
		
		Voter v2=new Voter(v1.name,v1.age);
	}

}
