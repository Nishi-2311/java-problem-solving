package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoopEx3 {
//	Print matrix (2D array) elements
//	34️⃣ Find sum of each row in matrix
//	35️⃣ Print transpose of matrix
//	36️⃣ Print diagonal elements
//	37️⃣ Check matrix symmetry
//	38️⃣ Print star square pattern
//	39️⃣ Print hollow square
//	40️⃣ Print chessboard pattern
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter no.of columns:");
		int col=sc.nextInt();
		int mat[][]=new int[rows][col];
		System.out.println("Enter numbers:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j]=sc.nextInt();
			}	
		}
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]+" ");
				sum+=mat[i][j];
			}
			System.out.println("Row "+(i+1)+" Sum : "+sum);
			System.out.println();
		}
	}

}
