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
        House house1= new House();
        house1.newFloor();
//        House.newFloor();
//        House.newFloor();
//        floors[0].newFlat();
        house1.floors[0].newFlat();
        house1.floors[0].newFlat();
        house1.floors[0].newFlat();
        house1.floors[0].flats[2].newRoom();
        house1.floors[0].flats[2].newRoom();
        house1.floors[0].flats[2].newRoom();
        house1.floors[0].flats[2].newRoom();

        house1.floors[0].flats[2].rooms[2].walkThrough = true;
        house1.printState();
        }
}


//шоб в класах небуло методів, тільки поля( не було ніякої поведінки)

