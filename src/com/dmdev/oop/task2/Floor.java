package com.dmdev.oop.task2;

public class Floor {
     int floorNumber;
     Flat[] flats = {};
    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }


    public  void newFlat() {
        int newLength = flats.length + 1;
        Flat[] temp = new Flat[newLength];
        if (flats.length > 0) {
            for (int i = 0; i < flats.length; i++) {
                temp[i] = flats[i];
            }
        }
        ;
        temp[newLength - 1] = new Flat(newLength);
        flats = temp;
    }

    public  void printState() {
        System.out.println("Floor №: " + floorNumber + "\nNumber of flats: " + flats.length);
        for (Flat flat : flats) flat.printState();
    }
}
