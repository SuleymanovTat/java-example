package ru.suleymanovtat.attraction.interface_abstract;

public class Main extends User implements Tree {

    public static void main(String[] args) {
        Main main =new Main();
        main.grow();
        main.work();
    }

    @Override
    public void grow() {
        System.out.println("grow");
    }

    @Override
    void work() {
        System.out.println("work");
    }
}
