package com.example.foodorder.data

import com.example.foodorder.model.FoodItem
import com.example.foodorder.R

object SampleData {
    val foodItems = listOf<FoodItem>(
        FoodItem(
            0,
            R.drawable.pic_burger,
            "Burger",
            "A ¼ lb* of flame-grilled beef patty topped with juicy tomatoes," +
                    " crisp lettuce, creamy mayonnaise, ketchup," +
                    " crunchy pickles, and sliced white onions" +
                    " on a toasted sesame seed bun.",
            4.5F
        ),
        FoodItem(
            1,
            R.drawable.pic_eclaire,
            "Eclaire",
            "Eclairs \"Iz Lavka\" are more than half of the cream." +
                    " This cream, like the eclair itself, is made on the basis of butter," +
                    " not margarine." +
                    " Vanilla eclairs are also topped with a dark chocolate coating.",
            1.2F
        ),
        FoodItem(
            2,
            R.drawable.pic_croissant,
            "Croissant",
            "Croissants are so airy because they" +
                    " are baked according to a French recipe:" +
                    " a lot of butter is put in the dough." +
                    " They stay fresh for 2 days - better not delay.",
            1F
        ),
        FoodItem(
            3,
            R.drawable.pic_belgianwaffle,
            "Belgian Waffle",
            "These waffles are handmade according" +
                    " to a traditional Belgian recipe." +
                    " They are thick and wide.",
            1F
        ),
        FoodItem(
            4,
            R.drawable.pic_fettucini,
            "Fettuccine",
            "The pasta recipe for this dish was brought straight from Rimini:" +
                    " fettuccine is made from Italian durum wheat flour," +
                    " chicken eggs and olive oil." +
                    " And then mixed with a sauce based on parmesan," +
                    " butter and olive oil," +
                    " dry white wine and decorated with fresh truffles.",
            4F
        ),
        FoodItem(
            5,
            R.drawable.pic_filadelphiasalad,
            "Philadelphia Salad",
            "For this salad," +
                    " use the recipe of the roll of the same name." +
                    " The salad is decorated with" +
                    " nori seaweed and sesame seeds.",
            2F
        ),
        FoodItem(
            6,
            R.drawable.pic_farfalle,
            "Duck Farfalle",
            "Italy meets Asia: duck fillet in a creamy" +
                    " tomato sauce with pineapple and pepper" +
                    " was added to farfalle pasta bows.",
            2.1F
        )
    )
}