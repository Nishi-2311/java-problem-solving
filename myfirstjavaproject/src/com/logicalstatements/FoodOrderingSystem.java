package com.logicalstatements;

import java.util.Scanner;

public class FoodOrderingSystem {
    public static void main(String[] args) {
       calculateBill();
        
    }
    static void calculateBill() {
    	Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Nishi's Kitchen");
    	String ch = " ";
    	int price=0;
    	double total=0.0;
        do {
            System.out.println("Select the food type (Veg/Non-Veg):");
            String fd_type = sc.next();
            sc.nextLine();
            switch (fd_type) {
                case "Veg":
                    System.out.println("Select the category (Starters/Main course/Desserts):");
                    String cat1 = sc.nextLine();
                    switch (cat1) {
                        case "Starters":
                            System.out.println("Select the food item:");
                            String item = sc.nextLine();
                            switch (item) {
                                case "Veg Spring Roll" -> {
                                		price = 250;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Paneer Tikka" -> {
                                		price = 300;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Veg Kabab" -> {
                                		price = 300;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Veg Soup" -> {
                                		price = 200;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Veg Manchurian" -> {
                                		price = 250;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Mushroom Pakora" -> {
                                		price = 300;
                                    System.out.println("Price of this item is: " + price);
                                }
                                default -> System.out.println("Sorry!!Entered food item is not available");
                            }
                            total += price;
                            break;
                        case "Main course":
                            System.out.println("Select the food item:");
                            item = sc.nextLine();
                            switch (item) {
                                case "Veg Biriyani" -> {
                                		price = 450;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Paneer Butter Masala" -> {
                                		price = 475;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Veg Fried Rice" -> {
                                		price = 300;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Veg Dum Biriyani" -> {
                                		price = 550;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Veg Thali" -> {
                                		price = 600;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Dal Makhani" -> {
                                		price = 450;
                                    System.out.println("Price of this item is: " + price);
                                }
                                default -> System.out.println("Sorry!!Entered food item is not available");
                            }
                            total += price;
                            break;
                        case "Desserts":
                            System.out.println("Select the food item:");
                            item = sc.nextLine();
                            switch (item) {
                                case "Gulab Jamun" -> {
                                		price = 350;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Rasmalai" -> {
                                		price = 300;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Kulfi" -> {
                                		price = 150;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Fruit Salad" -> {
                                		price = 250;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Ice Cream" -> {
                                		price = 200;
                                    System.out.println("Price of this item is: " + price);
                                }
                                default -> System.out.println("Sorry!!Entered food item is not available");
                            }
                            total += price;
                            break;
                        default:
                            System.out.println("Sorry!!Entered category is not available");
                    }
                    break;
                case "Non-Veg":
                    System.out.println("Select the category (Starters/Main course/Desserts):");
                    String cat2 = sc.nextLine();
                    switch (cat2) {
                        case "Starters":
                            System.out.println("Select the food item:");
                            String item = sc.nextLine();
                            switch (item) {
                                case "Chicken Tikka" -> {
                                		price = 450;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Chicken Wings" -> {
                                		price = 500;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Fish Fry" -> {
                                		price = 500;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Mutton Kabab" -> {
                                		price = 550;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Prawn Fry" -> {
                                		price = 450;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Mutton Chops"  -> {
                                		price = 500;
                                    System.out.println("Price of this item is: " + price);
                                }
                                default -> System.out.println("Sorry!!Entered food item is not available");
                            }
                            total += price;
                            break;
                        case "Main course":
                            System.out.println("Select the food item:");
                            item = sc.nextLine();
                            switch (item) {
                                case "Chicken Biriyani" -> {
                                		price = 450;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Chicken Tikka Masala" -> {
                                		price = 500;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Prawn Biriyani" -> {
                            			price = 450;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Mutton Dum Biriyani" -> {
                            			price = 650;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Non-Veg Thali" -> {
                            			price = 600;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Mandi" -> {
                                		price = 700;
                                    System.out.println("Price of this item is: " + price);
                                }
                                default -> System.out.println("Sorry!!Entered food item is not available");
                            }
                            total += price;
                            break;
                        case "Desserts":
                            System.out.println("Select the food item:");
                            item = sc.nextLine();
                            switch (item) {
                                case "Egg Halwa" -> {
                                		price = 250;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Fruit Cream" -> {
                                		price = 200;
                                    System.out.println("Price of this item is: " + price);
                                }
                                case "Custard" -> {
                                		price = 180;
                                    System.out.println("Price of this item is: " + price);
                                }
                                default -> System.out.println("Sorry!!Entered food item is not available");
                            }
                            total += price;
                            break;
                        default:
                            System.out.println("Sorry!!Entered category is not available");
                    }
                    break;
                default:
                    System.out.println("Sorry!!Entered food type is not available");
            }
            System.out.println("Do you want to continue (yes/no):");
            ch = sc.next();
            sc.nextLine();
            if(ch.equalsIgnoreCase("no")) {
            		System.out.println("Bill excluding GST: "+total);
            		System.out.println("GST applied on your order is: 5%");
            		System.out.println("Bill including GST: "+(total+total*0.05));
            }
        } while (ch.equalsIgnoreCase("yes"));
    }
}
