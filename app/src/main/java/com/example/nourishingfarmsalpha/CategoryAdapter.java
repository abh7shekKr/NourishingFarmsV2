package com.example.nourishingfarmsalpha;

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
