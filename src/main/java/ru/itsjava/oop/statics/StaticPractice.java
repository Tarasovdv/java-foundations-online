package ru.itsjava.oop.statics;

public class StaticPractice {
    public static void main(String[] args) {

//        System.out.println("Salary.increaseCoeficient = " + Salary.increaseCoeficient);
    Salary cleanWasherSalary = new Salary(5_000);
    Salary targetSalary = new Salary(10_000);

        System.out.println("cleanWasherSalary.getFullSalary() = " + cleanWasherSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        Salary.setIncreaseCoefficient(1.0);
        System.out.println("cleanWasherSalary.getFullSalary() = " + cleanWasherSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        System.out.println("Salary.CEO = " + Salary.CEO);
    }
}
