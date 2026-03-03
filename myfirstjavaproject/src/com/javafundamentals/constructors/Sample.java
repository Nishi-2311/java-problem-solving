package com.javafundamentals.constructors;

public class Sample {
	int rollNo;
	String myName;
	Sample(int id,String name){
		rollNo=id;
		myName=name;
		System.out.println("Parameterized constructor");
		//System.out.println(id);
		//System.out.println(name);
	}
	public static void main(String[] args) {
		Sample s=new Sample(1,"SIRI");
		
		System.out.println(s.rollNo);
		System.out.println(s.myName);
	}

}
