package com.javafundamentals;

import java.math.BigInteger;

public class PredefinedObjectDataTypes1 {

	public static void main(String[] args) {
		
		
		BigInteger b1=new BigInteger("787478589589686989849898548962626");
		BigInteger b2=new BigInteger("72746827467874785895896869898498985489648378746");
		
		System.out.println(b1.abs());
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
		System.out.println(b1.max(b2));
		System.out.println(b1.min(b2));
		System.out.println(b1.mod(b2));
		System.out.println(b1.pow(2));
		System.out.println(b1.shiftLeft(2));
		System.out.println(b1.shiftRight(1));
		System.out.println(b1.sqrt());
		System.out.println(b1.toString());
		System.out.println(b1.hashCode());
		System.out.println("**********");
		System.out.println(b1.sqrtAndRemainder());
		System.out.println(b1.hashCode());
		
	}

}
