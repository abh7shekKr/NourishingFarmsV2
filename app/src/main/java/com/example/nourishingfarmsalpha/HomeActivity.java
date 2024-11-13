package com.example.nourishingfarmsalpha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecipeAdapter recipeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //bread category
        ImageView breadImageView = findViewById(R.id.bread1);

        breadImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(HomeActivity.this, CategoryActivity.class);

                // Pass the ID of the ImageView as an extra (in this case, as a food category)
                intent.putExtra("foodCategory", "Wraps");

                // Start the new activity
                startActivity(intent);
            }
        });

        //salad category
        ImageView saladsImageView = findViewById(R.id.salad);

        saladsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(HomeActivity.this, CategoryActivity.class);

                // Pass the ID of the ImageView as an extra (in this case, as a food category)
                intent.putExtra("foodCategory", "salad");

                // Start the new activity
                startActivity(intent);
            }
        });

        //sandwich category
        ImageView sandwichImageView = findViewById(R.id.sandwiches1);

        sandwichImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(HomeActivity.this, CategoryActivity.class);

                // Pass the ID of the ImageView as an extra (in this case, as a food category)
                intent.putExtra("foodCategory", "sandwich");

                // Start the new activity
                startActivity(intent);
            }
        });

        //juices category
        ImageView juicesImageView = findViewById(R.id.juices1);

        juicesImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(HomeActivity.this, CategoryActivity.class);

                // Pass the ID of the ImageView as an extra (in this case, as a food category)
                intent.putExtra("foodCategory", "juice");

                // Start the new activity
                startActivity(intent);
            }
        });

        //soup category
        ImageView soupImageView = findViewById(R.id.soups1);

        soupImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(HomeActivity.this, CategoryActivity.class);

                // Pass the ID of the ImageView as an extra (in this case, as a food category)
                intent.putExtra("foodCategory", "soup");

                // Start the new activity
                startActivity(intent);
            }
        });

        //veggies category
        ImageView veggiesImageView = findViewById(R.id.veggies);

        veggiesImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(HomeActivity.this, CategoryActivity.class);

                // Pass the ID of the ImageView as an extra (in this case, as a food category)
                intent.putExtra("foodCategory", "bowl");

                // Start the new activity
                startActivity(intent);
            }
        });





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
        recipeAdapter = new RecipeAdapter(this, dataTable, new RecipeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(String title) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(HomeActivity.this, RecipeActivity.class);

                // Pass the title text as an extra
                intent.putExtra("recipeTitle", title);

                // Start the new activity
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(recipeAdapter);
    }
}
