package ru.itsjava.interfaces.comparable.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Comparable<Person>, Cloneable {

    private final String name;
    private final String lastName;
    private double age;


    @Override
    public int compareTo(Person person) {
        int res = this.lastName.compareTo(person.lastName);
        if (res == 0) {
            res = this.name.compareTo(person.name);
            if (res == 0) {
                res = (int) (age - person.age);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}' + "\n";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //2. Реализовать интерфейс Comparable. Реализовать метод compareTo(), который будет сравнивать человека по фамилии, если фамилии одинаковые,
// то по имени, в ином случае по возрасту.
}
