package com.example.hw3_m3.model;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw3_m3.click.OnItemClick;
import com.example.hw3_m3.databinding.ItemCarBinding;

import java.util.ArrayList;

public class CarDetailAdapter extends RecyclerView.Adapter<DetailViewHolder> {
    public ArrayList<Car> carsList;
    private OnItemClick onItemClick;

    public CarDetailAdapter(ArrayList<Car> carsList, OnItemClick onItemClick) {
        this.carsList = carsList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DetailViewHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, int position) {
        holder.onBind(carsList.get(position));
        holder.itemView.setOnClickListener(v -> {
            onItemClick.click(position);
        });
    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }
}

class DetailViewHolder extends RecyclerView.ViewHolder {
    public ItemCarBinding binding;

    public DetailViewHolder(@NonNull ItemCarBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Car car) {
        binding.tvTitle.setText(car.getName());
        Glide.with(binding.imgLogo).load(car.getLogo()).into(binding.imgLogo);
    }
}

