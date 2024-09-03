package com.example.nourishingfarmsalpha;

import android.content.Context;
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

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private final ArrayList<HashMap<String, String>> dataTable;
    private final Context context;

    public interface OnItemClickListener {
        void onItemClick(String title);
    }

    private final OnItemClickListener listener;

    public RecipeAdapter(Context context, ArrayList<HashMap<String, String>> dataTable, OnItemClickListener listener) {
        this.context = context;
        this.dataTable = dataTable;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popular_rv_item, parent, false);
        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        HashMap<String, String> currentItem = dataTable.get(position);

        String title = currentItem.get("title");
        String imageUrl = currentItem.get("image");

        holder.popularTxt.setText(title);

        // Use Glide to load the image
        Glide.with(context)
                .load(imageUrl)
                .into(holder.popularImg);

        // Handle item clicks
        holder.itemView.setOnClickListener(v -> listener.onItemClick(title));
    }

    @Override
    public int getItemCount() {
        return dataTable.size();
    }

    public static class RecipeViewHolder extends RecyclerView.ViewHolder {
        TextView popularTxt;
        ImageView popularImg;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            popularTxt = itemView.findViewById(R.id.popular_txt);
            popularImg = itemView.findViewById(R.id.popular_img);
        }
    }
}
