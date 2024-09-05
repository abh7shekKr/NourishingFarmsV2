package com.example.nourishingfarmsalpha;

import java.util.ArrayList;
import java.util.HashMap;

public class DataStorage {

    private final ArrayList<HashMap<String, String>> dataTable;

    public DataStorage() {
        dataTable = new ArrayList<>();

//      salad 1
        HashMap<String, String> row1 = new HashMap<>();
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
    }
    public ArrayList<HashMap<String, String>> getDataTable() {
        return dataTable;
    }
}
