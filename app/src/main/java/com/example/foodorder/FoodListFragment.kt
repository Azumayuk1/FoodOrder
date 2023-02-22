package com.example.foodorder

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorder.adapter.FoodListAdapter
import com.example.foodorder.data.DataSource
import com.example.foodorder.databinding.FragmentFoodListBinding


class FoodListFragment : Fragment() {

    private lateinit var binding: FragmentFoodListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Main", "Creating FoodListFragment")
        binding = FragmentFoodListBinding.inflate(inflater, container, false)

        val view = inflater.inflate(R.layout.fragment_food_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        val newDataset = DataSource.loadListOfFoodItemsSample()

        Log.d("Main", "Setting FoodList RecyclerView")
        recyclerView.adapter = FoodListAdapter(requireContext(), newDataset)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.setHasFixedSize(true)

        /*binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter =
            FoodListAdapter(requireContext(), newDataset)*/

        Log.d("Main", "Inflating FoodListFragment")
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_food_list, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}