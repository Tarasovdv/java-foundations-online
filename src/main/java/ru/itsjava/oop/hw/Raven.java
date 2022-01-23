package ru.itsjava.oop.hw;

public class Raven extends Bird{

    private static final String species = "Raven";

    public Raven() {
        super(species, 56);
    }

    @Override
    public String toString() {
        return "Raven{Cool Bird}";
    }
}
