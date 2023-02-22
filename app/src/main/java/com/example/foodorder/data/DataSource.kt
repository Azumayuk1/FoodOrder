package com.example.foodorder.data

import com.example.foodorder.model.FoodItem

class DataSource {
    fun loadListOfFoodItems(): List<FoodItem> {
        val foodList = mutableListOf<FoodItem>()
        return foodList.toList()
    }

    companion object {
        fun loadListOfFoodItemsSample(): List<FoodItem> {
            return SampleData.foodItems
        }
    }

}