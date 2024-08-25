package com.example.nourishingfarmsalpha;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.HashMap;

public class RecipeActivity extends AppCompatActivity {

    private boolean isFitCenter = true;
    private ScrollView ingredientsScrollView;
    private ScrollView stepsScrollView;
    private ImageView imageView;
    private ImageView fullSizeButton; // Changed from Button to ImageView
    private String imageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        // Get the title text from the Intent
        String recipeTitle = getIntent().getStringExtra("recipeTitle");

        // Set the title in the TextView
        TextView titleTextView = findViewById(R.id.title_recipe_page);
        titleTextView.setText(recipeTitle);

        // Initialize ScrollViews
        ingredientsScrollView = findViewById(R.id.ing_scroll_view);
        stepsScrollView = findViewById(R.id.steps_scroll_view);

        // Initialize Buttons
        Button ingredientsButton = findViewById(R.id.btn_ing);
        Button stepsButton = findViewById(R.id.btn_steps);
        fullSizeButton = findViewById(R.id.full_size); // Changed to ImageView

        // Initialize ImageView
        imageView = findViewById(R.id.item_img);

        // Set default view to Ingredients
        ingredientsScrollView.setVisibility(View.VISIBLE);
        stepsScrollView.setVisibility(View.GONE);

        // Handle Ingredients Button Click
        ingredientsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredientsScrollView.setVisibility(View.VISIBLE);
                stepsScrollView.setVisibility(View.GONE);
                stepsButton.setBackgroundColor(Color.TRANSPARENT);
                stepsButton.setTextColor(Color.BLACK);
                ingredientsButton.setBackgroundResource(R.drawable.btn_ing);
                ingredientsButton.setTextColor(Color.WHITE);
            }
        });

        // Handle Steps Button Click
        stepsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredientsScrollView.setVisibility(View.GONE);
                stepsScrollView.setVisibility(View.VISIBLE);
                ingredientsButton.setBackgroundColor(Color.TRANSPARENT);
                ingredientsButton.setTextColor(Color.BLACK);
                stepsButton.setBackgroundResource(R.drawable.btn_ing);
                stepsButton.setTextColor(Color.WHITE);
            }
        });

        // Get the ingredients and image URL based on the title
        DataStorage dataStorage = new DataStorage();
        ArrayList<HashMap<String, String>> dataTable = dataStorage.getDataTable();
        String ingredients = "";
        String steps = "";

        for (HashMap<String, String> item : dataTable) {
            if (item.get("title").equals(recipeTitle)) {
                ingredients = item.get("ingredients");
                steps = item.get("steps");
                imageUrl = item.get("image");
                break;
            }
        }

        // Set the ingredients in the corresponding TextView
        TextView ingredientsTextView = findViewById(R.id.ing_data);
        ingredientsTextView.setText(ingredients);

        // Set the steps in the corresponding TextView
        TextView stepsTextView = findViewById(R.id.steps_data);
        stepsTextView.setText(steps);

        // Load the image with Glide
        Glide.with(this)
                .load(imageUrl)
                .into(imageView);

        // Handle ImageView scaling
        fullSizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFitCenter) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    fullSizeButton.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);
                } else {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    fullSizeButton.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_ATOP);
                }
                isFitCenter = !isFitCenter;

                // Reload the image with Glide to reflect the scale type change
                Glide.with(RecipeActivity.this)
                        .load(imageUrl)
                        .into(imageView);
            }
        });

        // Handle back button click
        ImageView backButton = findViewById(R.id.back_btn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Closes the current activity and returns to the previous one
            }
        });
    }
}
