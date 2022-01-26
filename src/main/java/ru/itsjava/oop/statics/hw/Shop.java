package ru.itsjava.oop.statics.hw;

public class Shop {
    public static void main(String[] args) {

        Car bently = new Car("Bently Continentale","Red");
        Car zhiga = new Car("Zhiguli", "Blue");

        System.out.println("zhiga.getPrice() = " + zhiga.getPrice());
        System.out.println("bently.getPrice() = " + bently.getPrice());

        Car.setPrice(2_000);

        System.out.println("zhiga.getPrice() = " + zhiga.getPrice());
        System.out.println("bently.getPrice() = " + bently.getPrice());


    }
}
