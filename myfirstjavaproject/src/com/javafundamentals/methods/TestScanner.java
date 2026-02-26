package com.javafundamentals.methods;
import java.util.Scanner;
public class TestScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int id=sc.nextInt();
		System.out.println("Enter Salary:");
		double sal=sc.nextDouble();
		System.out.println("Enter Gender:");
		char gen=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter Full Name:");
		String fullname=sc.nextLine();
		System.out.println("Enter boolean value:");
		boolean bool=sc.nextBoolean();
		
		System.out.println("Enter values:");
		int a=sc.nextInt();
		int b=sc.nextInt();		
		System.out.println("Enter a Characater");
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("You entered Vowel");
		}
		else {
			System.out.println("You entered Consonant");
		}
		
		show(a,b);
		
		System.out.println();
		System.out.println(id);
		System.out.println(sal);
		System.out.println(gen);
		System.out.println(fullname.toUpperCase());
		System.out.println(fullname.length());
		System.out.println("You entered "+bool);
	}
	static void show(int a,int b) {
		System.out.println("Sum is: "+(a+b));
		System.out.println("Difference is: "+(a-b));
		System.out.println("Product is: "+(a*b));
		double d=a/b;
		System.out.printf("Quotient is: %.2f",d);
	}

}
