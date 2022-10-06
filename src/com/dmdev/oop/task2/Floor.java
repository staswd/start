package com.dmdev.oop.task2;

public class Floor {
    int floorNumber;
    Flat[] flats = {};

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }


//    public void printState() {
//        System.out.println("Floor №: " + floorNumber + "\nNumber of flats: " + flats.length);
//        for (Flat flat : flats) flat.printState();
//    }
}
