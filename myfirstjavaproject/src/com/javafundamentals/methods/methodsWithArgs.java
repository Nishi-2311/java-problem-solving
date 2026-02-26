package com.javafundamentals.methods;
import java.util.Scanner;
public class methodsWithArgs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		methodsWithArgs obj1=new methodsWithArgs();
		obj1.inst_method1(a,b);
		sc.close();

	}
	void inst_method1(int a,int b) {
		int c=a+b;
		System.out.println("Instance Method 1:Addition of 2 integers:"+c);
		inst_method2(a,c);
	}
	void inst_method2(int a,int c) {
		int d=a+c;
		System.out.println("Instance Method 2:Addition of 2 integers:"+d);
		stat_method1(a,d);
	}
	static void stat_method1(int a,int d) {
		int e=a+d;
		System.out.println("Instance Method 1:Addition of 2 integers:"+e);
		stat_method2(a,e);
	}
	static void stat_method2(int a,int e) {
		int f=a+e;
		System.out.println("Instance Method 2:Addition of 2 integers:"+f);
	}

}
