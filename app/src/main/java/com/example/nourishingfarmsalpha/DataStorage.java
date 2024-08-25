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
        row1.put("ingredients", "Spicy Checkpeas, Beetroot, Pomegranate, Spicy Walnut");
        row1.put("category", "salad");
        row1.put("image", "https://peasandcrayons.com/wp-content/uploads/2017/02/healthy-tomato-avocado-cucumber-salad-recipe-peasandcrayons-4716.jpg");
        dataTable.add(row1);

        HashMap<String, String> row2 = new HashMap<>();
        row2.put("id", "2");
        row2.put("title", "Crunchy Thai Salad");
        row2.put("ingredients", "Carrot, Spring Onion, Peanut");
        row2.put("category", "salad");
        row2.put("image", "https://www.tasteofhome.com/wp-content/uploads/2018/01/Simple-Italian-Salad_EXPS_FT20_25957_F_0624_1.jpg");
        dataTable.add(row2);

        HashMap<String, String> row3 = new HashMap<>();
        row3.put("id", "3");
        row3.put("title", "Wild Rice & Celery Salad");
        row3.put("ingredients", "Apple, Black Rice, Celery, Cranberry, Walnut, Sunflower Seeds");
        row3.put("category", "salad");
        row3.put("image", "https://cdn.loveandlemons.com/wp-content/uploads/2021/04/green-salad-recipes.jpg");
        dataTable.add(row3);

        HashMap<String, String> row4 = new HashMap<>();
        row4.put("id", "4");
        row4.put("title", "Super Quinoa Salad");
        row4.put("ingredients", "Chickpeas, Quinoa, Cranberry");
        row4.put("category", "salad");
        row4.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row4);

        HashMap<String, String> row5 = new HashMap<>();
        row5.put("id", "5");
        row5.put("title", "Classic Italian Salad");
        row5.put("ingredients", "Olives, Croutons, Cheese(Parmesan)");
        row5.put("category", "salad");
        row5.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row5);

        HashMap<String, String> row6 = new HashMap<>();
        row6.put("id", "6");
        row6.put("title", "Pasta Salad");
        row6.put("ingredients", "Pasta, Black Olives, Parmesan, Almonds, Croutons");
        row6.put("category", "salad");
        row6.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row6);

        HashMap<String, String> row7 = new HashMap<>();
        row7.put("id", "7");
        row7.put("title", "Southwest Salad");
        row7.put("ingredients", "Rajma, Corn, Cheddar Cheese");
        row7.put("category", "salad");
        row7.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row7);

        HashMap<String, String> row8 = new HashMap<>();
        row8.put("id", "8");
        row8.put("title", "Mediterranean Couscous");
        row8.put("ingredients", "Chickpeas, Couscous, Olives, Feta");
        row8.put("category", "salad");
        row8.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row8);

        HashMap<String, String> row9 = new HashMap<>();
        row9.put("id", "9");
        row9.put("title", "Greek Salad");
        row9.put("ingredients", "Cucumber, Black Olives, Mix Herbs, Feta Cheese");
        row9.put("category", "salad");
        row9.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row9);

        HashMap<String, String> row10 = new HashMap<>();
        row10.put("id", "10");
        row10.put("title", "Lentil Taco Salad");
        row10.put("ingredients", "Masoor, Pica de galo, Corn, Walnut, Sunflower Seeds, Nachos");
        row10.put("category", "salad");
        row10.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row10);

        HashMap<String, String> row11 = new HashMap<>();
        row11.put("id", "11");
        row11.put("title", "Umami Korean Salad");
        row11.put("ingredients", "Carrot Pickling, Raddish Pickling, Sesame Seeds");
        row11.put("category", "salad");
        row11.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row11);

        HashMap<String, String> row12 = new HashMap<>();
        row12.put("id", "12");
        row12.put("title", "Hearty Fruit Salad");
        row12.put("ingredients", "Apple, Pear, Pomegranate, Walnut, Feta");
        row12.put("category", "salad");
        row12.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row12);

        HashMap<String, String> row13 = new HashMap<>();
        row13.put("id", "13");
        row13.put("title", "Rainbow Salad");
        row13.put("ingredients", "Pomegranate, Sunflower Seeds, Cheese Packet, Cherry Tomato");
        row13.put("category", "salad");
        row13.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row13);

        HashMap<String, String> row14 = new HashMap<>();
        row14.put("id", "14");
        row14.put("title", "Roasted Vegetable Salad");
        row14.put("ingredients", "Roasted Vegetables, Cherry Tomato, Coriander");
        row14.put("category", "salad");
        row14.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row14);

        HashMap<String, String> row15 = new HashMap<>();
        row15.put("id", "15");
        row15.put("title", "Beetroot And Carrot Salad");
        row15.put("ingredients", "Beetroot(Batonnet), Carrot(Batonnet), Fresh Mozzarella");
        row15.put("category", "salad");
        row15.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row15);

        HashMap<String, String> row16 = new HashMap<>();
        row16.put("id", "16");
        row16.put("title", "Arabian Fattoush Salad");
        row16.put("ingredients", "Fattoush, Broken Wheat, Paprika Powder, Olive");
        row16.put("category", "salad");
        row16.put("image", "https://www.twopeasandtheirpod.com/wp-content/uploads/2020/07/Summer-Quinoa-Salad-8.jpg");
        dataTable.add(row16);

        //juices
        HashMap<String, String> row17 = new HashMap<>();
        row17.put("id", "17");
        row17.put("title", "Tropical Paradise");
        row17.put("ingredients", "Coconut water");
        row17.put("category", "juice");
        row17.put("image", "https://i.pinimg.com/originals/6f/ef/b0/6fefb09a20131d960e769b5ea2cbadb5.jpg");
        dataTable.add(row17);

    }

    public ArrayList<HashMap<String, String>> getDataTable() {
        return dataTable;
    }
}
