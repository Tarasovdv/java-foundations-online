package ru.itsjava.interfaces.hw;

public class Fish implements Swimable {


    @Override
    public void swim() {
        System.out.println("  yes   ");
    }

    @Override
    public double maxSwimSpeed() {
        return 100;
    }


}
