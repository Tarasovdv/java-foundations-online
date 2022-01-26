package ru.itsjava.oop.statics.hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Car {
    private String model;
    private String color;
    private static double price = 100_000;

    public static void setPrice(double price1){
        price = price1;
    }

    public   double getPrice(){
        return price;
    }



}
