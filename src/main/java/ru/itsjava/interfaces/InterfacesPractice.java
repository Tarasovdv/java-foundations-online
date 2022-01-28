package ru.itsjava.interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {

        Creatable kh = new Gin();
        kh.createWish();

        Creatable bg = new BadGin();
        bg.createWish();
    }
}
