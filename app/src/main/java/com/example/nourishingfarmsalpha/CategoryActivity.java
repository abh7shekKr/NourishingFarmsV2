package com.example.nourishingfarmsalpha;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        String foodCategory = getIntent().getStringExtra("foodCategory");

        TextView title = findViewById(R.id.title);
        title.setText(foodCategory.substring(0, 1).toUpperCase() + foodCategory.substring(1).toLowerCase());

        DataStorage dataStorage = new DataStorage();
        ArrayList<HashMap<String, String>> filteredList = new ArrayList<>();

        for (HashMap<String, String> item : dataStorage.getDataTable()) {
            if (item.get("category").equalsIgnoreCase(foodCategory)) {
                filteredList.add(item);
            }
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CategoryAdapter adapter = new CategoryAdapter(filteredList);
        recyclerView.setAdapter(adapter);

        ImageView backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Closes the current activity and returns to the previous one
            }
        });
    }
}
