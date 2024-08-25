package com.example.nourishingfarmsalpha;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class RecipeActivity extends AppCompatActivity {

    private boolean isFitCenter = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recipe);

        // Get the title text from the Intent
        String recipeTitle = getIntent().getStringExtra("recipeTitle");

        // Set the title in the TextView
        TextView titleTextView = findViewById(R.id.title_recipe_page);
        titleTextView.setText(recipeTitle);

        // Get the ingredients based on the title
        DataStorage dataStorage = new DataStorage();
        ArrayList<HashMap<String, String>> dataTable = dataStorage.getDataTable();
        String ingredients = "";

        for (HashMap<String, String> item : dataTable) {
            if (item.get("title").equals(recipeTitle)) {
                ingredients = item.get("ingredients");
                break;
            }
        }

        // Set the ingredients in the corresponding TextView
        TextView ingredientsTextView = findViewById(R.id.ing_data);
        ingredientsTextView.setText(ingredients);

        ImageView imageView = findViewById(R.id.item_img);

        findViewById(R.id.full_size).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFitCenter) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                } else {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
                isFitCenter = !isFitCenter;
            }
        });

        ImageView backButton = findViewById(R.id.back_btn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Closes the current activity and returns to the previous one
            }
        });
    }
}
