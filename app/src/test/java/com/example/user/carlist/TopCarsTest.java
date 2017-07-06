package com.example.user.carlist;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class TopCarsTest {

    @Test
    public void getListTest() {
        TopCars topMovies = new TopCars();
        assertEquals(12, topMovies.getList().size());
    }
}
