package com.example.fragment2application;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_food;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_food = itemView.findViewById(R.id.tv_food);
    }

    public void onBind(String foodName){
        tv_food.setText(foodName);

    }
}
