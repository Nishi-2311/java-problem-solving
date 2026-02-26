package com.javafundamentals.methods;
import java.util.Scanner;
public class countOf2Thousands {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int amount=sc.nextInt();
//		int two_thousands=num/2000;
//		int five_hundreds=(num%2000)/500;
//		num=(num%2000)%500;
//		int two_hundreds=num/200;
//		int one_hundreds=num/100;
//		num=num%100;
//		int fifty=num/50;
//		int twenty=(num%50)/20;
//		num=(num%50)%20;
//		int tens=num/10;
//		int five=(num%10)/5;
//		int two=((num%10)%5)/2;
//		int one=(((num%10)%5)%2)/1;
//		System.out.println("No.of Two Thousands: "+two_thousands);
//		System.out.println("No.of Five Hundreds: "+five_hundreds);
//		System.out.println("No.of Two Hundreds: "+two_hundreds);
//		System.out.println("No.of One Hundreds: "+one_hundreds);
//		System.out.println("No.of Fifty's: "+fifty);
//		System.out.println("No.of Twenty's: "+twenty);
//		System.out.println("No.of Tens: "+tens);
//		System.out.println("No.of Fives: "+five);
//		System.out.println("No.of Twos: "+two);
//		System.out.println("No.of Ones: "+one);
		

		int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

		for(int note : notes) {
			int count = amount / note;
		    amount = amount % note;

		    System.out.println("No. of " + note + "'s: " + count);
		   
		}
	}

}
