package com.dmdev.oop.task2;

public class House {

     int houseNumber=1;
     Floor[] floors = {};


    public void newFloor() {
        int newLength = floors.length + 1;
        Floor[] temp = new Floor[newLength];
        if (floors.length > 0) {
            for (int i = 0; i < floors.length; i++) {
                temp[i] = floors[i];
            }
        }
        ;
        temp[newLength - 1] = new Floor(newLength);
        floors = temp;
    }

    public void printState() {
        System.out.println("House №: " + houseNumber + "\nNumber of floors: " + floors.length);
        for (Floor floor : floors) floor.printState();
    }
}
