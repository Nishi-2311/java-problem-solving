package com.javafundamentals.constructors;

public class CountOfObjects {
	static int count=0;
	CountOfObjects(){
		count+=1;
		System.out.println("Count of Objects is :"+count);
	}

	public static void main(String[] args) {
		CountOfObjects c1=new CountOfObjects();
		CountOfObjects c2=new CountOfObjects();
		CountOfObjects c3=new CountOfObjects();
	}

}
