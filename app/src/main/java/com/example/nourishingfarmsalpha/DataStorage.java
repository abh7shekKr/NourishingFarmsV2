package com.example.nourishingfarmsalpha;

import java.util.ArrayList;
import java.util.HashMap;

public class DataStorage {

    private final ArrayList<HashMap<String, String>> dataTable;

    public DataStorage() {
        dataTable = new ArrayList<>();

        // Create and add the first row
        HashMap<String, String> row1 = new HashMap<>();
        row1.put("id", "1");
        row1.put("title", "Spiced Indian Salad");
        row1.put("ingredients", "Spicy Checkpeas, Beetroot, Pomegranate, Spicy Walnut");
        row1.put("image", "https://peasandcrayons.com/wp-content/uploads/2017/02/healthy-tomato-avocado-cucumber-salad-recipe-peasandcrayons-4716.jpg");
        dataTable.add(row1);

        // Create and add the second row
        HashMap<String, String> row2 = new HashMap<>();
        row2.put("id", "2");
        row2.put("title", "Crunchy Thai Salad");
        row2.put("ingredients", "Carrot, Spring Onion, Peanut");
        row2.put("image", "https://www.tasteofhome.com/wp-content/uploads/2018/01/Simple-Italian-Salad_EXPS_FT20_25957_F_0624_1.jpg");
        dataTable.add(row2);

        // Create and add the third row
        HashMap<String, String> row3 = new HashMap<>();
        row3.put("id", "3");
        row3.put("title", "Wild Rice & Celery Salad");
        row3.put("ingredients", "Apple, Black Rice, Celery, Cranberry, Walnut, Sunflower Seeds");
        row3.put("image", "https://cdn.loveandlemons.com/wp-content/uploads/2021/04/green-salad-recipes.jpg");
        dataTable.add(row3);

        // You can continue adding more rows as needed
    }

    public ArrayList<HashMap<String, String>> getDataTable() {
        return dataTable;
    }
}
