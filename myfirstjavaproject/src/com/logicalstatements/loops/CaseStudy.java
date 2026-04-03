package com.logicalstatements.loops;

import java.util.Scanner;

public class CaseStudy {
	int votersCnt=0,nonVotersCnt=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CaseStudy obj=new CaseStudy();
		int age[]=new int[10];
		
		System.out.println("Enter the Voter details");
		for(int i=0;i<=9;i++) {
			System.out.println("Enter voter "+(i+1)+" age:");
			age[i]=sc.nextInt();
		}
		int oldVoter=age[0];
		int youngVoter=age[0];
		for(int i=0;i<=9;i++) {
			if(age[i]>=18) {
				obj.votersCnt++;
				if (age[i] > oldVoter) {
					oldVoter = age[i];
				} if(age[i]<youngVoter) {
					youngVoter = age[i];
				}
			}
			else {
				obj.nonVotersCnt++;
			}
					
		}
		System.out.println("Number of Voters:"+obj.votersCnt);
		System.out.println("Number of  Non Voters:"+obj.nonVotersCnt);
		System.out.println("Oldest Voter among 10 people is: "+oldVoter);
		System.out.println("Youngest Voter among 10 people is :"+youngVoter);
		sc.close();

	}

}
