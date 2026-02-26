package com.javafundamentals;

import java.util.Scanner;

public class Book {
	int bookId;
	String title;
	String author;
	int price;
	int discount_Percentage;
	

	public static void main(String[] args) {
		Book b[]=new Book[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			b[i]=new Book();
			System.out.println("Enter Book ID: ");
			b[i].bookId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Title: ");
			b[i].title=sc.nextLine();
			
			System.out.println("Enter Author Name: ");
			b[i].author=sc.nextLine();
			System.out.println("Enter Price: ");
			b[i].price=sc.nextInt();
			System.out.println("Enter Discount Percentage on book: ");
			b[i].discount_Percentage=sc.nextInt();
			
			sc.nextLine();
			System.out.println();	
		}
		
		for(int i=0;i<3;i++) {
			float final_Price=(b[i].price-(b[i].price*b[i].discount_Percentage/100));
			System.out.println("Book NO: "+(i+1)+" Details: ");
			System.out.println("Book ID: "+b[i].bookId);
			System.out.println("Book Title: "+b[i].title);
			System.out.println("Book Author: "+b[i].author);
			System.out.println("Book Price: "+b[i].price);
			System.out.println("Book Final Price: "+final_Price);
			
		}
	}
}
