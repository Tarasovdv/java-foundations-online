package ru.itsjava.junit;

public class Bar {
    public static void main(String[] args) {

        Person dima = new Person("Dmitriy", 29);
        Person liza = new Person("Eliza", 17);
        dima.birthday();
        System.out.println("dima.takeBeer() = " + dima.takeBeer());
        System.out.println("liza.takeBeer() = " + liza.takeBeer());
        liza.birthday();
        System.out.println("liza.takeBeer() = " + liza.takeBeer());
    }
}
