package com.logicalstatements;

import java.util.Scanner;

public class ConditionalStmtsDemo11 {
//	Password Strength Checker
//	Length > 8
//	Contains number
//	Contains special char
//	Then strong
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*************Password Strength Checker*************");
		System.out.println("Enter Password:");
		String pwd=sc.next();
		
		if(pwd.length()>8) {
			if(pwd.matches("^(?=.*[0-9]).*$")) {
				//System.out.println("Your password is partially strong");
				if(pwd.matches("^(?=.*[@#_$]).*$"))
					System.out.println("Your password is fully strong");
				else
					System.out.println("Please include a special character to make fully strong");
			}
			else
				System.out.println("Your password is not strong enough");
		}
		else
			System.out.println("Password length must be greater than 8");
	}

}
