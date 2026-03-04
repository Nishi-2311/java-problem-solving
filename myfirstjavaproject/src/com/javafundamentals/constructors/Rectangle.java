package com.javafundamentals.constructors;

public class Rectangle{
    double length;
    double width;
    double area;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
        this.area=length*width;
        System.out.println("Area of Rectangle is: "+area);
    }
    public static void main(String args[]){
        Rectangle rect=new Rectangle(5.00,8.00);
        
    }
}