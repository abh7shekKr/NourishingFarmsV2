package com.example.nourishingfarmsalpha;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private final ArrayList<HashMap<String, String>> filteredData;

    public CategoryAdapter(ArrayList<HashMap<String, String>> filteredData) {
        this.filteredData = filteredData;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_rv, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        HashMap<String, String> currentItem = filteredData.get(position);

        holder.recipeTitle.setText(currentItem.get("title"));

        Glide.with(holder.itemView.getContext())
                .load(currentItem.get("image"))
                .into(holder.recipeImage);

        // Set an OnClickListener on the itemView
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to open the new activity
                Intent intent = new Intent(holder.itemView.getContext(), RecipeActivity.class);
                // Pass the title text to the new activity
                intent.putExtra("recipeTitle", currentItem.get("title"));
                intent.putExtra("category",currentItem.get("category"));
                intent.putExtra("col1",currentItem.get("table_hd_1"));
                System.out.println("DEBUGG =="+currentItem.get("table_hd_2"));
                intent.putExtra("col2",currentItem.get("table_hd_2"));
                intent.putExtra("col3",currentItem.get("table_hd_3"));
                intent.putExtra("col4",currentItem.get("table_hd_4"));
                // Start the new activity
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return filteredData.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView recipeTitle;
        ImageView recipeImage;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitle = itemView.findViewById(R.id.recipe_title);
            recipeImage = itemView.findViewById(R.id.category_img);
        }
    }


}
