package ru.itsjava.interfaces.hw;

public class Polygon {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Man man = new Man();

        bird.fly();
        System.out.println("bird.flyMaxDistance() = " + bird.flyMaxDistance());
        bird.run();
        System.out.println("bird.maxRunDistance() = " + bird.maxRunDistance());

        cat.walk();
        dog.run();
        fish.fly();
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
