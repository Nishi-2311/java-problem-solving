package com.operators;

public class TestAssignment {

	public static void main(String[] args) {
		int a1=10;
		int b1=3;
		System.out.println("Addition:"+(a1+b1));
		System.out.println("Subtraction:"+(a1-b1));
		System.out.println("Multiplication:"+a1*b1);
		System.out.println("Division:"+a1/b1);
		System.out.println("Modulus:"+a1%b1);
		
		double s=5.0;
		int result=10;
		result+=s;
		System.out.println(result);
		
		int x=1,y=1,z=-2;
		int res=(x++ * y++) - z-- + (y * x--) - (--z * y);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(res);
		
		int a = 5;
		int b = 10;
		int c = a++ + ++b + a + b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int a2 = 5;
		int b2 = a2++ + ++a2;
		System.out.println(b);
		
		int a3 = 10;
		int b3 = 5;
		System.out.println(a > b && b++ < a);
		System.out.println(b);
		
		int a4 = 5;
		a4 += 3 * 2;
		System.out.println(a);
		
		int a5 = 5;
		System.out.println(a5++ + a5++ + ++a5);
		
		int a6 = 5;
		int b6 = 2;
		System.out.println((a6 += b6) * (a6 -= b6));
		
	}

}
