package com.example.foodorder.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorder.R
import com.example.foodorder.data.DataSource
import com.example.foodorder.model.FoodItem
import java.text.NumberFormat
import java.util.*

class FoodListAdapter(private val context: Context, private val dataset: List<FoodItem>) :
    RecyclerView.Adapter<FoodListAdapter.FoodItemViewHolder>() {
    private val foodList = DataSource.loadListOfFoodItemsSample()

    class FoodItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val foodPicture: ImageView = view.findViewById(R.id.food_picture)
        val foodName: TextView = view.findViewById(R.id.food_name)
        val foodPrice: TextView = view.findViewById(R.id.food_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.food_list_item_card, parent, false)

        Log.d("FoodListAdapter", "new viewHolderCreated")
        return FoodItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.foodPicture.setImageResource(item.imageId)
        holder.foodName.text = item.name
        holder.foodPrice.text = NumberFormat
                .getCurrencyInstance().format(item.price)

        Log.d("FoodListAdapter", "new viewHolder binded (name: ${holder.foodName.text})")
    }
}