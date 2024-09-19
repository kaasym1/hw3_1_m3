package com.example.hw3_m3.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw3_m3.model.Car;
import com.example.hw3_m3.databinding.FragmentThirdBinding;

import java.util.ArrayList;


public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;
    private ArrayList<Car> cars = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            String myString = getArguments().getString("key_string");
            int myInt = getArguments().getInt("key_int");
        }
    }
}