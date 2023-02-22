package com.example.foodorder.model

import androidx.annotation.DrawableRes

data class FoodItem(
    val id: Int,
    @DrawableRes val imageId: Int,
    val name: String,
    val description: String,
    val price: Float
)
