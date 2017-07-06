package com.example.user.carlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopCarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cars_list);

        TopCars topCars = new TopCars();

        ArrayList<Car> list = topCars.getList();

        TopCarsAdapter carAdapter = new TopCarsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(carAdapter);
    }

    public void getCar(View listItem) {
        Car car = (Car) listItem.getTag();
        Log.d(getClass().toString(), car.getBrand());
    }
}
