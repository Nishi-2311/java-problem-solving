package com.javafundamentals.constructors;

public class BooksConstructorChaining {
	String bookName;
	String authorName;
	double price;
	String releasedOn;
	
	BooksConstructorChaining(String bookName,String authorName,double price,String releasedOn){
		this.bookName=bookName;
		this.authorName=authorName;
		this.price=price;
		this.releasedOn=releasedOn;
		System.out.println("Four-arg constructor called");
	}
	
	BooksConstructorChaining(String bookName,String authorName,double price){
		this(bookName,authorName,price,"01-01-1990");
		System.out.println("Three-arg constructor called");
	}
	
	BooksConstructorChaining(String bookName,String authorName){
		this(bookName,authorName,650.00);
		System.out.println("Two-arg constructor called");
	}
	
	BooksConstructorChaining(String bookName){
		this(bookName,"Valmiki");
		System.out.println("One-arg constructor called");
	}
	
	BooksConstructorChaining(){
		this("Ramayanam");
		System.out.println("No-arg constructor called");
	}
	void show() {
		System.out.println("Book Name: "+bookName);
		System.out.println("Author Name: "+authorName);
		System.out.println("Price: "+price);
		System.out.println("Book Released On: "+releasedOn);
		
	}
	public static void main(String[] args) {
		BooksConstructorChaining b=new BooksConstructorChaining();
		b.show();
	}
	

}
