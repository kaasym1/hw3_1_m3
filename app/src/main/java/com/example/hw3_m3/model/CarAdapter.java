package com.example.hw3_m3.model;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_m3.click.OnItemClick;
import com.example.hw3_m3.databinding.ItemCarBinding;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private ArrayList<Car> cars;
    private OnItemClick onItemClick;

    public CarAdapter(ArrayList<Car> cars, OnItemClick onItemClick) {
        this.cars = cars;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bind(cars.get(position));
        holder.itemView.setOnClickListener(v -> {
            onItemClick.click(position);
        });
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
