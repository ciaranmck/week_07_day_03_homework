package com.example.user.carlist;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new Car(13, "Opel", "Red");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)13, car.getRanking());

    }

    @Test
    public void getTitleTest() {
        assertEquals("Opel", car.getBrand());

    }

    @Test
    public void getColourTest() {
        assertEquals("Red", car.getColour());

    }
}
