package com.logicalstatements;
import java.util.Scanner;
public class ConditionalStmtsDemo10 {
//	Train Ticket Booking
//	Seats available
//	Payment done → confirm
//	else → cancel
//	Else → waiting list
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Train Ticket Booking");
		System.out.println("Is there any seats available..");
		String seats_avail=sc.next();
		
		if(seats_avail.equalsIgnoreCase("yes")) {
			System.out.println("Continue with payment process to book tickets");
			System.out.println("Done with your payment?");
			String status=sc.next();
			if(status.equalsIgnoreCase("yes"))
				System.out.println("Train tickets booked successfully");
			else
				System.out.println("Cancelled the tickets due to not completing the payment process");
		}
		else
			System.out.println("Server gets down due to too many requests");	
	}

}
