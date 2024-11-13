package com.example.nourishingfarmsalpha;

import android.content.Context;
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

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {

    private final ArrayList<HashMap<String, String>> dataList;
    private final Context context;

    public SearchAdapter(Context context, ArrayList<HashMap<String, String>> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.search_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HashMap<String, String> data = dataList.get(position);

        holder.title.setText(data.get("title"));

        // Load the image using Glide
        Glide.with(context)
                .load(data.get("image"))
                .into(holder.imageView);

        // Set an onClickListener to open a new activity and pass all required data
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, RecipeActivity.class);
            intent.putExtra("recipeTitle", data.get("title"));
            intent.putExtra("category", data.get("category")); // Add category

            // Add column headers based on category
            if (data.get("category") != null) {
                switch (data.get("category")) {
                    case "salad":
                        intent.putExtra("col1", "Ingredients");
                        intent.putExtra("col2", "Weight(g)");
                        intent.putExtra("col3", "Protein(g)");
                        intent.putExtra("col4", "Calories(g)");
                        break;
                    case "wraps":
                        intent.putExtra("col1", "Ingredients");
                        intent.putExtra("col2", "Type");
                        intent.putExtra("col3", "Weight");
                        intent.putExtra("col4", "Unit");
                        break;
                    case "sandwich":
                        intent.putExtra("col1", "Ingredients");
                        intent.putExtra("col2", "Type");
                        intent.putExtra("col3", "Amount");
                        intent.putExtra("col4", "Unit");
                        break;
                    case "juice":
                        intent.putExtra("col1", "Ingredients");
                        intent.putExtra("col2", "Single");
                        intent.putExtra("col3", "Five");
                        intent.putExtra("col4", "-");
                        break;
                    case "soup":
                    case "bowl":
                    case "smoothie":
                        intent.putExtra("col1", "Ingredients");
                        intent.putExtra("col2", "Specification");
                        intent.putExtra("col3", "Quantity");
                        intent.putExtra("col4", "Unit");
                        break;
                    default:
                        // Default column headers
                        intent.putExtra("col1", "Ingredients");
                        intent.putExtra("col2", "Amount");
                        intent.putExtra("col3", "Unit");
                        intent.putExtra("col4", "-");
                }
            } else {
                // Fallback column headers if category is null
                intent.putExtra("col1", "Ingredients");
                intent.putExtra("col2", "Amount");
                intent.putExtra("col3", "Unit");
                intent.putExtra("col4", "-");
            }

            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.search_recipe_title);
            imageView = itemView.findViewById(R.id.search_img);
        }
    }
}