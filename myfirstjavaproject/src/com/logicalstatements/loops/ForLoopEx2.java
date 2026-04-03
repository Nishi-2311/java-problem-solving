package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoopEx2 {
	
//	41 Shopping cart total (sum of item prices)
//	42️⃣ Student marks → calculate average
//	43️⃣ Find highest score among students
//	44️⃣ Count number of passed students
//	45️⃣ Calculate electricity bill for multiple users
//	46️⃣ Print attendance report
//	47️⃣ Find duplicate elements in array
//	48️⃣ Remove duplicates from array
//	49️⃣ Count frequency of each element
//	50️⃣ Sort array using simple logic (bubble sort idea)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of items:");
		int n=sc.nextInt();
		String item[]=new String[n];
		int price[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter item no: "+(i+1));
			item[i]=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter price for item"+" "+(i+1)+":");
			price[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=price[i];
		}
		System.out.println("Sum of All Item Prices: "+sum);
			
	}

}
