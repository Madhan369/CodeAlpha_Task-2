package com.CodeAlpha.HRS;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
        	System.out.println("\n--------------------------");
            System.out.println("Hotel Reservation System");
            System.out.println("--------------------------");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Make a Reservation");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option: ");

            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    hotel.showAvailableRooms();
                    break;
                case 2:
                    hotel.makeReservation();
                    break;
                case 3:
                    hotel.viewBookings();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

