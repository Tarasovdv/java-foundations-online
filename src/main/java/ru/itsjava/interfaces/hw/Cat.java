package ru.itsjava.interfaces.hw;

public class Cat implements Walkable,Runnable,Swimmable,Flyable{
    @Override
    public void fly() {
        System.out.println("Летать не умеем");
    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Бежим быстро, но не долго");
    }

    @Override
    public int maxRunDistance() {
        return 100;
    }

    @Override
    public void swimm() {
        System.out.println("Любим плавать, но все");
    }

    @Override
    public double maxSwimSpeed() {
        return 10;
    }

    @Override
    public void walk() {
        System.out.println("Больше лежим, чем гуляем");
    }
}
