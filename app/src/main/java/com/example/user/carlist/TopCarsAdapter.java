package com.example.user.carlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TopCarsAdapter extends ArrayAdapter<Car> {

    public TopCarsAdapter(Context context, ArrayList<Car> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cars_items, parent, false);
        }

        Car currentCar = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentCar.getRanking().toString());

        TextView brand = (TextView) listItemView.findViewById(R.id.brand);
        brand.setText(currentCar.getBrand().toString());

        TextView colour = (TextView) listItemView.findViewById(R.id.colour);
        colour.setText(currentCar.getColour().toString());

        listItemView.setTag(currentCar);

        return listItemView;
    }
}