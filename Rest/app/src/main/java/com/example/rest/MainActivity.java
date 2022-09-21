package com.example.rest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Salon> myList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Salon salon1 = new Salon("Natural treatments", 6, R.drawable.img_4);
        Salon salon2 = new Salon("Shampoo", 12, R.drawable. img_1);
         Salon salon3 = new Salon("Nail ", 8, R.drawable.img);
        Salon salon4 = new Salon("Hair care", 6.500, R.drawable. img_3);
        Salon salon5 = new Salon("Summer", 15, R.drawable.img_2);

        myList.add(salon1);
        myList.add(salon2);
        myList.add(salon3);
        myList.add(salon4);
        myList.add(salon5);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager( this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(myList,  this);
        recycler.setAdapter(adapter);
    }
}