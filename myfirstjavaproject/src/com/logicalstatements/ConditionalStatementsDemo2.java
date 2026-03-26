package com.logicalstatements;
import java.util.Scanner;
public class ConditionalStatementsDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		//Largest number among three
		if(a>b) {
			if(a>c)
				System.out.println("Larger Number is: "+a);
			else
				System.out.println("Larger Number is: "+c);
		}
		else {
			if(b>c)
				System.out.println("Larger Number is: "+b);
			else
				System.out.println("Larger Number is: "+c);
		}
		
		//Smallest number among three
		int res=(a<b)?(a<c?a:c):(b<c?b:c);
		System.out.println("Smaller Number is: "+res);
		
		System.out.println("**********************");
		
		
		//Leap year or not
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		if(year%400==0)
			System.out.println("Leap year");
		else
			System.out.println("Not a Leap year");
		System.out.println("**********************");
		
		//Divisible by both 3 and 5
		System.out.println("Enter a value:");
		int num=sc.nextInt();
		if(num%3==0 && num%5==0)
			System.out.println(num+" is divisible by both 3 and 5");
		else
			System.out.println(num+" is not divisible by both 3 and 5");
		System.out.println("**********************");
		
		
		//Divisible by 3 or 5 and Number in range (1–100)
		if(num%3==0 || num%5==0 && num>=1 && num<=100) {
			System.out.println(num+" is divisible by 3 or 5");
			System.out.println(num+" is in between 1 to 100");
		}
		else
			System.out.println(num+" is not divisible by 3 or 5");
		System.out.println("**********************");
		
		//Uppercase or lowercase
		System.out.println("Enter a Character:");
		char letter=sc.next().charAt(0);
		int lett=(int) letter;
		if(lett>=65 && lett<=90)
			System.out.println("UpperCase");
		else
			System.out.println("LowerCase");
		System.out.println("**********************");
		
		//Check perfect square (for known inputs like 1–100 only using conditions)
		sc.nextLine();
		
		
		
		//Check if number ends with 5
		sc.nextLine();
		System.out.println("Enter a number:");
		String n=sc.nextLine();
		if(n.charAt(n.length()-1)=='5')
		    System.out.println("Ends with 5");
		else
		   System.out.println("Not Ends with 5");
		System.out.println("**********************");
		
		//Divisible by 7
		if(num%7==0)
			System.out.println(n+" is Divisible by 7");
		else
			System.out.println(n+" is not Divisible by 7");
	}

}
