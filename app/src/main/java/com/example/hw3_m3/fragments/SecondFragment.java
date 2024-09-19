package com.example.hw3_m3.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hw3_m3.model.Car;
import com.example.hw3_m3.click.OnItemClick;
import com.example.hw3_m3.R;
import com.example.hw3_m3.databinding.FragmentSecondBinding;
import com.example.hw3_m3.model.CarDetailAdapter;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements OnItemClick {

    private FragmentSecondBinding binding;
    private Integer position;
    private ArrayList<Car> cars = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CarDetailAdapter adapter = new CarDetailAdapter(cars, this);
        assert getArguments() != null;
        position = Integer.valueOf(getArguments().getString("keyForPosition"));
        binding.rvCars2.setAdapter(adapter);
        positionCountry(position);
    }


    private void positionCountry(int position) {
        switch (position) {
            case 0:
                BMW();
                break;
            case 1:
                Mersedes();
                break;
            case 2:
                Audi();
                break;
        }
    }


    private void BMW(){
        cars.add(new Car("M5 Competition", "https://hips.hearstapps.com/hmg-prod/images/2025-bmw-m5-139-667b0f49f2fca.jpg?crop=0.752xw:0.846xh;0.0978xw,0.154xh&resize=768:*","the best car"));
        cars.add(new Car("M5 Competition", "https://hips.hearstapps.com/hmg-prod/images/2025-bmw-m5-139-667b0f49f2fca.jpg?crop=0.752xw:0.846xh;0.0978xw,0.154xh&resize=768:*","the best car"));
        cars.add(new Car("M5 Competition", "https://hips.hearstapps.com/hmg-prod/images/2025-bmw-m5-139-667b0f49f2fca.jpg?crop=0.752xw:0.846xh;0.0978xw,0.154xh&resize=768:*","the best car"));
    }

    private void Mersedes() {
        cars.add(new Car("CLS 63 AMG","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYWDidQEE5WceYRt0GvNCbzYMMqHvih97bEg&s","the best car"));
        cars.add(new Car("CLS 63 AMG","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYWDidQEE5WceYRt0GvNCbzYMMqHvih97bEg&s","the best car"));
        cars.add(new Car("CLS 63 AMG","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYWDidQEE5WceYRt0GvNCbzYMMqHvih97bEg&s","the best car"));
    }

    private void Audi() {
        cars.add(new Car("Audi e‑tron GT","https://hips.hearstapps.com/hmg-prod/images/2025-audi-e-tron-gt-102-66743d083580e.jpg?crop=0.527xw:0.594xh;0.168xw,0.226xh&resize=768:*","the best car"));
        cars.add(new Car("Audi e‑tron GT","https://hips.hearstapps.com/hmg-prod/images/2025-audi-e-tron-gt-102-66743d083580e.jpg?crop=0.527xw:0.594xh;0.168xw,0.226xh&resize=768:*","the best car"));
        cars.add(new Car("Audi e‑tron GT","https://hips.hearstapps.com/hmg-prod/images/2025-audi-e-tron-gt-102-66743d083580e.jpg?crop=0.527xw:0.594xh;0.168xw,0.226xh&resize=768:*","the best car"));
    }

    @Override
    public void click(int position) {
        Fragment myFragment = new SecondFragment();
        Bundle bundle = new Bundle();
        myFragment.setArguments(bundle);
        String massage = cars.get(position).getName();
        ThirdFragment thirdFragment = new ThirdFragment();
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, thirdFragment).addToBackStack(null).commit();
        Toast.makeText(requireContext(), massage, Toast.LENGTH_SHORT).show();
    }
}
