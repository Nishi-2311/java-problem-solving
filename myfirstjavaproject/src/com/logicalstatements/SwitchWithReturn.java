package com.logicalstatements;

import java.util.Scanner;

public class SwitchWithReturn {
//	Input: color
//	Return: action (Stop/Go/Wait)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color:");
		String c=sc.next();
		System.out.println(trafficSignals(c));
		
//		String color=switch(c){
//			case "red"-> "Stop";
//			case "yellow"-> "Wait";
//			case "green"-> "Go";
//			default -> "Invalid";
//		};
//		System.out.println(color);
		
//		String color=switch(c){
//		case "red"->{
//			yield "Stop";
//		}
//		case "yellow"-> {
//			yield "Wait";
//		}
//		case "green"-> {
//			yield "Go";
//		}
//		default ->{
//			yield "Invalid";
//		}
//		};
//		System.out.println(color);
		
		

	}
	static String trafficSignals(String c) {
		switch(c){
		case "red"->{
			return "Stop";
		}
		case "yellow"-> {
			return "Wait";
		}
		case "green"-> {
			return "Go";
		}
		default -> {
			return "Invalid";
		}
		
		}
	}

}
