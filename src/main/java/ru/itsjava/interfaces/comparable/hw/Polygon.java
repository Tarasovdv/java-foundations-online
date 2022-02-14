package ru.itsjava.interfaces.comparable.hw;

import java.util.Arrays;

public class Polygon {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person("Дмитрий", "Тарасов", 29);
        Person p2 = new Person("Антон", "Тарасов", 32);
        Person p3 = new Person("Ольга", "Копейко", 32);
        Person p4 = new Person("Ольга", "Копейко", 30);
        Person p5 = new Person("Инна", "Черкасова", 28);
        Person p6 = new Person("Семен", "Кокотлив", 34);

        Person[] people = {p1, p2, p3, p4, p5,p6};

        System.out.println(" до сортировки " + "\n" + Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(" после сортировки " + "\n" +Arrays.toString(people));

        Person dimasan = new Person("Taramary","Sensay",33);
        Person dimasan2 = (Person) dimasan.clone();

        System.out.println("Original");
        System.out.println("dimasan = " + dimasan);
        System.out.println("Copy");
        System.out.println("dimasan2 = " + dimasan2);



    }


//1. Создать класс Person ( Поля: Имя, Фамилия и возраст)
//2. Реализовать интерфейс Comparable. Реализовать метод compareTo(), который будет сравнивать человека по фамилии, если фамилии одинаковые,
// то по имени, в ином случае по возрасту.
//3. В классе Main добавить в массив несколько человек. Отсортировать и вывести на экран.
//4. В классе Person реализовать метод clone()
//5. В классе Main создать клона некоторого Person.


}
