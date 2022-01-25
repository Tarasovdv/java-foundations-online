package ru.itsjava.junit;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {

    private final String name;
    private int age;

    public void birthday() {
        int newAge = age + 1;
        this.age = newAge;
        System.out.println("С днем рождения, " + name + "!!! Тебе сегодня " + (newAge) + " годиков!!!");
    }

    public boolean takeBeer() {
        if (age >= 18) return true;
        return false;
    }

//      1. Написать свой класс Person с полями имя, возраст +
//
//      2. Метод void birthday() (который увеличивает возраст на 1) +
//
//      и boolean takeBeer(), который проверяет возраст и выдает true если возраст больше 18 и false в ином случае
//
//      3. Написать все возможные тесты на этот класс
}
