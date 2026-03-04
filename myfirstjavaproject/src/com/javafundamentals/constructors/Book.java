package com.javafundamentals.constructors;

public class Book{
    String title;
    String author;
    double price;
    Book(){
       System.out.println("Default Book Created"); 
    }
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public static void main(String args[]){
        Book b1=new Book();
        b1.show();
        Book b2=new Book("Ramayanam","Valmiki",1000.00);
        b2.show();
        
    }
    void show(){
        System.out.println("Title of Book is : "+title);
        System.out.println("Author of Book is : "+author);
        System.out.println("Price of Book is : "+price);
    }
}