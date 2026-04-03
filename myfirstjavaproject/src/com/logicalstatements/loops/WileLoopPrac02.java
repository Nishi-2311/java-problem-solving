package com.logicalstatements.loops;

import java.util.Scanner;

public class WileLoopPrac02 {


//	17️⃣ Print Fibonacci series up to N terms
//	18️⃣ Print Fibonacci numbers less than N
//	19️⃣ Count how many digits are prime (2,3,5,7)
//	20️⃣ Remove last digit repeatedly and print
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Print multiplication table of a number
		System.out.println("Enter a number to print table:");
		int n=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(n + "*" + i + "=" + n * i);
			i++;
		}
		System.out.println("*************");
//		Find product of digits of a number
//		Count number of even and odd digits
//		Find largest digit in a number
//		Find smallest digit in a number
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int r=0;
		int prod=1;
		int evenCnt=0;
		int oddCnt=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		while(num!=0) {
			r=num%10;
			num=num/10;
			prod*=r;
			if(r%2==0) {
				evenCnt++;
			}
			else {
				oddCnt++;
			}
			if(r>max) {
				max=r;
			}
			if(r<min){
				min=r;
			}
		}
		System.out.println("Product of digits of a given num is:"+prod);
		System.out.println("count of even digits in given num is: "+evenCnt);
		System.out.println("count of odd digits in given num is: "+oddCnt);
		System.out.println("Largest digit among all is: "+max);
		System.out.println("Smallest digit among all is: "+min);
	}

}
