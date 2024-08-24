package com.example.nourishingfarmsalpha;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class SearchActivity extends AppCompatActivity {

    private SearchAdapter adapter;
    private ArrayList<HashMap<String, String>> fullDataList;
    private ArrayList<HashMap<String, String>> filteredDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Initialize your DataStorage and get the full list of data
        DataStorage dataStorage = new DataStorage();
        fullDataList = dataStorage.getDataTable();

        // Create the filtered data list with the first 4-5 items as default
        filteredDataList = new ArrayList<>();
        int initialItemCount = Math.min(fullDataList.size(), 8);  // Show 4-5 items by default
        filteredDataList.addAll(fullDataList.subList(0, initialItemCount));

        // Set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rv_search);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new SearchAdapter(this, filteredDataList);
        recyclerView.setAdapter(adapter);

        // Set up the search functionality
        EditText searchInput = findViewById(R.id.searchInput);
        searchInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                filterData(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        ImageView goBackHome = findViewById(R.id.go_back_home);
        goBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();  // Go back to the previous activity
            }
        });

        // Request focus and show keyboard
        searchInput.requestFocus();
        searchInput.postDelayed(() -> {
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            if (imm != null) {
                imm.showSoftInput(searchInput, InputMethodManager.SHOW_IMPLICIT);
            }
        }, 200);
    }

    private void filterData(String query) {
        filteredDataList.clear();

        if (query.isEmpty()) {
            // Show the first 4-5 items when search query is empty
            int initialItemCount = Math.min(fullDataList.size(), 5);
            filteredDataList.addAll(fullDataList.subList(0, initialItemCount));
        } else {
            for (HashMap<String, String> item : fullDataList) {
                if (item.get("title").toLowerCase().contains(query.toLowerCase()) ||
                        item.get("ingredients").toLowerCase().contains(query.toLowerCase())) {
                    filteredDataList.add(item);
                }
            }
        }

        adapter.notifyDataSetChanged();
    }
}
