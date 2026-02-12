package com.javaintroduction;

import java.util.*;
public class Cricket {
		String playerName;
		int jerseyNumber;
		int age;
		int highestScore;
		static String board="BCCI";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cricket players[]=new Cricket[11];
		for(int i=0;i<11;i++) {
			players[i]=new Cricket();
			System.out.println("Enter details for Player:"+(i+1));
			System.out.print("Enter Player Name: ");
			players[i].playerName=sc.nextLine();
			System.out.print("Enter Jersey Number: ");
			players[i].jerseyNumber=sc.nextInt();
			System.out.print("Enter Age: ");
			players[i].age=sc.nextInt();
			System.out.print("Enter Highest Score: ");
			players[i].highestScore=sc.nextInt();
			
			sc.nextLine(); // clear buffer
           System.out.println();
		}
		
		for(int i=0;i<11;i++) {
			System.out.println("Player"+i+ " Details: ");
			System.out.println("Player"+i+" Name: "+players[i].playerName);
			System.out.println("Player"+i+" JerseyNumber: "+players[i].jerseyNumber);
			System.out.println("Player"+i+" Age: "+players[i].age);
			System.out.println("Player"+i+" Highest Score: "+players[i].highestScore);
			System.out.println("Player"+i+" Board: "+board);
			System.out.println();
		}
		/*Cricket player1=new Cricket();
		player1.playername="Dhoni";
		player1.jerseynumber=7;
		player1.age=45;
		player1.highestscore=100;
		System.out.println("**********Player 1 Details**********");
		System.out.println("Player Name: "+player1.playername);
		System.out.println("Player JerseyNumber: "+player1.jerseynumber);
		System.out.println("Player Age: "+player1.age);
		System.out.println("Player Highest Score: "+player1.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player2=new Cricket();
		player2.playername="Kohli";
		player2.jerseynumber=18;
		player2.age=36;
		player2.highestscore=95;
		System.out.println("**********Player 2 Details**********");
		System.out.println("Player Name: "+player2.playername);
		System.out.println("Player JerseyNumber: "+player2.jerseynumber);
		System.out.println("Player Age: "+player2.age);
		System.out.println("Player Highest Score: "+player2.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player3=new Cricket();
		player3.playername="Abhishek";
		player3.jerseynumber=4;
		player3.age=65;
		player3.highestscore=130;
		System.out.println("**********Player 3 Details**********");
		System.out.println("Player Name: "+player3.playername);
		System.out.println("Player JerseyNumber: "+player3.jerseynumber);
		System.out.println("Player Age: "+player3.age);
		System.out.println("Player Highest Score: "+player3.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player4=new Cricket();
		player4.playername="Rohit Sharma";
		player4.jerseynumber=44;
		player4.age=50;
		player4.highestscore=110;
		System.out.println("**********Player 4 Details**********");
		System.out.println("Player Name: "+player4.playername);
		System.out.println("Player JerseyNumber: "+player4.jerseynumber);
		System.out.println("Player Age: "+player4.age);
		System.out.println("Player Highest Score: "+player4.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player5=new Cricket();
		player5.playername="Surya Yadav";
		player5.jerseynumber=63;
		player5.age=51;
		player5.highestscore=90;
		System.out.println("**********Player 5 Details**********");
		System.out.println("Player Name: "+player5.playername);
		System.out.println("Player JerseyNumber: "+player5.jerseynumber);
		System.out.println("Player Age: "+player5.age);
		System.out.println("Player Highest Score: "+player5.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player6=new Cricket();
		player6.playername="Boomra";
		player6.jerseynumber=93;
		player6.age=57;
		player6.highestscore=98;
		System.out.println("**********Player 6 Details**********");
		System.out.println("Player Name: "+player5.playername);
		System.out.println("Player JerseyNumber: "+player5.jerseynumber);
		System.out.println("Player Age: "+player5.age);
		System.out.println("Player Highest Score: "+player5.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player7=new Cricket();
		player7.playername="Dhoni";
		player7.jerseynumber=7;
		player7.age=45;
		player7.highestscore=100;
		System.out.println("**********Player 7 Details**********");
		System.out.println("Player Name: "+player1.playername);
		System.out.println("Player JerseyNumber: "+player1.jerseynumber);
		System.out.println("Player Age: "+player1.age);
		System.out.println("Player Highest Score: "+player1.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player8=new Cricket();
		player8.playername="Rahul";
		player8.jerseynumber=1;
		player8.age=42;
		player8.highestscore=80;
		System.out.println("**********Player 8 Details**********");
		System.out.println("Player Name: "+player8.playername);
		System.out.println("Player JerseyNumber: "+player8.jerseynumber);
		System.out.println("Player Age: "+player8.age);
		System.out.println("Player Highest Score: "+player8.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player9=new Cricket();
		player9.playername="Subman Gill";
		player9.jerseynumber=1;
		player9.age=45;
		player9.highestscore=110;
		System.out.println("**********Player 9 Details**********");
		System.out.println("Player Name: "+player9.playername);
		System.out.println("Player JerseyNumber: "+player9.jerseynumber);
		System.out.println("Player Age: "+player9.age);
		System.out.println("Player Highest Score: "+player9.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player10=new Cricket();
		player10.playername="Hardik";
		player10.jerseynumber=33;
		player10.age=37;
		player10.highestscore=120;
		System.out.println("**********Player 10 Details**********");
		System.out.println("Player Name: "+player10.playername);
		System.out.println("Player JerseyNumber: "+player10.jerseynumber);
		System.out.println("Player Age: "+player10.age);
		System.out.println("Player Highest Score: "+player10.highestscore);
		System.out.println("Player Board: "+board);
		
		Cricket player11=new Cricket();
		player11.playername="Kuldeep Yadav";
		player11.jerseynumber=23;
		player11.age=32;
		player11.highestscore=60;
		System.out.println("**********Player 11 Details**********");
		System.out.println("Player Name: "+player11.playername);
		System.out.println("Player JerseyNumber: "+player11.jerseynumber);
		System.out.println("Player Age: "+player11.age);
		System.out.println("Player Highest Score: "+player11.highestscore);
		System.out.println("Player Board: "+board);*/
	}
}
