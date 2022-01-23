package ru.itsjava.oop.hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Bird {

    private final String species;
    private double wingspan;

//    public Bird(String species, double wingspan) {
//        this.species = species;
//        this.wingspan = wingspan;
//    }


//    public String toString(){
//        return "Species: " + species + " / " + "Wingspan: " + wingspan;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true; // если объект сравниваем с самим собой- тру(рефлексивность)
//        if (o == null || getClass() != o.getClass()) return false; //проверка на нулл, а так же на класс объекта(должен быть один класс у объектов)
//
//        Bird bird = (Bird) o;//явное приведение объекта к типу(класса)
//
//        if (Double.compare(bird.wingspan, wingspan) != 0) return false;//сравнение размаха крыльев
//        return species.equals(bird.species);//сравнение видов птиц(equals для стринга)
//    }
//
//    @Override
//    public int hashCode() {
//        long temp = Double.doubleToLongBits(wingspan);//
//        return (int) (temp ^ (temp >>> 32));//получаем хэшкод по размаху(конвертируем дабл в инт)
//    }
}
