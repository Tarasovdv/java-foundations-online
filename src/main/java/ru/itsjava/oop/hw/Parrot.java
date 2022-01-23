package ru.itsjava.oop.hw;

import lombok.AllArgsConstructor;
import lombok.Data;



public class Parrot extends Bird{

    private static final String species = "Parrot";

    public Parrot() {
        super(species, 40);
    }
}
