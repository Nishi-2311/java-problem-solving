package com.javafundamentals.methods;
import java.util.Scanner;
public class calculatorFlow {
    static int add(int a, int b){
        int c=a+b;
        return c;
    }
    static int multiply(int n){
        return n;
    }
    int subtract(int num, int value) {
    		return num-value;
    }
    int square(int num) {
    		return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter number for multiplication:");
        int n=sc.nextInt();
        calculatorFlow obj=new calculatorFlow();
        System.out.println(add(a,b));
        System.out.println(multiply(n)*add(a,b));
        System.out.println(obj.subtract(a,b));
        System.out.println(obj.square(n)*obj.subtract(a,b));
        sc.close();
    }
}
