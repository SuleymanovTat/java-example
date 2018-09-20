package ru.suleymanovtat;

public class ClassObjectExample {

    public static void main(String[] args) {
        Car carVaz = new Car("vaz", 5);
        Car carBmw = new Car("bmw", 3);
        System.out.println(carVaz);
        System.out.println(carBmw);
    }
}

class Car {

    private String name;
    private int door;

    public Car(String name, int door) {
        this.name = name;
        this.door = door;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", door=" + door +
                '}';
    }
}