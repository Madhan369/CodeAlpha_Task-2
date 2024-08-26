package com.CodeAlpha.HRS;

public class Room 
{
    int roomNumber;
    String roomType;
    double price;
    boolean isAvailable;

    public Room(int roomNumber, String roomType, double price) 
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isAvailable = true;
    }

    public void bookRoom() 
    {
        this.isAvailable = false;
    }

    public void freeRoom() 
    {
        this.isAvailable = true;
    }

    @Override
    public String toString() 
    {
        return "Room " + roomNumber + " (" + roomType + ") - Price: ₹" + price;
    }
}

