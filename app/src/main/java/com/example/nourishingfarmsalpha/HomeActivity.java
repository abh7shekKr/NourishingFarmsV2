package com.example.nourishingfarmsalpha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecipeAdapter recipeAdapter;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, SearchActivity.class));
            }
        });

        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Get data from DataStorage
        DataStorage dataStorage = new DataStorage();
        ArrayList<HashMap<String, String>> dataTable = dataStorage.getDataTable();

        // Set the adapter
        recipeAdapter = new RecipeAdapter(this, dataTable);
        recyclerView.setAdapter(recipeAdapter);
    }
}
