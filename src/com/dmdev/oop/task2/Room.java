package com.dmdev.oop.task2;

public class Room {
    int roomNumber;
    boolean walkThrough;
    public  Room(int roomNumber, boolean walkThrough){
        this.roomNumber=roomNumber;
        this.walkThrough=walkThrough;
    }
public void printState(){
    System.out.println("room number: " +  this.roomNumber+"\nWalkhrough: "+this.walkThrough);
}
}
