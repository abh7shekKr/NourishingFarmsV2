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
        row1.put("title", "Pasta salad with light caesar dressing");
        row1.put("time", "20 Mins");
        row1.put("ingredients", "Pasta 50g, Tomato 20g, Onion 20g");
        row1.put("image", "https://nourishingfarms-my.sharepoint.com/personal/saloni_nourishingfarms_in/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fsaloni%5Fnourishingfarms%5Fin%2FDocuments%2FNF%20Media%2FNF%20Pictures%2F2024%20New%20Photoshoot%2Fsalad%2Fsalad%2Fpasta%20salad");
        dataTable.add(row1);

        // Create and add the second row
        HashMap<String, String> row2 = new HashMap<>();
        row2.put("id", "2");
        row2.put("title", "Paneer Pesto Couscous Bowl");
        row2.put("time", "15 Mins");
        row2.put("ingredients", "Paneer 50g, Tomato 20g, Onion 20g, Cinnamon 10g");
        row2.put("image", "https://nourishingfarms-my.sharepoint.com/personal/saloni_nourishingfarms_in/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fsaloni%5Fnourishingfarms%5Fin%2FDocuments%2FNF%20Media%2FNF%20Pictures%2F2024%20New%20Photoshoot%2Fwarm%20bowls%2Fpaneer%20pesto%20couscous%20bowl%2F2%2Ejpg&parent=%2Fpersonal%2Fsaloni%5Fnourishingfarms%5Fin%2FDocuments%2FNF%20Media%2FNF%20Pictures%2F2024%20New%20Photoshoot%2Fwarm%20bowls%2Fpaneer%20pesto%20couscous%20bowl");
        dataTable.add(row2);

        // Create and add the third row
        HashMap<String, String> row3 = new HashMap<>();
        row3.put("id", "3");
        row3.put("title", "Fruit Mix Indian Salad");
        row3.put("time", "10 Mins");
        row3.put("ingredients", "Banana 50g, Papaya 50g, Apple 50g, Grapes 50g");
        row3.put("image", "https://images.pexels.com/photos/46239/salmon-dish-food-meal-46239.jpeg?cs=srgb&dl=close-up-cooking-dinner-46239.jpg&fm=jpg");
        dataTable.add(row3);

        // You can continue adding more rows as needed
    }

    public ArrayList<HashMap<String, String>> getDataTable() {
        return dataTable;
    }
}
