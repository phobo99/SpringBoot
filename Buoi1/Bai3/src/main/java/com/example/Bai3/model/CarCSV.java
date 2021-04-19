package com.example.Bai3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarCSV {
    private String id;
    private String name;
    private String manufacturer;
    private String price;

    @Override
    public String toString() {
        return name+" Manufacturer : "+manufacturer+" Price :"+price+" triệu";
    }
}
