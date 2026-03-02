package com.javafundamentals.methods;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth values: ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Area of Rectangle is: "+area(l,b));
        System.out.println("Enter side: ");
        int s=sc.nextInt();
        System.out.println("Area of Square is: "+area(s));
        System.out.println("Enter Radius: ");
        double r=sc.nextDouble();
        System.out.printf("Area of Circle is: %.2f",area(r));
        
        sc.close();
        
    }
    static int area(int l, int b){
        return l*b;
    }
    static int area(int s){
        return s*s;
    }
    static double area(double r){
        return Math.PI*r*r;
    }
	
	
}