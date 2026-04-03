package com.logicalstatements.loops;

import java.util.Scanner;

public class CheckNumIsPrimeOrNot {
	static boolean checkPrime(int num){
        if(num==0||num==1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        if(checkPrime(n)){
            System.out.println(n+" is Prime");
        }
        else{
            System.out.println(n+" is  not Prime");
        }

	}

}
