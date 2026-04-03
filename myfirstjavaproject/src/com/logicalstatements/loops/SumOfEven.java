package com.logicalstatements.loops;

import java.util.Scanner;

public class SumOfEven {
	
	static int evenSum(int n) {
		int sum=0;
		int evenCount=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
				evenCount++;
			}
		}
		System.out.println("Count of all Even Numbers is: "+evenCount);
		return sum;
	}
	static int oddSum(int n) {
		int sum=0;
		int oddCount=0;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				sum=sum+i;
				oddCount++;
			}
		}
		System.out.println("Count of all Odd Numbers is: "+oddCount);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number upto where you want to (sum/count):");
		int n=sc.nextInt();
		int even_sum=evenSum(n);
		int odd_sum=oddSum(n);
		System.out.println("Sum of all Even Numbers is: "+even_sum);
		System.out.println("Sum of all Odd Numbers is: "+odd_sum);

	}

}
