package com.example.fragment2application;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> foodList = new ArrayList<>();
    private RecyclerView rvFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        rvFood = findViewById(R.id.rv_food);
        foodList.add("Cookie");
        foodList.add("Cracker");
        foodList.add("Ginger snap");
        foodList.add("Hardtack");
        foodList.add("Buffalo wing");
        foodList.add("Bread");
        foodList.add("Baguette");
        foodList.add("Omelette");
        foodList.add("Smoked egg");
        foodList.add("List of cakes");
        foodList.add("Spaghetti");
        foodList.add("Blue cheese");
        foodList.add("Donuts");

        FoodAdapter adapter = new FoodAdapter(foodList);
        rvFood.setAdapter(adapter);

    }
}