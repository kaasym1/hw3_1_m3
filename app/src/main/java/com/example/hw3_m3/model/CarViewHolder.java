package com.example.hw3_m3.model;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw3_m3.databinding.ItemCarBinding;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private ItemCarBinding binding;

    public CarViewHolder(ItemCarBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Car car) {
        binding.tvTitle.setText(car.getName());
        binding.tvDesc.setText(car.getDesc());
        Glide.with(binding.imgLogo).load(car.getLogo()).into(binding.imgLogo);
    }
}
