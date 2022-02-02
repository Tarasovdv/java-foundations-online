package ru.itsjava.interfaces.hw;

public class Man implements Walkable,Runnable, Swimable{


    @Override
    public void run() {
        System.out.println("Бегаем по утрам");
    }

    @Override
    public int maxRunDistance() {
        return 100;
    }

    @Override
    public void swim() {
        System.out.println("Ходим в бассейн");
    }

    @Override
    public double maxSwimSpeed() {
        return 12;
    }

    @Override
    public void walk() {
        System.out.println("Гуляем по выходным");
    }
}
