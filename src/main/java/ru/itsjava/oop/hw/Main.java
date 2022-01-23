package ru.itsjava.oop.hw;

public class Main {
    public static void main(String[] args) {
        Bird par = new Parrot();
        Bird rav = new Raven();

        System.out.println("par.toString() = " + par.toString());
        System.out.println("rav.toString() = " + rav.toString());
        System.out.println("rav.getSpecies() = " + rav.getSpecies());
        rav.setWingspan(222);
        System.out.println("rav.getWingspan() = " + rav.getWingspan());
        System.out.println("rav = " + rav);
    }
}
