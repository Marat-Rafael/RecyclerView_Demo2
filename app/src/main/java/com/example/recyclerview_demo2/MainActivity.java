package com.example.recyclerview_demo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String string1[];
    String string2[];
    int images[] = {R.drawable.c_mas_mas_50, R.drawable.c_sharp_50, R.drawable.java_50,
            R.drawable.javascript_50, R.drawable.kotlin_50, R.drawable.python_50,
            R.drawable.ruby_50, R.drawable.swift_50, R.drawable.typescript_50, R.drawable.visual_studio_50};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        string1 = getResources().getStringArray(R.array.programing_languages);
        string2 = getResources().getStringArray(R.array.discription);


        MyAdapter myAdapter = new MyAdapter(this, string1, string2, images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}