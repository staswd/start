package com.dmdev.oop.task2;

public class Flat {
     int flatNumber;
      Room[] rooms = {};

    public Flat(int flatNumber) {
        this.flatNumber = flatNumber;

    }


    public  void newRoom() {
        int newLength = rooms.length + 1;
        Room[] temp = new Room[newLength];
        if (rooms.length > 0) {
            for (int i = 0; i < rooms.length; i++) {
                temp[i] = rooms[i];
            }
        }
        ;
        temp[newLength - 1] = new Room(newLength, false);
        rooms = temp;
    }

    public  void printState() {
        System.out.println("Flat №: " + flatNumber + "\nNumber of rooms: " + rooms.length);
        for (Room room : rooms) {
            room.printState();
        }
    }
}

