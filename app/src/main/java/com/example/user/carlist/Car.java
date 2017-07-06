package com.example.user.carlist;

/**
 * Created by user on 05/07/2017.
 */

public class Car {

    private int ranking;
    private String brand;
    private String colour;

    public Car(Integer ranking, String brand, String colour) {
        this.ranking = ranking;
        this.brand = brand;
        this.colour = colour;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

}
