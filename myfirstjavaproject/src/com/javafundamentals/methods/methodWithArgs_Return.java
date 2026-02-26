package com.javafundamentals.methods;
import java.util.Scanner;
public class methodWithArgs_Return {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		methodWithArgs_Return obj=new methodWithArgs_Return();
		stat_method2(a,stat_method1(a,obj.inst_method2(a,obj.inst_method1(a,b))));
		sc.close();

	}
	int inst_method1(int a,int b) {
		int c=a+b;
		System.out.println("Additon : "+c);
		return c;
		
	}
	int inst_method2(int a,int c) {
		int d=a+c;
		System.out.println("Addition : "+d);
		return d;
	}
	static int stat_method1(int a,int d) {
		int e=a+d;
		System.out.println("Addition : "+e);
		return e;
		
	}
	static int stat_method2(int a,int e) {
		int f=a+e;
		System.out.println("Addition : "+f);
		return f;
		
	}

}
