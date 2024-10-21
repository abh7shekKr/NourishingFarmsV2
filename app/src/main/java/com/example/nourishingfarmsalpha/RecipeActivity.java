package com.example.nourishingfarmsalpha;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecipeActivity extends AppCompatActivity {

    private boolean isFitCenter = true;
    private ScrollView ingredientsScrollView;
    private ScrollView stepsScrollView;
    private ImageView imageView;
    private ImageView fullSizeButton;
    private String imageUrl;

    private String ingImg = "";
    private boolean isUsingDrawableImage = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        // Get the title text from the Intent
        String recipeTitle = getIntent().getStringExtra("recipeTitle");
        String category = "";
        category= getIntent().getStringExtra("category");
        String col1 = getIntent().getStringExtra("col1");
        String col2 = getIntent().getStringExtra("col2");
        String col3 = getIntent().getStringExtra("col3");
        String col4= getIntent().getStringExtra("col4");


        // Set the title in the TextView
        TextView titleTextView = findViewById(R.id.title_recipe_page);
        titleTextView.setText(recipeTitle);

        // Initialize ScrollViews
        ingredientsScrollView = findViewById(R.id.ing_scroll_view);
        stepsScrollView = findViewById(R.id.steps_scroll_view);

        // Initialize Buttons
        Button ingredientsButton = findViewById(R.id.btn_ing);
        Button stepsButton = findViewById(R.id.btn_steps);
        fullSizeButton = findViewById(R.id.full_size);

        // Initialize ImageView
        imageView = findViewById(R.id.item_img);

        // Set default view to Ingredients
        ingredientsScrollView.setVisibility(View.VISIBLE);
        stepsScrollView.setVisibility(View.GONE);


        if(Objects.equals(category, "salad"))
        {
            findViewById(R.id.ingredients_end_text).setVisibility(View.VISIBLE);
        }

        TextView head_1=findViewById(R.id.col1);
        head_1.setText(col1);

        TextView head_2=findViewById(R.id.col2);
        head_2.setText(col2);

        TextView head_3=findViewById(R.id.col3);
        head_3.setText(col3);

        TextView head_4=findViewById(R.id.col4);
        head_4.setText(col4);


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
                findViewById(R.id.ingredients_end_text).setVisibility(View.VISIBLE);
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
                findViewById(R.id.ingredients_end_text).setVisibility(View.GONE);
            }
        });

        // Initialize the TableLayout for ingredients
        TableLayout ingredientsTable = findViewById(R.id.ingredients_table);

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
                ingImg = item.get("ingImg");
                break;
            }
        }

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
                if (isUsingDrawableImage) {
                    // Switch back to the URL image using Glide
                    Glide.with(RecipeActivity.this)
                            .load(imageUrl)
                            .into(imageView);
                } else {
                    // Attempt to display the drawable image
                    int drawableResourceId = getResources().getIdentifier(ingImg, "drawable", getPackageName());

                    // Check if the drawable resource exists
                    if (drawableResourceId != 0) {
                        imageView.setImageResource(drawableResourceId);
                    } else {
                        // Fallback in case drawable not found (optional)
                        imageView.setImageResource(R.drawable.bread); // Replace with a default image if needed
                    }
                }

                // Toggle between FIT_CENTER and CENTER_CROP
                imageView.setScaleType(isFitCenter ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
                fullSizeButton.setColorFilter(isFitCenter ? Color.BLACK : Color.WHITE, PorterDuff.Mode.SRC_ATOP);

                // Toggle the states
                isUsingDrawableImage = !isUsingDrawableImage;
                isFitCenter = !isFitCenter;
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

        // Populate the ingredients table
        populateIngredientsTable(ingredientsTable, ingredients,category);
    }


    private void populateIngredientsTable(TableLayout ingredientsTable, String ingredients, String category) {
        // Pattern for salads
        Pattern saladPattern = Pattern.compile("([a-zA-Z ]+) \\((\\d+(?:\\.\\d+)?g), (\\d+(?:\\.\\d+)?g), (\\d+(?:\\.\\d+)?g)\\)");
        // Pattern for wraps
        Pattern wrapPattern = Pattern.compile("([a-zA-Z ]+) \\(([a-zA-Z,]+)?(?:,)?(\\d+(?:\\.\\d+)?g)(?:,)?(\\w+)?\\)");

        Pattern sandwichPattern = Pattern.compile("([a-zA-Z ]+) \\(([^,]*)?,?(\\d+(?:\\.\\d+)?),?([a-zA-Z]+)?\\)");

        Matcher matcher;
        if (category.equals("salad")) {
            matcher = saladPattern.matcher(ingredients);
        }
        else if(category.equals("wraps")) {
            matcher = wrapPattern.matcher(ingredients);
        }
        else if(category.equals("sandwich")){
            matcher = sandwichPattern.matcher(ingredients);
        }
        else
        {
            //default case
            matcher = saladPattern.matcher(ingredients);
        }


        while (matcher.find()) {
            TableRow tableRow = new TableRow(this);

            TextView ingredientNameView = createTextView(matcher.group(1).trim());
            tableRow.addView(ingredientNameView);

            if (category.equals("salad")) {
                tableRow.addView(createTextView(matcher.group(2)));
                tableRow.addView(createTextView(matcher.group(3)));
                tableRow.addView(createTextView(matcher.group(4)));
            } else if(category.equals("wraps")) {
                tableRow.addView(createTextView(matcher.group(2) != null ? matcher.group(2) : ""));
                tableRow.addView(createTextView(matcher.group(3)));
                tableRow.addView(createTextView(matcher.group(4) != null ? matcher.group(4) : ""));
            } else if (category.equals("sandwich")) {
                tableRow.addView(createTextView(matcher.group(2) != null ? matcher.group(2) : ""));
                tableRow.addView(createTextView(matcher.group(3)));
                tableRow.addView(createTextView(matcher.group(4) != null ? matcher.group(4) : ""));
            }

            ingredientsTable.addView(tableRow);
        }
    }

    private TextView createTextView(String text) {
        TextView textView = new TextView(this);
        textView.setText("   " + text);
        textView.setPadding(8, 8, 8, 8);
        textView.setTextColor(Color.BLACK);
        return textView;
    }
}
