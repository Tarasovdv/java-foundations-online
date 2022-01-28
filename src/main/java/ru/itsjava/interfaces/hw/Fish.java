package ru.itsjava.interfaces.hw;

public class Fish implements Walkable,Runnable,Swimmable,Flyable{
    @Override
    public void fly() {
        System.out.println("   no    ");
    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("   no    ");
    }

    @Override
    public int maxRunDistance() {
        return 0;
    }

    @Override
    public void swimm() {
        System.out.println("  yes   ");
    }

    @Override
    public double maxSwimSpeed() {
        return 100;
    }

    @Override
    public void walk() {
        System.out.println("   no    ");
    }
}
