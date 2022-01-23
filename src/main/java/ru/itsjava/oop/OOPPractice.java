package ru.itsjava.oop;

public class OOPPractice {
    public static void main(String[] args) {

        Phone iphone = new IPhone();

        System.out.println("iphone.toString() = " + iphone.toString());

        Phone iphone2 = new IPhone();
        System.out.println("iphone2.toString() = " + iphone2.toString());
    }
}
