package ui;

import java.util.Scanner;

import service.BusService;
import service.BusServiceImpl;

public class BusClient {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        BusService Service = (BusService) new BusServiceImpl();

	        while (true) {
	            System.out.println("\nBus Reservation System:");
	            System.out.println("1. Register");
	            System.out.println("2. Login");
	            System.out.println("3. Check Bus Availability");
	            System.out.println("4. Make Reservation");
	            System.out.println("5. Cancel Reservation");
	            System.out.println("6. Print Ticket");
	            System.out.println("7. Wallet Payment");
	            System.out.println("8. Update Reservation");
	            System.out.println("9. Update Route");
	            System.out.println("10. Update Bus");
	            System.out.println("0. Exit");
	            System.out.print("Select an option: ");

	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Registration selected.");
	                    break;
	                case 2:
	                    System.out.println("Login selected.");
	                    break;
	                case 3:
	                    System.out.println("Bus Availability Enquiry selected.");
	                    break;
	                case 4:
	                   System.out.println("Make Reservation selected.");
	                    break;
	                case 5:
	                  System.out.println("Cancel Reservation selected.");
	                    break;
	                case 6:
	                    System.out.println("Print Ticket selected.");
	                    break;
	                case 7:
	                    System.out.println("Wallet Payment selected.");
	                    break;
	                case 8:
	                 System.out.println("Update Reservation selected.");
	                    break;
	                case 9:
	                    System.out.println("Update Route selected.");
	                    break;
	                case 10:
	                    System.out.println("Update Bus selected.");
	                    break;
	                case 0:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }
	}

