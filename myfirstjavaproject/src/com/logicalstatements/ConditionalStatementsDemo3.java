package com.logicalstatements;
import java.util.Scanner;
public class ConditionalStatementsDemo3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		//21️ Check if number is 2-digit or 3-digit
		String n=Integer.toString(num);
		if(num<=999) {
			if(num>=10 && num<=99) {
				System.out.println(num+" -number is 2-digit number");
				//30️ Check if sum of 2 digits is even or odd
				if((n.charAt(n.length()-1)+n.charAt(0))%2==0)
					System.out.println("sum of 2 digits is even");
				else
					System.out.println("sum of 2 digits is odd");
			}
				
			else if(num>=100 && num<=999)
				System.out.println("Entered number is 3-digit number");
			else
				System.out.println("Please enter number within the range");
		}
		System.out.println("**************************************");
		
		//22️ Check if number is exactly 100
		String res1=(num==100)?"Number is exactly 100":"Number is not exactly 100";
		System.out.println(res1);
		System.out.println("**************************************");
		
		//23️ Check if number is between 50–100
		String res2=(num>50 && num<100)?"Number is in between 50–100":"Number is not in between 50–100";
		System.out.println(res2);
		System.out.println("**************************************");
		
		//24️ Check if number is even and greater than 50
		String res3=(num%2==0 && num>50)?"Entered number is even and greater than 50":"Entered number is not greater than 50";
		System.out.println(res3);
		System.out.println("**************************************");
		
		//25️ Check if number is odd and less than 20
		String res4=(num%2==1 && num<20)?" Entered number is odd and less than 20":" Entered number is even and not less than 20";
		System.out.println(num+"-"+res4);
		System.out.println("**************************************");
		
		//26️ Check if divisible by 2, 3, and 5
		if(num%2==0 && num%3==0 && num%5==0)
			System.out.println(num+" is divisible by 2, 3, and 5");
		else
			System.out.println(num+" is not divisible by 2, 3, and 5");
		System.out.println("**************************************");
		
		//27️ Check if not divisible by 4
		String res5=(num%4==0)?"Number is divisible by 4":"Number is not divisible by 4";
		System.out.println(res5);
		System.out.println("**************************************");
		
		//28️ Check if last digit is even or odd
		if(n.charAt(n.length()-1)%2==0)
			System.out.println(n+" is Even");
		else
			System.out.println(n+" is Odd");
		System.out.println("**************************************");
		
		//29️ Check if first digit equals last digit (only for 2-digit numbers)
		boolean res6=(n.charAt(n.length()-1)==n.charAt(0))?true:false;
		System.out.println("Is first digit equals last digit..."+res6);
		System.out.println("**************************************");
		
	}

}
