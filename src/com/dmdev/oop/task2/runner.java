package com.dmdev.oop.task2;


//import static com.dmdev.oop.task2.Floor.flats;
//import static com.dmdev.oop.task2.House.floors;

//        system.arrays.copy
//        додати функціонал додавання сущностей
//        Представить в виде классов и их композиции следующую модель.
//        - Каждый дом содержит свой номер (int), и множество этажей (массив).
//        - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
//        - Каждая квартира содержит свой номер (int), и множество комнат (массив).
//        - Каждая комната содержит поле проходная она или нет (boolean).
//        В каждом классе реализовать метод print, который на консоль выводит
//        информацию об объекте (должны присутствовать все поля объекта!).
//        Например, метод print класса этаж должен выводить на консоль:
//        “Этаж 2, количество квартир 18”
//        Создание всех объектов вынести в отдельный класс с методом main.
//        Там же реализовать метод printAllInformation, который на вход принимает
//        объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
public class runner {
    public static void main(String[] args) {
        newRoom();
        newRoom();
        newRoom();
        newFlat();
        newRoom();
        newRoom();
        newRoom();
        newRoom();
        newRoom();
        newRoom();

        System.out.println(tempRooms.length);
        newFlat();
        System.out.println(tempRooms.length);

        System.out.println(tempFlats[0].rooms.length);
        System.out.println(tempFlats[1].rooms.length);
        System.out.println(tempFlats.length);
        newFloor();
        System.out.println(tempFloors.length);

        newRoom();
        newRoom();
        newRoom();
        newRoom();
        newRoom();
        newRoom();
        newRoom();
        newRoom();
        newFlat();
        newFloor();
        System.out.println(tempFloors.length);
        System.out.println(tempFloors[0].flats.length);

    }

    static Room[] tempRooms = new Room[0];
    static Flat[] tempFlats = new Flat[0];
    static Floor[] tempFloors = new Floor[0];


    public static void newRoom() {
        int newLength = tempRooms.length + 1;
        Room[] temp = new Room[newLength];
        if (tempRooms.length > 0) {
            for (int i = 0; i < tempRooms.length; i++) {
                temp[i] = tempRooms[i];
            }
        }
        temp[newLength - 1] = new Room(newLength, false);
        tempRooms = temp;
    }

    public static void newFlat() {
        int newLength = tempFlats.length + 1;
        Flat[] temp = new Flat[newLength];
        if (tempFlats.length > 0) {
            for (int i = 0; i < tempFlats.length; i++) {
                temp[i] = tempFlats[i];
            }
        }
        temp[newLength - 1] = new Flat(newLength);
        tempFlats = temp;
        tempFlats[tempFlats.length - 1].rooms = tempRooms;
        tempRooms = new Room[0];
    }

    public static void newFloor() {
        int newLength = tempFloors.length + 1;
        Floor[] temp = new Floor[newLength];
        if (tempFloors.length > 0) {
            for (int i = 0; i < tempFloors.length; i++) {
                temp[i] = tempFloors[i];
            }
        }
        ;
        temp[newLength - 1] = new Floor(newLength);
        tempFloors = temp;
        tempFloors[tempFloors.length - 1].flats = tempFlats;
        tempFlats = new Flat[0];
    }
}


//шоб в класах небуло методів, тільки поля( не було ніякої поведінки)

