package ru.itsjava.interfaces.hw;

public class Dog implements Walkable,Runnable,Swimmable,Flyable{
    @Override
    public void fly() {
        System.out.println(" Летать? неа!");

    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Бежаааааать");
    }

    @Override
    public int maxRunDistance() {
        return 20;
    }

    @Override
    public void swimm() {
        System.out.println("Плыыыыыть");
    }

    @Override
    public double maxSwimSpeed() {
        return 5;
    }

    @Override
    public void walk() {
        System.out.println("Гуляяяяять!!!! Урааааа");
    }
}
