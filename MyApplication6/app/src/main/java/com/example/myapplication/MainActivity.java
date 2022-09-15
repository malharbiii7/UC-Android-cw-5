package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Resturant> myList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Resturant resturant1 = new Resturant("big mac", 2, R.drawable.img );
         Resturant resturant2 = new Resturant("McRoyale", 2, R.drawable. img_1);
        Resturant resturant3 = new Resturant("McChicken", 2, R.drawable.img_2);
        Resturant resturant4 = new Resturant("Chicken Nuggets", 1.200, R.drawable. img_3);
        Resturant resturant5 = new Resturant("Fries", 1, R.drawable.img_4);


        myList.add(resturant1);
        myList.add(resturant2);
        myList.add(resturant3);
        myList.add(resturant4);
        myList.add(resturant5);


        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager( this);
        recycler.setLayoutManager(manager);


        ItemAdapter adapter = new ItemAdapter(myList,  this);
        recycler.setAdapter(adapter);

            }
        }