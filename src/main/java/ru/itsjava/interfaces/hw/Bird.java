package ru.itsjava.interfaces.hw;

public class Bird implements Walkable,Runnable, Swimable,Flyable{
    @Override
    public void fly() {
        System.out.println("Летать-наше призвание!!!");

    }

    @Override
    public String flyMaxDistance() {
        return "Летим далеко и с удовольствием";
    }

    @Override
    public void run() {
        System.out.println("А вот бегаем мы не очень(");

    }

    @Override
    public int maxRunDistance() {
        return 10;
    }

    @Override
    public void swim() {
        System.out.println("Плавать любим");

    }

    @Override
    public double maxSwimSpeed() {
        return 5;
    }

    @Override
    public void walk() {

        System.out.println("Гуляем и кормимся");
    }
}
