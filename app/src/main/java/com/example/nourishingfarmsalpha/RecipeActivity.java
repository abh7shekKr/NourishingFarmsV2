package com.example.nourishingfarmsalpha;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {

    private boolean isFitCenter = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recipe);

        // Get the title text from the Intent
        String recipeTitle = getIntent().getStringExtra("recipeTitle");

        // Use the title text (e.g., set it as a title for a TextView)
        TextView titleTextView = findViewById(R.id.title_recipe_page);
        titleTextView.setText(recipeTitle);



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



    }
}
