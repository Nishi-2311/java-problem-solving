package com.logicalstatements.loops;
import java.util.Scanner;
public class ForLoopEx1 {
//	1️ Print numbers from 1 to 10
//	2️ Print numbers from 10 to 1
//	3️ Print even numbers from 1 to 50
//	4️ Print odd numbers from 1 to 50
//	5️ Print sum of first 10 numbers
//	6️ Print multiplication table of a number
//	7️ Count digits in a number
//	8️ Reverse a number
//	9️ Find sum of digits
//	🔟 Find product of digits
	public static void main(String[] args) {
		
		for(byte i=1;i<=10;i++)
			System.out.print(i+" ");
		System.out.println("**********");
		
		for(short i=10;i>=1;i--)
			System.out.print(i+" ");
		System.out.println("**********");
		
		for(byte i=1;i<=50;i++)
			if(i%2==0)
				System.out.print(i+" ");
		System.out.println("***********");
		
		for(short i=1;i<=50;i++)
			if(i%2!=0)
				System.out.print(i+" ");
		System.out.println("***********");
		
		int sum=0;
		for(int i=1;i<=10;i++)
			sum+=i;
		System.out.println("Sum of first 10 numbers is :"+sum);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print table:");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(num+" * "+i+" = "+num*i);
		
//		Print multiplication tables from 1–10
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("-----------------------");
		}
		 
		System.out.println("-----------------------");
		
//		Print all prime numbers from 1–100
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) 
					count++;
			}
			if(count==2) 
				System.out.print(i+" ");
		}
		System.out.println("-----------------------");
		
		
		System.out.println("Enter a number to get upto prime numbers:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
		
	}

}
