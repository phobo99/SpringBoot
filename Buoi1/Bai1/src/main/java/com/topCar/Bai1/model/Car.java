package com.topCar.Bai1.model;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private  static int id =1 ;
    private String name;
    private String manufacturer;
    private int price;
    private String photo;

    public Car(String name, String manufacturer, int price, String photo) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.photo = photo;
        id++;
    }

    public Car(String value, String manufacturer, String s, String photo) {
        id++;
    }
}
