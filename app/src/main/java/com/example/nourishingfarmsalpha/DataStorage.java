package com.example.nourishingfarmsalpha;

import java.util.ArrayList;
import java.util.HashMap;

public class DataStorage {

    private final ArrayList<HashMap<String, String>> dataTable;

    public DataStorage() {
        dataTable = new ArrayList<>();

        HashMap<String, String> row1 = new HashMap<>();
        row1.put("id", "1");
        row1.put("title", "Spiced Indian Salad");
// Embed weight categories within the ingredients string
        row1.put("ingredients",
                "Spicy Checkpeas (50g, 75g, 100g), " +
                        "Beetroot (30g, 45g, 60g), " +
                        "Pomegranate (20g, 30g, 40g), " +
                        "Spicy Walnut (10g, 15g, 20g)");
        row1.put("category", "salad");
        row1.put("image", "https://peasandcrayons.com/wp-content/uploads/2017/02/healthy-tomato-avocado-cucumber-salad-recipe-peasandcrayons-4716.jpg");
        dataTable.add(row1);

    }

    public ArrayList<HashMap<String, String>> getDataTable() {
        return dataTable;
    }
}
