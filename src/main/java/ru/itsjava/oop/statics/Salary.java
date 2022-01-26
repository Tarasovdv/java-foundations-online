package ru.itsjava.oop.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Salary {
    private final double baseSalary;
    private static double increaseCoefficient = 2.5;
    public final static double CEO = 50_000;


    public double getFullSalary() {
        return baseSalary * increaseCoefficient;
    }

    public static void setIncreaseCoefficient(double increaseCoefficient1){
        increaseCoefficient = increaseCoefficient1;
    }
}
