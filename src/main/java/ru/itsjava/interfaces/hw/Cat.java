package ru.itsjava.interfaces.hw;

public class Cat implements Walkable,Runnable, Swimable{


    @Override
    public void run() {
        System.out.println("Бежим быстро, но не долго");
    }

    @Override
    public int maxRunDistance() {
        return 100;
    }

    @Override
    public void swim() {
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
