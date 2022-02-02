package ru.itsjava.interfaces.hw;

public class Polygon {
    public static void main(String[] args) {

        Flyable bird = new Bird();
        Walkable cat = new Cat();
        Runnable dog = new Dog();
        Swimable fish = new Fish();
        Walkable man = new Man();

        bird.fly();
        System.out.println("bird.flyMaxDistance() = " + bird.flyMaxDistance());
        bird.fly();
        System.out.println("bird.maxRunDistance() = " + bird.flyMaxDistance());

        cat.walk();
        dog.run();
        fish.swim();
        man.walk();




    }
}

//1. Создать следующие интерфейсы:
//        - Walkable с методом void walk()
//        - Swimable с методами void swim(), double maxSwimSpeed()
//        - Runnable с методами void run(), int maxRunDistance()
//        - Flyable с методами void fly() и String flyMaxDistance()
//
//        2. Создать классы: Man (человек), Dog, Cat, Bird, Fish и реализовать соответствующие интерфейсы
