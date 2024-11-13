package com.example.nourishingfarmsalpha;

import java.util.ArrayList;
import java.util.HashMap;

public class DataStorage {

    private final ArrayList<HashMap<String, String>> dataTable;

    public DataStorage() {
        dataTable = new ArrayList<>();

//      salad 1
        HashMap<String, String> row1 = new HashMap<>();
        row1.put("table_hd_1","Ingredients");
        row1.put("table_hd_2","150g");
        row1.put("table_hd_3","250g");
        row1.put("table_hd_4","350g");
        row1.put("id", "1");
        row1.put("title", "Spiced Indian Salad");
        row1.put("ingredients",
                "Lettuce (10g, 20g, 30g)," +
                        "Green Zucchini (12g, 15g, 20g),"+
                        "Yellow Zucchini (12g, 15g, 20g),"+
                        "Red Pepper (7.5g, 15g, 20g),"+
                        "Yellow Pepper (7.5g, 15g, 20g),"+
                        "Spicy Checkpeas (12g, 25g, 35g), " +
                        "Beetroot (7.5g, 15g, 25g), " +
                        "Pomegranate (7.5g, 15g, 20g), " +
                        "Spicy Walnut (7.5g, 10g, 15g)" +
                        "Carrot (15g, 25g, 30g)," +
                        "Onion (7.5g, 15g, 20g)," +
                        "Cherry Tomato (7.5g, 15g, 20g)," +
                        "Coriander (3.75g, 3g, 5g)," +
                        "Microgreens (3g, 8g, 12g)," +
                        "DressingChapata (30g, 40g, 60g)");
        row1.put("category", "salad");
        row1.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/Indian%20spiced%20salad.png?raw=true");
        row1.put("ingImg", "indianspiced");
        row1.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Chapata Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.\n");
        dataTable.add(row1);


        //      salad 2
        HashMap<String, String> row2 = new HashMap<>();
        row2.put("table_hd_1","Ingredients");
        row2.put("table_hd_2","150g");
        row2.put("table_hd_3","250g");
        row2.put("table_hd_4","350g");
        row2.put("id", "2");
        row2.put("title", "Crunchy Thai Salad");
        row2.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 15g, 20g),"+
                        "Yellow Zucchini (12g, 15g, 20g),"+
                        "Red Pepper (12g, 20g, 25g),"+
                        "Yellow Pepper (12g, 20g, 25g)," +
                        "Cucumber (15g, 20g, 30g),"+
                        "Red Cabbage (9g, 20g, 25g),"+
                        "Napa Cabbage (9g, 20g, 25g),"+
                        "Carrot (6g, 20g, 25g),"+
                        "Spring Onion (3g, 10g, 15g)"+
                        "Basil (3g, 5g, 7g)"+
                        "Mint (3g, 5g, 7g)"+
                        "Peanut (9g, 15g, 25g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Zesty Peanut (30g, 40g, 60g)");

        row2.put("category", "salad");
        row2.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/crunchy%20thai%20salad.png?raw=true");
        row2.put("ingImg", "crunchythai");
        row2.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Zesty Peanut Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café. \n");
        dataTable.add(row2);


        //      salad 3
        HashMap<String, String> row3 = new HashMap<>();
        row3.put("table_hd_1","Ingredients");
        row3.put("table_hd_2","150g");
        row3.put("table_hd_3","250g");
        row3.put("table_hd_4","350g");
        row3.put("id", "3");
        row3.put("title", "Wild Rice And Celery Salad");
        row3.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 25g),"+
                        "Yellow Zucchini (12g, 20g, 25g),"+
                        "Red Pepper (7.5g, 20g, 25g),"+
                        "Yellow Pepper (7.5g, 20g, 25g)," +
                        "Apple (12g, 20g, 30g),"+
                        "Black Rice (30g, 40g, 55g),"+
                        "Celery (5.25g, 10g, 15g),"+
                        "Cranberry (5.25g, 7g, 10g),"+
                        "Walnut (5.25g, 7g, 10g)"+
                        "Sunflower Seeds (5.25g, 7g, 10g)"+
                        "Spring Onion (5.25g, 7g, 10g)"+
                        "Coriander (3.75g, 5g, 8g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Orange Vinaigrette (30g, 40g, 60g)");

        row3.put("category", "salad");
        row3.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/wild%20rice%20and%20celery%20salad.jpg?raw=true");
        row3.put("ingImg", "wildricecelery");
        row3.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Orange Vinaigrette Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.  \n");
        dataTable.add(row3);


        //      salad 4
        HashMap<String, String> row4 = new HashMap<>();
        row4.put("table_hd_1","Ingredients");
        row4.put("table_hd_2","150g");
        row4.put("table_hd_3","250g");
        row4.put("table_hd_4","350g");
        row4.put("id", "4");
        row4.put("title", "Super Quinoa Salad");
        row4.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 15g, 25g),"+
                        "Yellow Zucchini (12g, 15g, 25g),"+
                        "Red Pepper (12g, 15g, 25g),"+
                        "Yellow Pepper (12g, 15g, 25g)," +
                        "Cucumber (9g, 25g, 30g),"+
                        "Chickpeas (15g, 35g, 40g),"+
                        "Quinoa (15g, 30g, 35g),"+
                        "Black Olives (3.75g, 10g, 10g),"+
                        "Cranberry (3.75g, 5g, 5g)"+
                        "Coriander (3.75g, 5g, 7g)"+
                        "Cherry Tomato (12g, 15g, 25g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Roasted Garlic (30g, 40g, 60g)");

        row4.put("category", "salad");
        row4.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/super%20quinoa%20salad.jpg?raw=true");
        row4.put("ingImg", "superquinoa");
        row4.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Roasted Garlic Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.\n");
        dataTable.add(row4);


        //      salad 5
        HashMap<String, String> row5 = new HashMap<>();
        row5.put("table_hd_1","Ingredients");
        row5.put("table_hd_2","150g");
        row5.put("table_hd_3","250g");
        row5.put("table_hd_4","350g");
        row5.put("id", "5");
        row5.put("title", "Classic Italian Salad");
        row5.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 22.5g),"+
                        "Yellow Zucchini (12g, 20g, 22.5g),"+
                        "Red Pepper (7.5g, 20g, 15g),"+
                        "Yellow Pepper (7.5g, 20g, 15g)," +
                        "Cucumber (12g, 15g, 25g),"+
                        "Napa Cabbage (9g, 15g, 25g),"+
                        "Carrot (9g, 15g, 25g),"+
                        "Purple Cabbage (9g, 15g, 25g),"+
                        "Olives (3.75g, 10g, 15g)"+
                        "Basil (3.75g, 5g, 7g)"+
                        "Croutons (6g, 10g, 15g)"+
                        "Cherry Tomato (9g, 12g, 18g)"+
                        "Cheese (3g, 5g, 10g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Spicy Herbs Dressing (30g, 40g, 60g)"
        );

        row5.put("category", "salad");
        row5.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/classic%20italian%20salad.png?raw=true");
        row5.put("ingImg", "classicitalian");
        row5.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Spicy Herb Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.  \n");
        dataTable.add(row5);


        //      salad 6
        HashMap<String, String> row6 = new HashMap<>();
        row6.put("table_hd_1","Ingredients");
        row6.put("table_hd_2","150g");
        row6.put("table_hd_3","250g");
        row6.put("table_hd_4","350g");
        row6.put("id", "6");
        row6.put("title", "Pasta Salad");
        row6.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 25g),"+
                        "Yellow Zucchini (12g, 20g, 25g),"+
                        "Red Pepper (12g, 20g, 25g),"+
                        "Yellow Pepper (12g, 20g, 25g)," +
                        "Pasta (30g, 40g, 55g),"+
                        "Black Olives (4.5g, 9g, 15g),"+
                        "Parmesan (3g, 10g, 15g),"+
                        "Basil (3g, 4g, 6g),"+
                        "Almonds (3.75g, 8g, 12g)"+
                        "Croutons (6g, 8g, 12g)"+
                        "Cherry Tomato (12g, 15g, 22g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Light Caesar (30g, 40g, 60g)"
        );

        row6.put("category", "salad");
        row6.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/pasta%20salad.png?raw=true");
        row6.put("ingImg", "pastasalad");
        row6.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Light Caesar Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.  \n");
        dataTable.add(row6);


        //      salad 7
        HashMap<String, String> row7 = new HashMap<>();
        row7.put("table_hd_1","Ingredients");
        row7.put("table_hd_2","150g");
        row7.put("table_hd_3","250g");
        row7.put("table_hd_4","350g");
        row7.put("id", "7");
        row7.put("title", "Southwest Salad");
        row7.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 25g),"+
                        "Yellow Zucchini (12g, 20g, 25g),"+
                        "Red Pepper (12g, 20g, 25g),"+
                        "Yellow Pepper (12g, 20g, 25g)," +
                        "Red Cabbage (7.5g, 15g, 20g),"+
                        "Rajma (15g, 20g, 40g),"+
                        "Corn (7.5g, 20g, 25g),"+
                        "Black Olives (5.25g, 7g, 14g),"+
                        "Coriander (4.5g, 5g, 9g)"+
                        "Cheddar Cheese (12g, 10g, 15g)"+
                        "Cherry Tomato (9g, 15g, 25g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Creamy Chipotle (30g, 40g, 60g)"
        );

        row7.put("category", "salad");
        row7.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/southwest%20salad.jpg?raw=true");
        row7.put("ingImg", "southwestsalad");
        row7.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Creamy Chipotle Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café. \n");
        dataTable.add(row7);


        //      salad 8
        HashMap<String, String> row8 = new HashMap<>();
        row8.put("table_hd_1","Ingredients");
        row8.put("table_hd_2","150g");
        row8.put("table_hd_3","250g");
        row8.put("table_hd_4","350g");
        row8.put("id", "8");
        row8.put("title", "Mediterranean Couscous");
        row8.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 15g, 20g),"+
                        "Yellow Zucchini (12g, 15g, 20g),"+
                        "Red Pepper (12g, 20g, 25g),"+
                        "Yellow Pepper (12g, 20g, 25g)," +
                        "Cucumber (12g, 20g, 25g),"+
                        "Chickpeas (15g, 30g, 40g),"+
                        "Couscous (15g, 30g, 40g),"+
                        "Basil (2.25g, 5g, 7g),"+
                        "Olives (4.5g, 8g, 14g)"+
                        "Feta (3g, 7g, 12g)"+
                        "Cherry Tomato (9g, 15g, 20g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Sunshine Dressing (30g, 40g, 60g)"
        );

        row8.put("category", "salad");
        row8.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/mediterrnean%20salad.png?raw=true");
        row8.put("ingImg", "mediterraneancouscous");
        row8.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Sunshine Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.  \n");
        dataTable.add(row8);


        //      salad 9
        HashMap<String, String> row9 = new HashMap<>();
        row9.put("table_hd_1","Ingredients");
        row9.put("table_hd_2","150g");
        row9.put("table_hd_3","250g");
        row9.put("table_hd_4","350g");
        row9.put("id", "9");
        row9.put("title", "Greek Salad");
        row9.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 25g),"+
                        "Yellow Zucchini (12g, 20g, 25g),"+
                        "Red Pepper (12g, 20g, 30g),"+
                        "Yellow Pepper (12g, 20g, 30g)," +
                        "Onion (7.5g, 15g, 20g),"+
                        "Cucumber (18g, 25g, 30g),"+
                        "Cherry Tomato (22g, 40g, 55g),"+
                        "Black Olives (5.25g, 7g, 10g),"+
                        "Mix Herbs (2.25g, 3g, 5g)"+
                        "Chopped Parsley (2.25g, 3g, 5g)"+
                        "Feta Cheese (5g, 10g, 15g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Feta Mustard Dressing (30g, 40g, 60g)"
        );

        row9.put("category", "salad");
        row9.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/greek%20salad.png?raw=true");
        row9.put("ingImg", "greek");
        row9.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Feta Mustard Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.  \n");
        dataTable.add(row9);


        //      salad 10
        HashMap<String, String> row10 = new HashMap<>();
        row10.put("table_hd_1","Ingredients");
        row10.put("table_hd_2","150g");
        row10.put("table_hd_3","250g");
        row10.put("table_hd_4","350g");
        row10.put("id", "10");
        row10.put("title", "Lentil Taco Salad");
        row10.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 15g, 20g),"+
                        "Yellow Zucchini (12g, 15g, 20g),"+
                        "Red Pepper (12g, 15g, 20g),"+
                        "Yellow Pepper (12g, 15g, 20g)," +
                        "Masoor (15g, 25g, 35g),"+
                        "Pica De Galo (15g, 25g, 35g),"+
                        "Cucumber (7.5g, 15g, 20g),"+
                        "Corn (7.5g, 15g, 20g),"+
                        "Black Olives (3.75g, 8g, 12g)"+
                        "Walnut (3.75g, 5g, 7g)"+
                        "Sunflower Seeds (3.75g, 5g, 7g)"+
                        "Nachos (3.75g, 12g, 15g)"+
                        "Cherry Tomato (7.5g, 15g, 25g)"+
                        "Microgreens (3g, 5g, 7g)"+
                        "Creamy Cashew (30g, 40g, 60g)"
        );

        row10.put("category", "salad");
        row10.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/lentil%20taco%20salad.png?raw=true");
        row10.put("ingImg", "lentiltaco");
        row10.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Creamy Cashew Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.  \n");
        dataTable.add(row10);


        //      salad 11
        HashMap<String, String> row11 = new HashMap<>();

        row11.put("table_hd_1","Ingredients");
        row11.put("table_hd_2","150g");
        row11.put("table_hd_3","250g");
        row11.put("table_hd_4","350g");
        row11.put("id", "11");
        row11.put("title", "Umami Korean Salad");
        row11.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 25g),"+
                        "Yellow Zucchini (12g, 20g, 25g),"+
                        "Red Pepper (9g, 20g, 25g),"+
                        "Yellow Pepper (9g, 20g, 25g)," +
                        "Pear (12g, 20g, 25g),"+
                        "Purple Cabbage (12g, 20g, 25g),"+
                        "Napa Cabbage (12g, 20g, 25g),"+
                        "Carrot Pickling (15g, 20g, 35g),"+
                        "Raddish Pickling (15g, 20g, 35g)"+
                        "Sesame Seeds (1.5g, 2g, 5g)"+
                        "Microgreens (3g, 10g, 12g)"+
                        "SweetSpicySesameSeeds (30g, 40g, 60g)"
        );

        row11.put("category", "salad");
        row11.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/umami%20korean%20salad.jpg?raw=true");
        row11.put("ingImg", "umamikorean");
        row11.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Sweet and Spicy Sesame Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.\n");
        dataTable.add(row11);


        //      salad 12
        HashMap<String, String> row12 = new HashMap<>();
        row12.put("table_hd_1","Ingredients");
        row12.put("table_hd_2","150g");
        row12.put("table_hd_3","250g");
        row12.put("table_hd_4","350g");
        row12.put("id", "12");
        row12.put("title", "Hearty Fruit Salad");
        row12.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 25g),"+
                        "Yellow Zucchini (12g, 20g, 25g),"+
                        "Red Pepper (12g, 20g, 25g),"+
                        "Yellow Pepper (12g, 20g, 25g)," +
                        "Apple (15g, 25g, 35g)," +
                        "Pear (15g, 25g, 35g),"+
                        "Orange (7.5g, 20g, 30g),"+
                        "Pomegranate (12g, 15g, 20g),"+
                        "Walnut (3.75g, 5g, 10g),"+
                        "Mint (3.75g, 5g, 8g)"+
                        "Feta (4g, 8g, 10g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Balsamic Vinaigrette  (30g, 40g, 60g)"
        );

        row12.put("category", "salad");
        row12.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/hearty%20fruit%20salad.png?raw=true");
        row12.put("ingImg", "heartyfruit");
        row12.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Balsamic Vinaigrette Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.\n");
        dataTable.add(row12);


        //      salad 13
        HashMap<String, String> row13 = new HashMap<>();
        row13.put("table_hd_1","Ingredients");
        row13.put("table_hd_2","150g");
        row13.put("table_hd_3","250g");
        row13.put("table_hd_4","350g");
        row13.put("id", "13");
        row13.put("title", "Rainbow Salad");
        row13.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 25g),"+
                        "Yellow Zucchini (12g, 20g, 25g),"+
                        "Red Pepper (12g, 20g, 25g),"+
                        "Yellow Pepper (12g, 20g, 25g)," +
                        "Purple Cabbage (12g, 20g, 30g)," +
                        "Carrot (12g, 20g, 30g),"+
                        "Pomegranate (7.5g, 15g, 25g),"+
                        "Sunflower Seeds (7.5g, 12g, 15g),"+
                        "Cheese Packet (12g, 15g, 20g)"+
                        "Cherry Tomato (12g, 20g, 30g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Thousand Island Dressing (30g, 40g, 60g)"
        );

        row13.put("category", "salad");
        row13.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/rainbow%20salad.png?raw=true");
        row13.put("ingImg", "rainbowsalad");
        row13.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep thousand Island Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.  \n");
        dataTable.add(row13);


        //      salad 14
        HashMap<String, String> row14 = new HashMap<>();
        row14.put("table_hd_1","Ingredients");
        row14.put("table_hd_2","150g");
        row14.put("table_hd_3","250g");
        row14.put("table_hd_4","350g");
        row14.put("id", "14");
        row14.put("title", "Roasted Vegetable Salad");
        row14.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 25g),"+
                        "Yellow Zucchini (12g, 20g, 25g),"+
                        "Red Pepper (12g, 20g, 30g),"+
                        "Yellow Pepper (12g, 20g, 30g)," +
                        "Red Cabbage (12g, 20g, 25g)," +
                        "Carrot (12g, 15g, 25g),"+
                        "Roasted Vegetables (30g, 50g, 60g),"+
                        "Cherry Tomato (7.5g, 15g, 25g),"+
                        "Coriander (3g, 4g, 6g)"+
                        "Cherry Tomato (12g, 20g, 30g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Ranch Dressing  (30g, 40g, 60g)"
        );

        row14.put("category", "salad");
        row14.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/roasted%20vegge%20salad.jpg?raw=true");
        row14.put("ingImg", "raostedvegetable");
        row14.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep ranch Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.  \n");
        dataTable.add(row14);


        //      salad 15
        HashMap<String, String> row15 = new HashMap<>();
        row15.put("table_hd_1","Ingredients");
        row15.put("table_hd_2","150g");
        row15.put("table_hd_3","250g");
        row15.put("table_hd_4","350g");
        row15.put("id", "15");
        row15.put("title", "Beetroot Carrot Salad");
        row15.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 20g, 25g),"+
                        "Yellow Zucchini (12g, 20g, 30g),"+
                        "Red Pepper (12g, 20g, 30g),"+
                        "Yellow Pepper (12g, 20g, 30g)," +
                        "Beetroot (26.25g, 45g, 60g)," +
                        "Carrot (26.25g, 45g, 60g),"+
                        "Fresh Mozzarella (7.5g, 12g, 15g),"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Orange vinaigrette (30g, 40g, 60g)"
        );

        row15.put("category", "salad");
        row15.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/beetroot%20and%20carrot%20salad.png?raw=true");
        row15.put("ingImg", "beetrootandcarrot");
        row15.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep orange vinaigrette Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café.\n");
        dataTable.add(row15);


        //      salad 16
        HashMap<String, String> row16 = new HashMap<>();
        row16.put("table_hd_1","Ingredients");
        row16.put("table_hd_2","150g");
        row16.put("table_hd_3","250g");
        row16.put("table_hd_4","350g");
        row16.put("id", "16");
        row16.put("title", "Arabian Fattoush Salad");
        row16.put("ingredients",
                "Lettuce (15g, 20g, 30g)," +
                        "Green Zucchini (12g, 15g, 20g),"+
                        "Yellow Zucchini (12g, 15g, 20g),"+
                        "Red Pepper (12g, 20g, 25g),"+
                        "Yellow Pepper (12g, 20g, 25g)," +
                        "Fattoush (15g, 45g, 55g)," +
                        "Broken Wheat (33.75g, 40g, 55g),"+
                        "Paprika Powder (1.5g, 2g, 3g),"+
                        "Basil (1.5g, 3g, 5g)"+
                        "Cherry Tomato (9g, 15g, 20g)"+
                        "Coriander (3g, 5g, 8g)"+
                        "Olive (3.75g, 7g, 12g)"+
                        "Microgreens (3g, 8g, 12g)"+
                        "Hummus Dressing (30g, 40g, 60g)"
        );

        row16.put("category", "salad");
        row16.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/arabian%20fatoush%20salad.png?raw=true");
        row16.put("ingImg", "arabianfattoush");
        row16.put("steps", "•Keep Salad Bowl Takeaway or Melamine on the Weighing Machine. \n" +
                "•Spread Lettuce in bottom. \n" +
                "•Keep Hummus Dressing Container in the Middle. \n" +
                "•One by one Arrange all the ingredients around the dressing. Garnish with Microgreens. Close the container with lead or serve in your café. \n");
        dataTable.add(row16);


        // Roasted Veg Wrap
        HashMap<String, String> row17 = new HashMap<>();
        row17.put("table_hd_1","Ingredients");
        row17.put("table_hd_2","Specification");
        row17.put("table_hd_3","Quantity");
        row17.put("table_hd_4","Unit");
        row17.put("id", "17");
        row17.put("title", "Roasted Veg Wrap");
        row17.put("ingredients",
                "Wrap (no,1 No.,No)," +
                        "Harissa sauce (spread,25g,Gms)," +
                        "Lettuce (20g,Gms)," +
                        "Onion sliced (rings,20g,Gms)," +
                        "Roasted Vegetables (60g,Gms)," +
                        "Mix Herbs (2g,Gms)," +
                        "Balsamic Glaze (2g,Gms)," +
                        "Cheese Slice (10g,Gms)"
        );
        row17.put("category", "wraps");
        row17.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/roasted_veg_wrap.png?raw=true");
        row17.put("ingImg", "roastedvegwrap");
        row17.put("steps", "• Warm wrap on grill pan on both sides. Warm roast veg filling in microwavable bowl meanwhile.\n" +
                "• Apply harissa on middle of wrap, then layer with lettuce, roasted vegetables, onion rings.\n" +
                "• Sprinkle mix herbs, add cheese slice, drizzle balsamic glaze.\n" +
                "• Adjust filling in the middle, fold left and right edges toward the middle.\n" +
                "• Fold bottom edge over fillings, tuck inside the wrap.\n" +
                "• Roll tightly toward top edge. Apply little sauce on edge to stick.\n" +
                "• Cut angular and serve with pepper and cucumber pickles.\n");
        dataTable.add(row17);

        // Pesto Paneer Wrap
        HashMap<String, String> row18 = new HashMap<>();
        row18.put("table_hd_1","Ingredients");
        row18.put("table_hd_2","Specification");
        row18.put("table_hd_3","Quantity");
        row18.put("table_hd_4","Unit");
        row18.put("id", "18");
        row18.put("title", "Pesto Paneer Wrap");
        row18.put("ingredients",
                "Wrap (no,1 No.,No)," +
                        "Pesto (20g,Gms)," +
                        "Lettuce (15g,Gms)," +
                        "Onion Slice (20g,Gms)," +
                        "Tomato Slice (25g,Gms)," +
                        "Pesto Paneer Slice (Cooked,60g,Gms)," +
                        "Herbs (2g,Gms)," +
                        "Balsamic Glaze (2g,Gms)," +
                        "Cheese Slice (10g,Gms)," +
                        "Cucumber (15g,Gms)"
        );
        row18.put("category", "wraps");
        row18.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/pesto_paneer_wrap.png?raw=true");
        row18.put("ingImg", "pestopaneerwrap");
        row18.put("steps", "• Warm wrap on grill pan on both sides. Warm paneer pesto in microwavable bowl meanwhile.\n" +
                "• Apply Pesto on middle of wrap, layer with lettuce, onion rings, tomato slices, cucumber.\n" +
                "• Sprinkle mix herbs, add pesto paneer slice, cheese slice, drizzle balsamic glaze.\n" +
                "• Adjust filling in the middle, fold left and right edges toward the middle.\n" +
                "• Fold bottom edge over fillings, tuck inside the wrap.\n" +
                "• Roll tightly toward top edge. Apply little sauce on edge to stick.\n" +
                "• Cut angular and serve with pepper and cucumber pickles.\n");
        dataTable.add(row18);

        // Pesto Chicken Wrap
        HashMap<String, String> row19 = new HashMap<>();
        row19.put("table_hd_1","Ingredients");
        row19.put("table_hd_2","Specification");
        row19.put("table_hd_3","Quantity");
        row19.put("table_hd_4","Unit");
        row19.put("id", "19");
        row19.put("title", "Pesto Chicken Wrap");
        row19.put("ingredients",
                "Wrap (1 No.,No)," +
                        "Pesto Sauce (20g,Gms)," +
                        "Lettuce (15g,Gms)," +
                        "Onion Slice (20g,Gms)," +
                        "Tomato Slice (30g,Gms)," +
                        "Pesto Chicken Slice (Cooked,60g,Gms)," +
                        "Herbs (2g,Gms)," +
                        "Glaze (2g,Gms)," +
                        "Cheese Slice (10g,Gms)," +
                        "Cucumber (Sliced,15g,Gms)"
        );
        row19.put("category", "wraps");
        row19.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/pesto_chicken_wrap.png?raw=true");
        row19.put("ingImg", "pestochickenwrap");
        row19.put("steps", "• Warm wrap on grill pan on both sides. Warm chicken pesto in microwavable bowl meanwhile.\n" +
                "• Apply Pesto on middle of wrap, layer with lettuce, onion rings, tomato slices, cucumber.\n" +
                "• Sprinkle mix herbs, add pesto chicken slice, cheese slice, drizzle balsamic glaze.\n" +
                "• Adjust filling in the middle, fold left and right edges toward the middle.\n" +
                "• Fold bottom edge over fillings, tuck inside the wrap.\n" +
                "• Roll tightly toward top edge. Apply little sauce on edge to stick.\n" +
                "• Cut angular and serve with pepper and cucumber pickles.\n");
        dataTable.add(row19);

        // Paneer Harissa Wrap
        HashMap<String, String> row20 = new HashMap<>();
        row20.put("table_hd_1","Ingredients");
        row20.put("table_hd_2","Specification");
        row20.put("table_hd_3","Quantity");
        row20.put("table_hd_4","Unit");
        row20.put("id", "20");
        row20.put("title", "Paneer Harissa Wrap");
        row20.put("ingredients",
                "Wrap (1 No.,No)," +
                        "Harissa Sauce (20g,Gms)," +
                        "Lettuce (15g,Gms)," +
                        "Onion Slice (Rings,20g,Gms)," +
                        "Tomato Slice (30g,Gms)," +
                        "Harissa Paneer Slice (60g,Gms)," +
                        "Herbs (2g,Gms)," +
                        "Glaze (2g,Gms)," +
                        "Cheese Slice (10g,Gms)," +
                        "Cucumber (Sliced,15g,Gms)"
        );
        row20.put("category", "wraps");
        row20.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/paneer_harissa_wrap.png?raw=true");
        row20.put("ingImg", "paneerharissawrap");
        row20.put("steps", "• Warm wrap on grill pan on both sides. Warm harissa paneer slices in microwavable bowl meanwhile.\n" +
                "• Apply Harissa on middle of wrap, layer with lettuce, onion rings, tomato slices, cucumber.\n" +
                "• Sprinkle mix herbs, add harissa paneer slice, cheese slice, drizzle balsamic glaze.\n" +
                "• Adjust filling in the middle, fold left and right edges toward the middle.\n" +
                "• Fold bottom edge over fillings, tuck inside the wrap.\n" +
                "• Roll tightly toward top edge. Apply little sauce on edge to stick.\n" +
                "• Cut angular and serve with pepper and cucumber pickles.\n");
        dataTable.add(row20);

        // Chicken Harissa Wrap
        HashMap<String, String> row21 = new HashMap<>();
        row21.put("table_hd_1","Ingredients");
        row21.put("table_hd_2","Specification");
        row21.put("table_hd_3","Quantity");
        row21.put("table_hd_4","Unit");
        row21.put("id", "21");
        row21.put("title", "Chicken Harissa Wrap");
        row21.put("ingredients",
                "Wrap (1 No.,No)," +
                        "Harissa Sauce (20g,Gms)," +
                        "Lettuce (15g,Gms)," +
                        "Onion Slice (Rings,20g,Gms)," +
                        "Tomato Slice (30g,Gms)," +
                        "Harissa Chicken Slice (60g,Gms)," +
                        "Herbs (2g,Gms)," +
                        "Glaze (2g,Gms)," +
                        "Cheese Slice (10g,Gms)," +
                        "Cucumber (Sliced,15g,Gms)"
        );
        row21.put("category", "wraps");
        row21.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/chicken_harissa_wrap.png?raw=true");
        row21.put("ingImg", "chickenharissawrap");
        row21.put("steps", "• Warm wrap on grill pan on both sides. Warm harissa chicken slices in microwavable bowl meanwhile.\n" +
                "• Apply Harissa on middle of wrap, layer with lettuce, onion rings, tomato slices, cucumber.\n" +
                "• Sprinkle mix herbs, add harissa chicken slice, cheese slice, drizzle balsamic glaze.\n" +
                "• Adjust filling in the middle, fold left and right edges toward the middle.\n" +
                "• Fold bottom edge over fillings, tuck inside the wrap.\n" +
                "• Roll tightly toward top edge. Apply little sauce on edge to stick.\n" +
                "• Cut angular and serve with pepper and cucumber pickles.\n");
        dataTable.add(row21);

        // Egg n cheese Sandwich
        HashMap<String, String> row22 = new HashMap<>();
        row22.put("table_hd_1","Ingredients");
        row22.put("table_hd_2","Specification");
        row22.put("table_hd_3","Quantity");
        row22.put("table_hd_4","Unit");
        row22.put("id", "22");
        row22.put("title", "Egg n cheese Wrap");
        row22.put("ingredients",
                "Wrap (No,1 No.,No)," +
                        "Harissa (Spread,20g,Gms)," +
                        "Lettuce (15g,Gms)," +
                        "Onion Slice (Rings,15g,Gms)," +
                        "Egg (Omlette,1 No.,Gms)," +
                        "Sundried Tomato (10g,Gms)," +
                        "Cheese Sliced (10g,Gms)"
        );
        row22.put("category", "wraps");
        row22.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/egg_n_cheese_sandwich.png?raw=true");
        row22.put("ingImg", "eggncheesesandwich");
        row22.put("steps", "• Warm wrap on grill pan on both sides. Beat one egg, add salt n pepper, make thin omelette.\n" +
                "• Apply Harissa on middle of wrap, layer with lettuce, onion rings, omelette, sundried tomato and cheese slice.\n" +
                "• Adjust filling in the middle, fold left and right edges toward the middle.\n" +
                "• Fold bottom edge over fillings, tuck inside the wrap.\n" +
                "• Roll tightly toward top edge. Apply little sauce on edge to stick.\n" +
                "• Cut angular and serve with pepper and cucumber pickles.\n");
        dataTable.add(row22);

        // Classic Bombay Wrap
        HashMap<String, String> row23 = new HashMap<>();
        row23.put("table_hd_1","Ingredients");
        row23.put("table_hd_2","Specification");
        row23.put("table_hd_3","Quantity");
        row23.put("table_hd_4","Unit");
        row23.put("id", "23");
        row23.put("title", "Classic Bombay Wrap");
        row23.put("ingredients",
                "Wrap (No,1 No.,No)," +
                        "Green Chatni (25g,Gms)," +
                        "Lettuce (15g,Gms)," +
                        "Onion Slice (20g,Gms)," +
                        "Tomato Slice (30g,Gms)," +
                        "Cucumber Slice (20g,Gms)," +
                        "Potato Slice (Boiled,20g,Gms)," +
                        "Garam Masala, chaat Masala (2g,Gms)," +
                        "Cheese Slice (10g)"
        );
        row23.put("category", "wraps");
        row23.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/classic_bombay_sandwich.png?raw=true");
        row23.put("ingImg", "classicbombaysandwich");
        row23.put("steps", "• Warm both bread slices on grill pan on both sides.\n" +
                "• Apply Green chutney on bread, layer with lettuce, onion rings, tomato slices, cucumber slices, boiled potato slices.\n" +
                "• Sprinkle garam masala and chaat masala.\n" +
                "• Add cheese slice.\n" +
                "• Cover the sandwich with another slice and cut into triangular halves.\n" +
                "• Serve with pepper and cucumber pickles.\n");
        dataTable.add(row23);



        // sandwiches

        // ROASTED VEG SANDWICH
        HashMap<String, String> row25 = new HashMap<>();
        row25.put("table_hd_1", "Ingredients");
        row25.put("table_hd_2", "Specification");
        row25.put("table_hd_3", "Quantity");
        row25.put("table_hd_4", "Unit");
        row25.put("id", "25");
        row25.put("title", "ROASTED VEG SANDWICH");
        row25.put("ingredients",
                "Bread (no.,2.00,No.)," +
                        "Harissa sauce (Spread,25.00,Gms)," +
                        "Lettuce (,20.00,Gms)," +
                        "Onion sliced (Rings,20.00,Gms)," +
                        "Roasted Vegetables (,60.00,Gms)," +
                        "Mix Herbs (,2.00,Gms)," +
                        "Balsamic Glaze (,2.00,Gms)," +
                        "Cheese Slice (,10.00,Gms)"
        );
        row25.put("category", "sandwich");
        row25.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/roasted_veg_sandwich.png?raw=true");
        row25.put("ingImg", "roastedvegsandwich");
        row25.put("steps", "• Warm both bread slices on grill pan on both the sides. Warm roast veg filling in microwavable bowl meanwhile.\n" +
                "• Apply harissa on bread, then layer it with lettuce, roasted vegetables, onion rings.\n" +
                "• Then sprinkle mix herbs and then add cheese slice followed by drizzle of balsamic glaze.\n" +
                "• Cover the sandwich with another slice and then cut the sandwich one by two in triangular.\n" +
                "• Serve along with pepper and cucumber pickles.\n");
        row25.put("important_ingredients", "Roasted vegetables");
        row25.put("suggested_pairing", "Watermelon and mint");
        dataTable.add(row25);

// Pesto Paneer Sandwich
        HashMap<String, String> row26 = new HashMap<>();
        row26.put("table_hd_1", "Ingredients");
        row26.put("table_hd_2", "Specification");
        row26.put("table_hd_3", "Quantity");
        row26.put("table_hd_4", "Unit");
        row26.put("id", "26");
        row26.put("title", "Pesto Paneer Sandwich");
        row26.put("ingredients",
                "Bread (2 Slice,No.,2.00,No.)," +
                        "Pesto (,20.00,Gms)," +
                        "Lettuce (,15.00,Gms)," +
                        "Onion Slice (,20.00,Gms)," +
                        "Tomato Slice (,25.00,Gms)," +
                        "Pesto Paneer Slice (Cooked,60.00,Gms)," +
                        "Herbs (,2.00,Gms)," +
                        "Balsamic Glaze (,2.00,Gms)," +
                        "Cheese Slice (,10.00,Gms)," +
                        "Cucumber (Sliced,15.00,Gms)"
        );
        row26.put("category", "sandwich");
        row26.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/pesto_paneer_sandwich.png?raw=true");
        row26.put("ingImg", "pestopaneersandwich");
        row26.put("steps", "• Warm both bread slices on grill pan on both the sides. Warm paneer pesto in microwavable bowl meanwhile.\n" +
                "• Apply Pesto on bread, then layer it with lettuce, onion rings, tomato slices, cucumber.\n" +
                "• Then sprinkle mix herbs and then add pesto paneer slice, cheese slice followed by drizzle of balsamic glaze.\n" +
                "• Cover the sandwich with another slice and then cut the sandwich one by two in triangular.\n" +
                "• Serve along with pepper and cucumber pickles.\n");
        row26.put("important_ingredients", "Pesto Paneer, cheese");
        row26.put("suggested_pairing", "Orange juice");
        dataTable.add(row26);

// Pesto Chicken Sandwich
        HashMap<String, String> row27 = new HashMap<>();
        row27.put("table_hd_1", "Ingredients");
        row27.put("table_hd_2", "Specification");
        row27.put("table_hd_3", "Quantity");
        row27.put("table_hd_4", "Unit");
        row27.put("id", "27");
        row27.put("title", "Pesto Chicken Sandwich");
        row27.put("ingredients",
                "Bread (2 Slice,,2.00,No.)," +
                        "Pesto Sauce (,20.00,Gms)," +
                        "Lettuce (,15.00,Gms)," +
                        "Onion Slice (,20.00,Gms)," +
                        "Tomato Slice (,30.00,Gms)," +
                        "Pesto Chicken Slice (Cooked,60.00,Gms)," +
                        "Herbs (,2.00,Gms)," +
                        "Glaze (,2.00,Gms)," +
                        "Cheese Slice (,10.00,Gms)," +
                        "Cucumber (Sliced,15.00,Gms)"
        );
        row27.put("category", "sandwich");
        row27.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/pesto_chicken_sandwich.png?raw=true");
        row27.put("ingImg", "pestochickensandwich");
        row27.put("steps", "• Warm both bread slices on grill pan on both the sides. Warm Chicken pesto in microwavable bowl meanwhile.\n" +
                "• Apply Pesto on bread, then layer it with lettuce, onion rings, tomato slices, cucumber.\n" +
                "• Then sprinkle mix herbs and then add pesto chicken slice, cheese slice followed by drizzle of balsamic glaze.\n" +
                "• Cover the sandwich with another slice and then cut the sandwich one by two in triangular.\n" +
                "• Serve along with pepper and cucumber pickles.\n");
        row27.put("important_ingredients", "Pesto Chicken, cheese");
        row27.put("suggested_pairing", "Pomegranate juice");
        dataTable.add(row27);

// Paneer Harissa Sandwich
        HashMap<String, String> row28 = new HashMap<>();
        row28.put("table_hd_1", "Ingredients");
        row28.put("table_hd_2", "Specification");
        row28.put("table_hd_3", "Quantity");
        row28.put("table_hd_4", "Unit");
        row28.put("id", "28");
        row28.put("title", "Paneer Harissa Sandwich");
        row28.put("ingredients",
                "Bread (2 Slice,,2.00,No.)," +
                        "Harissa Sauce (,20.00,Gms)," +
                        "Lettuce (,15.00,Gms)," +
                        "Onion Slice (Rings,20.00,Gms)," +
                        "Tomato Slice (,30.00,Gms)," +
                        "Harissa Paneer Slice (,60.00,Gms)," +
                        "Herbs (,2.00,Gms)," +
                        "Glaze (,2.00,Gms)," +
                        "Cheese Slice (,10.00,Gms)," +
                        "Cucumber (Sliced,15.00,Gms)"
        );
        row28.put("category", "sandwich");
        row28.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/paneer_harissa_sandwich.png?raw=true");
        row28.put("ingImg", "paneerharissasandwich");
        row28.put("steps", "• Warm both bread slices on grill pan on both the sides. Warm Harissa Paneer slice in microwavable bowl meanwhile.\n" +
                "• Apply Harissa on bread, then layer it with lettuce, onion rings, tomato slices, cucumber.\n" +
                "• Then sprinkle mix herbs and then add Harissa paneer slice, cheese slice followed by drizzle of balsamic glaze.\n" +
                "• Cover the sandwich with another slice and then cut the sandwich one by two in triangular.\n" +
                "• Serve along with pepper and cucumber pickles.\n");
        row28.put("important_ingredients", "Harissa paneer, cheese");
        row28.put("suggested_pairing", "Green Life");
        dataTable.add(row28);

// Chicken Harissa Sandwich
        HashMap<String, String> row29 = new HashMap<>();
        row29.put("table_hd_1", "Ingredients");
        row29.put("table_hd_2", "Specification");
        row29.put("table_hd_3", "Quantity");
        row29.put("table_hd_4", "Unit");
        row29.put("id", "29");
        row29.put("title", "Chicken Harissa Sandwich");
        row29.put("ingredients",
                "Bread (2 Slice,,2.00,No.)," +
                        "Harissa Sauce (,20.00,Gms)," +
                        "Lettuce (,15.00,Gms)," +
                        "Onion Slice (Rings,20.00,Gms)," +
                        "Tomato Slice (,30.00,Gms)," +
                        "Harissa Chicken Slice (,60.00,Gms)," +
                        "Herbs (,2.00,Gms)," +
                        "Glaze (,2.00,Gms)," +
                        "Cheese Slice (,10.00,Gms)," +
                        "Cucumber (Sliced,15.00,Gms)"
        );
        row29.put("category", "sandwich");
        row29.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/chicken_harissa_sandwich.png?raw=true");
        row29.put("ingImg", "chickenharissasandwich");
        row29.put("steps", "• Warm both bread slices on grill pan on both the sides. Warm Harissa Chicken slice in microwavable bowl meanwhile.\n" +
                "• Apply Harissa on bread, then layer it with lettuce, onion rings, tomato slices, cucumber.\n" +
                "• Then sprinkle mix herbs and then add Harissa Chicken slice, cheese slice followed by drizzle of balsamic glaze.\n" +
                "• Cover the sandwich with another slice and then cut the sandwich one by two in triangular.\n" +
                "• Serve along with pepper and cucumber pickles.\n");
        row29.put("important_ingredients", "Harissa Chicken, cheese");
        row29.put("suggested_pairing", "Mix fruit juice");
        dataTable.add(row29);

// Egg n cheese Sandwich
        HashMap<String, String> row30 = new HashMap<>();
        row30.put("table_hd_1", "Ingredients");
        row30.put("table_hd_2", "Specification");
        row30.put("table_hd_3", "Quantity");
        row30.put("table_hd_4", "Unit");
        row30.put("id", "30");
        row30.put("title", "Egg n cheese Sandwich");
        row30.put("ingredients",
                "Bread Slices (No,2.00,No.)," +
                        "Harissa (Spread,20.00,Gms)," +
                        "Lettuce (,15.00,Gms)," +
                        "Onion Slice (Rings,15.00,Gms)," +
                        "Egg (Omelette,1.00,Gms)," +
                        "Sundried Tomato (,10.00,Gms)," +
                        "Cheese Sliced (,10.00,Gms)"
        );
        row30.put("category", "sandwich");
        row30.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/egg_n_cheese_sandwich.png?raw=true");
        row30.put("ingImg", "eggncheesesandwich");
        row30.put("steps", "• Warm both bread slices on grill pan on both the sides. Beat one egg add salt n pepper and then make thin omelette of it.\n" +
                "• Apply Harissa on bread, then layer it with lettuce, onion rings, omelette, sundried tomato and cheese slice.\n" +
                "• Cover the sandwich with another slice and then cut the sandwich one by two in triangular.\n" +
                "• Serve along with pepper and cucumber pickles.\n");
        row30.put("important_ingredients", "sundried Tomato, cheese");
        row30.put("suggested_pairing", "cherry Tomato sunrise");
        dataTable.add(row30);

// Classic Bombay Sandwich
        HashMap<String, String> row31 = new HashMap<>();
        row31.put("table_hd_1", "Ingredients");
        row31.put("table_hd_2", "Specification");
        row31.put("table_hd_3", "Quantity");
        row31.put("table_hd_4", "Unit");
        row31.put("id", "31");
        row31.put("title", "Classic Bombay Sandwich");
        row31.put("ingredients",
                "Bread (2 Slice,,2.00,No.)," +
                        "Green Chatni (,25.00,Gms)," +
                        "Lettuce (,15.00,Gms)," +
                        "Onion Slice (,20.00,Gms)," +
                        "Tomato Slice (,30.00,Gms)," +
                        "Cucumber Slice (,20.00,Gms)," +
                        "Potato Slice (boiled,20.00,Gms)," +
                        "Garam Masala, chaat Masala (,2.00,Gms)," +
                        "Cheese Slice (,10.00,Gms)"
        );
        row31.put("category", "sandwich");
        row31.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/classic_bombay_sandwich.png?raw=true");
        row31.put("ingImg", "classicbombaysandwich");
        row31.put("steps", "• Warm both bread slices on grill pan on both the sides.\n" +
                "• Apply Green chutney on bread, then layer it with lettuce, onion rings, tomato slices, cucumber slices, boiled potato slices then sprinkle garam masal and chaat masala.\n" +
                "• Then add cheese slice.\n" +
                "• Cover the sandwich with another slice and then cut the sandwich one by two in triangular.\n" +
                "• Serve along with pepper and cucumber pickles.\n");
        row31.put("important_ingredients", "Seasoning, cheese");
        row31.put("suggested_pairing", "Green goodness");
        dataTable.add(row31);

// Capresse sw
        HashMap<String, String> row32 = new HashMap<>();
        row32.put("table_hd_1", "Ingredients");
        row32.put("table_hd_2", "Specification");
        row32.put("table_hd_3", "Quantity");
        row32.put("table_hd_4", "Unit");
        row32.put("id", "32");
        row32.put("title", "Capresse Sandwich");
        row32.put("ingredients",
                "Bread (2 Slice,No.,2.00,No.)," +
                        "Pesto (Spread,20.00,Gms)," +
                        "Arugula Leave (,20.00,Gms)," +
                        "Tomato Slice (,40.00,Gms)," +
                        "Mixed Herbs (,2.00,Gms)," +
                        "Balsamic Glaze (,2.00,Gms)," +
                        "Mozzarella Grated (,20.00,Gms)"
        );
        row32.put("category", "sandwich");
        row32.put("image", "https://github.com/abh7shekKr/NourishingFarmAssets/blob/main/capresse_sandwich.png?raw=true");
        row32.put("ingImg", "capressesandwich");
        row32.put("steps", "• Warm both bread slices on grill pan on both the sides.\n" +
                "• Apply pesto on bread, then layer it with arugula, tomato slices.\n" +
                "• Sprinkle mix herbs and drizzle balsamic glaze and then spread grated mozzarella.\n" +
                "• Cover the sandwich with another slice and then cut the sandwich one by two in triangular.\n" +
                "• Serve along with pepper and cucumber pickles.\n");
        row32.put("important_ingredients", "Pesto, mozzarella");
        row32.put("suggested_pairing", "Pomegranate juice");
        dataTable.add(row32);


        // Juicess
        // Green Goodness
        HashMap<String, String> row33 = new HashMap<>();
        row33.put("table_hd_1", "Ingredients");
        row33.put("table_hd_2", "Single Serving");
        row33.put("table_hd_3", "5 Serving");
        row33.put("table_hd_4", "-");
        row33.put("id", "33");
        row33.put("title", "Green Goodness");
        row33.put("ingredients",
                "Celery (30.12 Gms, 150.60 Gms)," +
                        "Kale (27.11 Gms, 135.55 Gms)," +
                        "Lettuce (52.71 Gms, 263.55 Gms)," +
                        "Spinach (27.10 Gms, 135.50 Gms)," +
                        "Cucumber (110.00 Gms, 550.00 Gms)," +
                        "Apple (135.54 Gms, 677.70 Gms)," +
                        "Orange (90.36 Gms, 451.80 Gms)," +
                        "Lemon (6.02 Gms, 30.10 Gms)," +
                        "Ginger (6.52 Gms, 32.60 Gms)"
        );
        row33.put("category", "juice");
        row33.put("image", "https://github.com/yourimagepath/green_goodness.png?raw=true");
        row33.put("ingImg", "greengoodness");
        row33.put("steps", "• Take all the ingredients, wash them properly, and cut them into small pieces.\n" +
                "• Blend them in a cold press juicer.\n" +
                "• Strain and serve.\n");
        row33.put("important_ingredients", "Kale, Spinach, Cucumber");
        row33.put("suggested_pairing", "Southwest Salad");
        dataTable.add(row33);

        // Beet Bliss
        HashMap<String, String> row34 = new HashMap<>();
        row34.put("table_hd_1", "Ingredients");
        row34.put("table_hd_2", "Single Serving");
        row34.put("table_hd_3", "5 Serving");
        row34.put("id", "34");
        row34.put("title", "Beet Bliss");
        row34.put("ingredients",
                "Beet (44.78 Gms, 223.90 Gms)," +
                        "Carrot (198.51 Gms, 992.55 Gms)," +
                        "Cucumber (111.94 Gms, 559.70 Gms)," +
                        "Orange (119.40 Gms, 597.00 Gms)," +
                        "Pomegranate (19.40 Gms, 97.00 Gms)," +
                        "Lemon (5.97 Gms, 29.85 Gms)"
        );
        row34.put("category", "juice");
        row34.put("image", "https://github.com/yourimagepath/beet_bliss.png?raw=true");
        row34.put("ingImg", "beetbliss");
        row34.put("steps", "• Take all the ingredients, wash them properly, and cut them into small pieces.\n" +
                "• Blend them in a cold press juicer.\n" +
                "• Strain and serve.\n");
        row34.put("important_ingredients", "Beet, Carrot");
        row34.put("suggested_pairing", "Pasta Salad");
        dataTable.add(row34);

        // Red Pepper Revitalizer
        HashMap<String, String> row35 = new HashMap<>();
        row35.put("table_hd_1", "Ingredients");
        row35.put("table_hd_2", "Single Serving");
        row35.put("table_hd_3", "5 Serving");
        row35.put("id", "35");
        row35.put("title", "Red Pepper Revitalizer");
        row35.put("ingredients",
                "Red Capsicum (29.76 Gms, 148.80 Gms)," +
                        "Carrot (223.21 Gms, 1116.05 Gms)," +
                        "Cucumber (111.61 Gms, 558.05 Gms)," +
                        "Apple (126.49 Gms, 632.45 Gms)," +
                        "Lemon (8.93 Gms, 44.65 Gms)"
        );
        row35.put("category", "juice");
        row35.put("image", "https://github.com/yourimagepath/red_pepper_revitalizer.png?raw=true");
        row35.put("ingImg", "redpepperrevitalizer");
        row35.put("steps", "• Take all the ingredients, wash them properly, and cut them into small pieces.\n" +
                "• Blend them in a cold press juicer.\n" +
                "• Strain and serve.\n");
        row35.put("important_ingredients", "Red Capsicum, Cucumber");
        row35.put("suggested_pairing", "Greek Salad");
        dataTable.add(row35);

        // Cherry Tomato Sunrise
        HashMap<String, String> row36 = new HashMap<>();
        row36.put("table_hd_1", "Ingredients");
        row36.put("table_hd_2", "Single Serving");
        row36.put("table_hd_3", "5 Serving");
        row36.put("id", "36");
        row36.put("title", "Cherry Tomato Sunrise");
        row36.put("ingredients",
                "Cherry Tomato (60.24 Gms, 301.20 Gms)," +
                        "Carrot (146.08 Gms, 730.40 Gms)," +
                        "Cucumber (128.01 Gms, 640.05 Gms)," +
                        "Apple (156.63 Gms, 783.15 Gms)," +
                        "Lemon (9.04 Gms, 45.20 Gms)"
        );
        row36.put("category", "juice");
        row36.put("image", "https://github.com/yourimagepath/cherry_tomato_sunrise.png?raw=true");
        row36.put("ingImg", "cherrytomatosunrise");
        row36.put("steps", "• Take all the ingredients, wash them properly, and cut them into small pieces.\n" +
                "• Blend them in a cold press juicer.\n" +
                "• Strain and serve.\n");
        row36.put("important_ingredients", "Cherry Tomato, Apple");
        row36.put("suggested_pairing", "Lentil Taco Salad");
        dataTable.add(row36);

        // Valencia Orange Juice
        HashMap<String, String> row37 = new HashMap<>();
        row37.put("table_hd_1", "Ingredients");
        row37.put("table_hd_2", "Specification");
        row37.put("table_hd_3", "Quantity");
        row37.put("table_hd_4", "Unit");
        row37.put("id", "37");
        row37.put("title", "Valencia Orange Juice");
        row37.put("ingredients",
                "Orange (500.00 Gms)"
        );
        row37.put("category", "juice");
        row37.put("image", "https://github.com/yourimagepath/valencia_orange_juice.png?raw=true");
        row37.put("ingImg", "valenciaorangejuice");
        row37.put("steps", "• Take the orange, peel and wash it.\n" +
                "• Blend them in a cold press juicer.\n" +
                "• Strain and serve.\n");
        row37.put("important_ingredients", "Orange");
        row37.put("suggested_pairing", "Paneer Harissa SW");
        dataTable.add(row37);

        // Tropical Paradise
        HashMap<String, String> row38 = new HashMap<>();
        row38.put("table_hd_1", "Ingredients");
        row38.put("table_hd_2", "Specification");
        row38.put("table_hd_3", "Quantity");
        row38.put("table_hd_4", "Unit");
        row38.put("id", "38");
        row38.put("title", "Tropical Paradise");
        row38.put("ingredients",
                "Orange (160.00 Gms)," +
                        "Pineapple (160.00 Gms)"
        );
        row38.put("category", "juice");
        row38.put("image", "https://github.com/yourimagepath/tropical_paradise.png?raw=true");
        row38.put("ingImg", "tropicalparadise");
        row38.put("steps", "• Take orange and pineapple, peel and wash them.\n" +
                "• Blend them in a cold press juicer.\n" +
                "• Strain and serve.\n");
        row38.put("important_ingredients", "Orange, Pineapple");
        row38.put("suggested_pairing", "Bombay SW");
        dataTable.add(row38);

        // Watermelon Mint
        HashMap<String, String> row39 = new HashMap<>();
        row39.put("table_hd_1", "Ingredients");
        row39.put("table_hd_2", "Single Serving");
        row39.put("table_hd_3", "5 Serving");
        row39.put("id", "39");
        row39.put("title", "Watermelon Mint");
        row39.put("ingredients",
                "Watermelon (350.00 Gms, 1750.00 Gms)," +
                        "Pomegranate (20.00 Gms, 100.00 Gms)," +
                        "Mint (5.00 Gms, 25.00 Gms)"
        );
        row39.put("category", "juice");
        row39.put("image", "https://github.com/yourimagepath/watermelon_mint.png?raw=true");
        row39.put("ingImg", "watermelonmint");
        row39.put("steps", "• Take the watermelon, peel, and cut it into small pieces.\n" +
                "• Blend with mint and pomegranate in a juicer.\n" +
                "• Strain and serve chilled.\n");
        row39.put("important_ingredients", "Watermelon, Mint");
        row39.put("suggested_pairing", "Couscous Salad");
        dataTable.add(row39);


        //Soups
        // Roasted Cherry Tomato n Basil Soup
        HashMap<String, String> row40 = new HashMap<>();
        row40.put("table_hd_1", "Ingredients");
        row40.put("table_hd_2", "Specification");
        row40.put("table_hd_3", "Quantity");
        row40.put("table_hd_4", "Unit");
        row40.put("id", "40");
        row40.put("title", "Roasted Cherry Tomato n Basil");
        row40.put("ingredients",
                "Tomato (cubes,300.00,Gms),"+
                        "Cherry Tomato (,5.00,Gms), " +
                        "Olive Oil Blend (,5.00,Gms), " +
                        "Garlic (sliced,10.00,Gms), " +
                        "Onion (chopped,20.00,Gms), " +
                        "Black Pepper Powder (,1.00,Gms), " +
                        "Salt (,2.00,Gms), " +
                        "Veg Broth (,1.00,Gms), " +
                        "Water (,160.00,Gms), " +
                        "Beetroot (,10.00,Gms), " +
                        "Basil (,10.00,Gms), " +
                        "Oregano Spice Sprinkler (2.00 Gms)"
        );
        row40.put("category", "soup");
        row40.put("image", "https://github.com/yourimagepath/roasted_cherry_tomato_basil.png?raw=true");
        row40.put("ingImg", "roastedcherrytomatobasil");
        row40.put("steps", "• Chop onions and garlic.\n" +
                "• Cut tomatoes into quarters and boil them.\n" +
                "• Heat olive oil in a pan, add garlic and onions, and sauté for 2-3 minutes.\n" +
                "• Add oregano, black pepper, and veg broth powder.\n" +
                "• Once tomatoes are cooked, strain and cool.\n" +
                "• Blend tomatoes, basil, and sautéed onion-garlic with water.\n" +
                "• Strain, add salt if needed, and store.\n"
        );
        row40.put("important_ingredients", "Basil");
        row40.put("suggested_pairing", "Chicken Harissa SW");
        dataTable.add(row40);

        // Confit Garlic Mushroom Soup
        HashMap<String, String> row41 = new HashMap<>();
        row41.put("table_hd_1", "Ingredients");
        row41.put("table_hd_2", "Specification");
        row41.put("table_hd_3", "Quantity");
        row41.put("table_hd_4", "Unit");
        row41.put("id", "41");
        row41.put("title", "Confit Garlic Mushroom Soup");
        row41.put("ingredients",
                "Olive Oil Blend (,5.00,Gms), " +
                        "Garlic (Whole,30.00,Gms), " +
                        "Onion (chopped,20.00,Gms), " +
                        "Mushroom (,200.00,Gms), " +
                        "Oregano Spice Sprinkler (,3.00,Gms), " +
                        "Water (,270.00,Gms), " +
                        "Salt (,2.00,Gms), " +
                        "Black Pepper Powder (,1.00,Gms), " +
                        "Veg Broth (,1.00,Gms)"
        );
        row41.put("category", "soup");
        row41.put("image", "https://github.com/yourimagepath/confit_garlic_mushroom.png?raw=true");
        row41.put("ingImg", "confitgarlicmushroom");
        row41.put("steps", "• Chop onions and slice mushrooms.\n" +
                "• Heat olive oil in a pan, add garlic, and sauté for a minute.\n" +
                "• Add onions and sauté further.\n" +
                "• Add mushrooms and cook for 2-3 minutes.\n" +
                "• Add oregano, black pepper, and veg broth powder, then cool.\n" +
                "• Blend with water, strain, and add salt if needed.\n"
        );
        row41.put("important_ingredients", "Parsley");
        row41.put("suggested_pairing", "Paneer Harissa SW");
        dataTable.add(row41);

        // Broccoli and Almond Soup
        HashMap<String, String> row42 = new HashMap<>();
        row42.put("table_hd_1", "Ingredients");
        row42.put("table_hd_2", "Specification");
        row42.put("table_hd_3", "Quantity");
        row42.put("table_hd_4", "Unit");
        row42.put("id", "42");
        row42.put("title", "Broccoli and Almond Soup");
        row42.put("ingredients",
                "Olive Oil Blend (,5.00,Ml), " +
                        "Garlic (Sliced,10.00,Gms), " +
                        "Onion (Chopped,20.00,Gms), " +
                        "Broccoli (,175.00,Gms), " +
                        "Almond (3numbers,5.00,Gms), " +
                        "Water (,470.00,Ml), " +
                        "Salt (,2.00,Gms), " +
                        "Spinach (,10.00,Gms), " +
                        "Black Pepper Powder (,1.00,Gms), " +
                        "Cheddar Cheese (,40.00,Gms), " +
                        "Veg Broth (,1.00,Gms)"
        );
        row42.put("category", "soup");
        row42.put("image", "https://github.com/yourimagepath/broccoli_almond.png?raw=true");
        row42.put("ingImg", "broccolialmond");
        row42.put("steps", "• Chop onions, slice garlic, and cut broccoli into florets.\n" +
                "• Heat olive oil, add onions and garlic, and sauté.\n" +
                "• Boil water with salt, add broccoli, and cook.\n" +
                "• Add spinach, strain, add cheddar cheese, and check seasoning.\n" +
                "• Cool, blend, strain, and store.\n"
        );
        row42.put("important_ingredients", "Parsley");
        row42.put("suggested_pairing", "Paneer Pesto SW");
        dataTable.add(row42);

        //Warm bowls
// 43) Paneer Thai Green Curry Barley Bowl
        HashMap<String, String> row43 = new HashMap<>();
        row43.put("table_hd_1", "Ingredients");
        row43.put("table_hd_2", "Specification");
        row43.put("table_hd_3", "Quantity");
        row43.put("table_hd_4", "Unit");
        row43.put("id", "43");
        row43.put("title", "Paneer Thai Green Curry Barley Bowl");
        row43.put("ingredients",
                "Roasted Paneer (cubes/ Roasted, 50.00, Gms), " +
                        "Thai Green Curry (, 100.00, Ml), " +
                        "Boiled Barley (Boiled, 80.00, Gms), " +
                        "Mix Lettuce (, 20.00, Gms), " +
                        "Roasted Zucchini (Roasted, 25.00, Gms), " +
                        "Roasted Capsicum (Roasted, 25.00, Gms), " +
                        "Roasted Corn (Boiled, 20.00, Gms), " +
                        "Sliced Black Olives (Sliced, 5.00, Gms), " +
                        "Roasted Carrots (Cubes Boiled, 20.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "Roasted French Beans (One inch blanched, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row43.put("category", "bowl");
        row43.put("image", "https://github.com/yourimagepath/paneer_thai_green_curry.png?raw=true");
        row43.put("ingImg", "paneerthaigreencurry");
        row43.put("steps",
                "• Cut carrots, zucchini, and capsicum in cubes. Cut French beans approx. 1 inch.\n" +
                        "• Boil corn, French beans, and carrots. Sauté zucchini and capsicum.\n" +
                        "• Warm paneer, Thai green curry, and barley in microwave.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Start with vegetables, barley, protein, cherry tomatoes, and garnish with basil.\n" +
                        "• Serve warm."
        );
        row43.put("important_ingredients", "Roasted Paneer, Thai Green Curry, Barley");
        row43.put("suggested_pairing", "Green Goodness Juice");
        dataTable.add(row43);

// 44) Chicken Thai Green Curry Barley Bowl
        HashMap<String, String> row44 = new HashMap<>();
        row44.put("table_hd_1", "Ingredients");
        row44.put("table_hd_2", "Specification");
        row44.put("table_hd_3", "Quantity");
        row44.put("table_hd_4", "Unit");
        row44.put("id", "44");
        row44.put("title", "Chicken Thai Green Curry Barley Bowl");
        row44.put("ingredients",
                "Chicken (cubes/ Roasted, 50.00, Gms), " +
                        "Thai Green Curry (, 100.00, Ml), " +
                        "Barley (Boiled, 80.00, Gms), " +
                        "Mix Lettuce (, 20.00, Gms), " +
                        "Zucchini cubes (Roasted, 25.00, Gms), " +
                        "Mix Pepper Cubes (Roasted, 25.00, Gms), " +
                        "Corn (Boiled, 20.00, Gms), " +
                        "Olives (Sliced, 5.00, Gms), " +
                        "Carrots (Cubes Boiled, 20.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "French Beans (One inch blanched, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row44.put("category", "bowl");
        row44.put("image", "https://github.com/yourimagepath/chicken_thai_green_curry.png?raw=true");
        row44.put("ingImg", "chickenthaigreencurry");
        row44.put("steps",
                "• Cut carrots, zucchini, and capsicum in cubes. Cut French beans approx. 1 inch.\n" +
                        "• Boil corn, French beans, and carrots. Sauté zucchini and capsicum.\n" +
                        "• Warm chicken, Thai green curry, and barley in microwave.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Start with vegetables, barley, protein, cherry tomatoes, and garnish with basil.\n" +
                        "• Serve warm."
        );
        row44.put("important_ingredients", "Roasted Chicken, Thai Green Curry, Barley");
        row44.put("suggested_pairing", "Valencia Orange Juice");
        dataTable.add(row44);

// 45) Tofu Thai Red Curry Black Rice Bowl
        HashMap<String, String> row45 = new HashMap<>();
        row45.put("table_hd_1", "Ingredients");
        row45.put("table_hd_2", "Specification");
        row45.put("table_hd_3", "Quantity");
        row45.put("table_hd_4", "Unit");
        row45.put("id", "45");
        row45.put("title", "Tofu Thai Red Curry Black Rice Bowl");
        row45.put("ingredients",
                "Tofu (cubes/ Roasted, 50.00, Gms), " +
                        "Thai Red Curry (, 100.00, Ml), " +
                        "Black Rice (Boiled, 80.00, Gms), " +
                        "Lettuce (, 20.00, Gms), " +
                        "Zucchini cubes (Roasted, 25.00, Gms), " +
                        "Mix Pepper Cubes (Roasted, 25.00, Gms), " +
                        "Corn (Boiled, 20.00, Gms), " +
                        "Olives (Sliced, 5.00, Gms), " +
                        "Carrots (Cubes Boiled, 20.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "French Beans (One inch blanched, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row45.put("category", "bowl");
        row45.put("image", "https://github.com/yourimagepath/tofu_thai_red_curry.png?raw=true");
        row45.put("ingImg", "tofuthairedcurry");
        row45.put("steps",
                "• Cut carrots, zucchini, and capsicum in cubes. Cut French beans approx. 1 inch.\n" +
                        "• Boil corn, French beans, and carrots. Sauté zucchini and capsicum.\n" +
                        "• Warm tofu, Thai red curry, and black rice in microwave.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Start with vegetables, black rice, protein, cherry tomatoes, and garnish with basil.\n" +
                        "• Serve warm."
        );
        row45.put("important_ingredients", "Roasted Tofu, Thai Red Curry, Black Rice");
        row45.put("suggested_pairing", "Tropical Paradise Juice");
        dataTable.add(row45);

// 46) Chicken Thai Red Curry Black Rice Bowl
        HashMap<String, String> row46 = new HashMap<>();
        row46.put("table_hd_1", "Ingredients");
        row46.put("table_hd_2", "Specification");
        row46.put("table_hd_3", "Quantity");
        row46.put("table_hd_4", "Unit");
        row46.put("id", "46");
        row46.put("title", "Chicken Thai Red Curry Black Rice Bowl");
        row46.put("ingredients",
                "Chicken (cubes/ Roasted, 50.00, Gms), " +
                        "Thai Red Curry (, 100.00, Ml), " +
                        "Black Rice (Boiled, 80.00, Gms), " +
                        "Lettuce (, 20.00, Gms), " +
                        "Zucchini cubes (Roasted, 25.00, Gms), " +
                        "Mix Pepper Cubes (Roasted, 25.00, Gms), " +
                        "Corn (Boiled, 20.00, Gms), " +
                        "Olives (Sliced, 5.00, Gms), " +
                        "Carrots (Cubes Boiled, 20.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "French Beans (One inch blanched, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row46.put("category", "bowl");
        row46.put("image", "https://github.com/yourimagepath/chicken_thai_red_curry.png?raw=true");
        row46.put("ingImg", "chickenthairedcurry");
        row46.put("steps",
                "• Cut carrots, zucchini, and capsicum in cubes. Cut French beans approx. 1 inch.\n" +
                        "• Boil corn, French beans, and carrots. Sauté zucchini and capsicum.\n" +
                        "• Warm chicken, Thai red curry, and black rice in microwave.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Start with vegetables, black rice, protein, cherry tomatoes, and garnish with basil.\n" +
                        "• Serve warm."
        );
        row46.put("important_ingredients", "Roasted Chicken, Thai Red Curry, Black Rice");
        row46.put("suggested_pairing", "Citrus Bliss Juice");
        dataTable.add(row46);

        // 47) Roasted Vegetable Thai Red Curry Black Rice Bowl
        HashMap<String, String> row47 = new HashMap<>();
        row47.put("table_hd_1", "Ingredients");
        row47.put("table_hd_2", "Specification");
        row47.put("table_hd_3", "Quantity");
        row47.put("table_hd_4", "Unit");
        row47.put("id", "47");
        row47.put("title", "Roasted Vegetable Thai Red Curry Black Rice Bowl");
        row47.put("ingredients",
                "Roasted Vegetables (Zucchini, Capsicum, Carrots, 50.00, Gms), " +
                        "Thai Red Curry (, 100.00, Ml), " +
                        "Black Rice (Boiled, 80.00, Gms), " +
                        "Mix Lettuce (, 20.00, Gms), " +
                        "Corn (Boiled, 20.00, Gms), " +
                        "Olives (Sliced, 5.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "French Beans (One inch blanched, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row47.put("category", "bowl");
        row47.put("image", "https://github.com/yourimagepath/roasted_vegetable_thai_red_curry.png?raw=true");
        row47.put("ingImg", "roastedvegetablethairedcurry");
        row47.put("steps",
                "• Roast zucchini, capsicum, and carrots.\n" +
                        "• Boil corn, French beans, and black rice.\n" +
                        "• Warm Thai red curry.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Garnish with basil and serve warm."
        );
        row47.put("important_ingredients", "Roasted Vegetables, Thai Red Curry, Black Rice");
        row47.put("suggested_pairing", "Tropical Paradise Juice");
        dataTable.add(row47);

// 48) Tofu Miso Black Rice Bowl
        HashMap<String, String> row48 = new HashMap<>();
        row48.put("table_hd_1", "Ingredients");
        row48.put("table_hd_2", "Specification");
        row48.put("table_hd_3", "Quantity");
        row48.put("table_hd_4", "Unit");
        row48.put("id", "48");
        row48.put("title", "Tofu Miso Black Rice Bowl");
        row48.put("ingredients",
                "Tofu (Cubes Roasted, 50.00, Gms), " +
                        "Miso Paste (, 15.00, Gms), " +
                        "Black Rice (Boiled, 80.00, Gms), " +
                        "Lettuce (, 20.00, Gms), " +
                        "Zucchini (Roasted, 25.00, Gms), " +
                        "Carrots (Cubes Boiled, 20.00, Gms), " +
                        "French Beans (One inch blanched, 10.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row48.put("category", "bowl");
        row48.put("image", "https://github.com/yourimagepath/tofu_miso_black_rice.png?raw=true");
        row48.put("ingImg", "tofumiso");
        row48.put("steps",
                "• Roast tofu, zucchini, and carrots.\n" +
                        "• Prepare miso paste and warm black rice.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Garnish with basil and serve warm."
        );
        row48.put("important_ingredients", "Roasted Tofu, Miso Paste, Black Rice");
        row48.put("suggested_pairing", "Ginger Zest Juice");
        dataTable.add(row48);

// 49) Chicken Miso Black Rice Bowl
        HashMap<String, String> row49 = new HashMap<>();
        row49.put("table_hd_1", "Ingredients");
        row49.put("table_hd_2", "Specification");
        row49.put("table_hd_3", "Quantity");
        row49.put("table_hd_4", "Unit");
        row49.put("id", "49");
        row49.put("title", "Chicken Miso Black Rice Bowl");
        row49.put("ingredients",
                "Chicken (Cubes Roasted, 50.00, Gms), " +
                        "Miso Paste (, 15.00, Gms), " +
                        "Black Rice (Boiled, 80.00, Gms), " +
                        "Lettuce (, 20.00, Gms), " +
                        "Zucchini (Roasted, 25.00, Gms), " +
                        "Carrots (Cubes Boiled, 20.00, Gms), " +
                        "French Beans (One inch blanched, 10.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row49.put("category", "bowl");
        row49.put("image", "https://github.com/yourimagepath/chicken_miso_black_rice.png?raw=true");
        row49.put("ingImg", "chickenmiso");
        row49.put("steps",
                "• Roast chicken, zucchini, and carrots.\n" +
                        "• Prepare miso paste and warm black rice.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Garnish with basil and serve warm."
        );
        row49.put("important_ingredients", "Roasted Chicken, Miso Paste, Black Rice");
        row49.put("suggested_pairing", "Lemon Ginger Juice");
        dataTable.add(row49);

// 50) Paneer Butter Masala Quinoa Bowl
        HashMap<String, String> row50 = new HashMap<>();
        row50.put("table_hd_1", "Ingredients");
        row50.put("table_hd_2", "Specification");
        row50.put("table_hd_3", "Quantity");
        row50.put("table_hd_4", "Unit");
        row50.put("id", "50");
        row50.put("title", "Paneer Butter Masala Quinoa Bowl");
        row50.put("ingredients",
                "Paneer (Roasted, 50.00, Gms), " +
                        "Butter Masala Sauce (, 100.00, Ml), " +
                        "Quinoa (Boiled, 80.00, Gms), " +
                        "Lettuce (, 20.00, Gms), " +
                        "Corn (Boiled, 20.00, Gms), " +
                        "French Beans (One inch blanched, 10.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row50.put("category", "bowl");
        row50.put("image", "https://github.com/yourimagepath/paneer_butter_masala_quinoa.png?raw=true");
        row50.put("ingImg", "paneerbuttermasala");
        row50.put("steps",
                "• Roast paneer.\n" +
                        "• Warm butter masala sauce and boiled quinoa.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Garnish with basil and serve warm."
        );
        row50.put("important_ingredients", "Paneer, Butter Masala Sauce, Quinoa");
        row50.put("suggested_pairing", "Mango Lassi");
        dataTable.add(row50);

// 51) Chicken Butter Masala Quinoa Bowl
        HashMap<String, String> row51 = new HashMap<>();
        row51.put("table_hd_1", "Ingredients");
        row51.put("table_hd_2", "Specification");
        row51.put("table_hd_3", "Quantity");
        row51.put("table_hd_4", "Unit");
        row51.put("id", "51");
        row51.put("title", "Chicken Butter Masala Quinoa Bowl");
        row51.put("ingredients",
                "Chicken (Roasted, 50.00, Gms), " +
                        "Butter Masala Sauce (, 100.00, Ml), " +
                        "Quinoa (Boiled, 80.00, Gms), " +
                        "Lettuce (, 20.00, Gms), " +
                        "Corn (Boiled, 20.00, Gms), " +
                        "French Beans (One inch blanched, 10.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row51.put("category", "bowl");
        row51.put("image", "https://github.com/yourimagepath/chicken_butter_masala_quinoa.png?raw=true");
        row51.put("ingImg", "chickenbuttermasala");
        row51.put("steps",
                "• Roast chicken.\n" +
                        "• Warm butter masala sauce and boiled quinoa.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Garnish with basil and serve warm."
        );
        row51.put("important_ingredients", "Chicken, Butter Masala Sauce, Quinoa");
        row51.put("suggested_pairing", "Mint Lassi");
        dataTable.add(row51);

// 52) Vegetable Butter Masala Quinoa Bowl
        HashMap<String, String> row52 = new HashMap<>();
        row52.put("table_hd_1", "Ingredients");
        row52.put("table_hd_2", "Specification");
        row52.put("table_hd_3", "Quantity");
        row52.put("table_hd_4", "Unit");
        row52.put("id", "52");
        row52.put("title", "Vegetable Butter Masala Quinoa Bowl");
        row52.put("ingredients",
                "Mixed Vegetables (Zucchini, Carrots, Corn, 50.00, Gms), " +
                        "Butter Masala Sauce (, 100.00, Ml), " +
                        "Quinoa (Boiled, 80.00, Gms), " +
                        "Lettuce (, 20.00, Gms), " +
                        "Cherry Tomato (Cut In Half, 10.00, Gms), " +
                        "Basil (Julienne, garnish, 2.00, Gms)"
        );
        row52.put("category", "bowl");
        row52.put("image", "https://github.com/yourimagepath/vegetable_butter_masala_quinoa.png?raw=true");
        row52.put("ingImg", "vegetablebuttermasala");
        row52.put("steps",
                "• Sauté mixed vegetables.\n" +
                        "• Warm butter masala sauce and boiled quinoa.\n" +
                        "• Arrange mix lettuce, sauce in container, then ingredients vertically.\n" +
                        "• Garnish with basil and serve warm."
        );
        row52.put("important_ingredients", "Mixed Vegetables, Butter Masala Sauce, Quinoa");
        row52.put("suggested_pairing", "Coconut Lassi");
        dataTable.add(row52);

        //smoothies
        // 53) Go Green Smoothie
        HashMap<String, String> row53 = new HashMap<>();
        row53.put("table_hd_1", "Ingredients");
        row53.put("table_hd_2", "Specification");
        row53.put("table_hd_3", "Quantity");
        row53.put("table_hd_4", "Unit");
        row53.put("id", "53");
        row53.put("title", "Go Green Smoothie");
        row53.put("ingredients",
                "Zucchini (Frozen, 65.00, Gms), " +
                        "Banana (Frozen, 65.00, Gms), " +
                        "Milk (, 150.00, Gms), " +
                        "Dates (, 20.00, Gms), " +
                        "Coconut Fresh (, 10.00, Gms), " +
                        "Kale (, 10.00, Gms), " +
                        "Spinach (, 30.00, Gms)"
        );
        row53.put("category", "smoothie");
        row53.put("image", "https://github.com/yourimagepath/go_green_smoothie.png?raw=true");
        row53.put("ingImg", "gogreensmoothie");
        row53.put("steps",
                "• Take zucchini, banana, milk, dates, coconut, kale, and spinach in a JTC blender and blend for 60 seconds.\n" +
                        "• Pour into a bowl.\n" +
                        "• Garnish with banana slices, mango cubes, granola, roasted coconut shaves, and pomegranate."
        );
        row53.put("important_ingredients", "Kale, Spinach");
        row53.put("suggested_pairing", "Paneer Pesto Sandwich");
        dataTable.add(row53);

// 54) Cashew Flaxseed Smoothie
        HashMap<String, String> row54 = new HashMap<>();
        row54.put("table_hd_1", "Ingredients");
        row54.put("table_hd_2", "Specification");
        row54.put("table_hd_3", "Quantity");
        row54.put("table_hd_4", "Unit");
        row54.put("id", "54");
        row54.put("title", "Cashew Flaxseed Smoothie");
        row54.put("ingredients",
                "Banana (, 75.00, Gms), " +
                        "Zucchini (, 75.00, Gms), " +
                        "Dates (, 20.00, Gms), " +
                        "Roasted Cashew (, 25.00, Gms), " +
                        "Tahini (, 15.00, Gms), " +
                        "Flax seeds (, 5.00, Gms), " +
                        "Cinnamon (, 1.00, Gms), " +
                        "Salt (, 1.00, Gms), " +
                        "Milk (, 130.00, Gms)"
        );
        row54.put("category", "smoothie");
        row54.put("image", "https://github.com/yourimagepath/cashew_flaxseed_smoothie.png?raw=true");
        row54.put("ingImg", "cashewflaxseedsmoothie");
        row54.put("steps",
                "• Take zucchini, banana, milk, dates, roasted cashew, tahini, flax seeds, cinnamon, and salt in a JTC blender and blend for 60 seconds.\n" +
                        "• Pour into a bowl.\n" +
                        "• Garnish with banana slices, roasted cashew, peanut butter, sesame seeds, and pomegranate."
        );
        row54.put("important_ingredients", "Tahini, Flax Seeds");
        row54.put("suggested_pairing", "Paneer Harissa Sandwich");
        dataTable.add(row54);

// 55) Sweet & Spicy Pineapple Smoothie Bowl
        HashMap<String, String> row55 = new HashMap<>();
        row55.put("table_hd_1", "Ingredients");
        row55.put("table_hd_2", "Specification");
        row55.put("table_hd_3", "Quantity");
        row55.put("table_hd_4", "Unit");
        row55.put("id", "55");
        row55.put("title", "Sweet & Spicy Pineapple Smoothie Bowl");
        row55.put("ingredients",
                "Banana (Frozen, 35.00, Gms), " +
                        "Zucchini (Frozen, 35.00, Gms), " +
                        "Pineapple (Frozen, 95.00, Gms), " +
                        "Milk (, 180.00, Gms), " +
                        "Flaxseeds (, 5.00, Gms), " +
                        "Ginger (, 5.00, Gms), " +
                        "Turmeric (, 1.00, Gms), " +
                        "Cayenne Pepper (, 2.00, Gms), " +
                        "Black Pepper (, 1.00, Gms)"
        );
        row55.put("category", "smoothie");
        row55.put("image", "https://github.com/yourimagepath/sweet_spicy_pineapple.png?raw=true");
        row55.put("ingImg", "sweetspicypineapple");
        row55.put("steps",
                "• Take zucchini, banana, pineapple, milk, ginger, cayenne pepper, black pepper, and flax seeds in a JTC blender and blend for 60 seconds.\n" +
                        "• Pour into a bowl.\n" +
                        "• Garnish with banana slices, granola, roasted coconut shaves, kiwi slices, and flax seeds."
        );
        row55.put("important_ingredients", "Pineapple, Flax Seeds");
        row55.put("suggested_pairing", "Paneer Harissa Wrap");
        dataTable.add(row55);

// 56) Vibrant Berry Smoothie
        HashMap<String, String> row56 = new HashMap<>();
        row56.put("table_hd_1", "Ingredients");
        row56.put("table_hd_2", "Specification");
        row56.put("table_hd_3", "Quantity");
        row56.put("table_hd_4", "Unit");
        row56.put("id", "56");
        row56.put("title", "Vibrant Berry Smoothie");
        row56.put("ingredients",
                "Green Zucchini (Frozen, 30.00, Gms), " +
                        "Yellow Zucchini (Frozen, 30.00, Gms), " +
                        "Frozen Strawberry (Frozen, 80.00, Gms), " +
                        "Milk Amul Gold (, 150.00, Ml), " +
                        "Beetroot (Frozen, 30.00, Gms), " +
                        "Dates (, 40.00, Gms)"
        );
        row56.put("category", "smoothie");
        row56.put("image", "https://github.com/yourimagepath/vibrant_berry_smoothie.png?raw=true");
        row56.put("ingImg", "vibrantberrysmoothie");
        row56.put("steps",
                "• Take zucchini, strawberries, beetroot, milk, and dates in a JTC blender and blend for 60 seconds.\n" +
                        "• Pour into a bowl.\n" +
                        "• Garnish with banana slices, granola, roasted coconut shaves, roasted almond slices, peanut butter, and sesame seeds."
        );
        row56.put("important_ingredients", "Strawberries");
        row56.put("suggested_pairing", "Chicken Harissa Wrap");
        dataTable.add(row56);

// 57) Acai Berry Smoothie
        HashMap<String, String> row57 = new HashMap<>();
        row57.put("table_hd_1", "Ingredients");
        row57.put("table_hd_2", "Specification");
        row57.put("table_hd_3", "Quantity");
        row57.put("table_hd_4", "Unit");
        row57.put("id", "57");
        row57.put("title", "Acai Berry Smoothie");
        row57.put("ingredients",
                "Green Zucchini (Frozen, 30.00, Gms), " +
                        "Yellow Zucchini (Frozen, 30.00, Gms), " +
                        "Frozen Strawberry (Frozen, 80.00, Gms), " +
                        "Milk Amul Gold (, 150.00, Ml), " +
                        "Acai powder (, 3.00, Gms), " +
                        "Dates (, 40.00, Gms), " +
                        "Beetroot (Frozen, 30.00, Gms)"
        );
        row57.put("category", "smoothie");
        row57.put("image", "https://github.com/yourimagepath/acai_berry_smoothie.png?raw=true");
        row57.put("ingImg", "acaiberrysmoothie");
        row57.put("steps",
                "• Take zucchini, acai powder, strawberries, beetroot, milk, and dates in a JTC blender and blend for 60 seconds.\n" +
                        "• Pour into a bowl.\n" +
                        "• Garnish with banana slices, granola, roasted coconut shaves, roasted almond slices, peanut butter, and sesame seeds."
        );
        row57.put("important_ingredients", "Acai Powder, Strawberries");
        row57.put("suggested_pairing", "Paneer Pesto Wrap");
        dataTable.add(row57);

    }
    public ArrayList<HashMap<String, String>> getDataTable() {
        return dataTable;
    }
}
