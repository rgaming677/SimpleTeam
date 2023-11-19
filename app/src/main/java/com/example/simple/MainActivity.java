package com.example.simple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<JudulModel> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
    }

    private void addData() {
        elements = new ArrayList<>();
        elements.add(new JudulModel("Judul 1"));
        elements.add(new JudulModel("Judul 2"));
        elements.add(new JudulModel("Judul 3"));

        RecyclerView recyclerView = findViewById(R.id.rvMenu);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}