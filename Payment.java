package com.CodeAlpha.HRS;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel 
{
    ArrayList<Room> rooms = new ArrayList<>();
    Payment paymentProcessor = new Payment();

    public Hotel() 
    {
        rooms.add(new Room(101, "Single", 100.0));
        rooms.add(new Room(102, "Double", 150.0));
        rooms.add(new Room(103, "Suite ", 300.0));
    }

    public void showAvailableRooms() 
    {
        System.out.println("\nAvailable Rooms:");
        System.out.println();
        for (Room room : rooms) 
        {
            if (room.isAvailable) 
            {
                System.out.println(room);
            }
        }
    }

    public void makeReservation() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter room number to book: ");
        int roomNumber = sc.nextInt();

        for (Room room : rooms) 
        {
            if (room.roomNumber == roomNumber && room.isAvailable) 
            {
                System.out.println("Room price is ₹" + room.price);
                System.out.println("\nEnter payment amount: ");
                double paymentAmount = sc.nextDouble();

                if (paymentProcessor.processPayment(paymentAmount, room.price)) 
                {
                    room.bookRoom();
                    System.out.println("Room " + roomNumber + " has been booked successfully.");
                } else 
                {
                    System.out.println("Booking failed due to insufficient payment.");
                }
                return;
            }
        }
        System.out.println("Room not available or invalid room number.");
    }

    public void viewBookings() 
    {
        System.out.println("\nBooked Rooms:");
        for (Room room : rooms) 
        {
            if (!room.isAvailable) 
            {
                System.out.println(room);
            }
        }
    }
}

