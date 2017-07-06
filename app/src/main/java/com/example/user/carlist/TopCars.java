package com.example.user.carlist;

import java.util.ArrayList;


public class TopCars {

        private ArrayList<Car> list;

        public TopCars() {
            list = new ArrayList<Car>();
            list.add(new Car(1, "Ferrari", "Red"));
            list.add(new Car(2, "Audi", "Blue"));
            list.add(new Car(3, "Mercedes", "Silver"));
            list.add(new Car(4, "Renault", "Yellow"));
            list.add(new Car(5, "Mercedes", "Green"));
            list.add(new Car(6, "Mercedes", "Silver"));
            list.add(new Car(7, "Peugeot", "Grey"));
            list.add(new Car(8, "Volskwagen", "Black"));
            list.add(new Car(9, "Volvo", "Navy"));
            list.add(new Car(10, "Fiat", "Pink"));
            list.add(new Car(11, "Renault", "Orange"));
            list.add(new Car(12, "Lamborghini", "Blue"));
        }

        public ArrayList<Car> getList() {
            return new ArrayList<Car>(list);
        }

}
