package com.example.navdrawerkhalishaa.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawerkhalishaa.R;

public class minumanKhass extends Fragment {

    public minumanKhass() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_minuman_khass, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View kopiLelet = view.findViewById(R.id.kopiLelet);
        kopiLelet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), com.example.navdrawerkhalishaa.minumanKhas.kopiLelet.class);
                startActivity(intent);
            }
        });

        View sirupk = view.findViewById(R.id.sirup);
        sirupk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), com.example.navdrawerkhalishaa.minumanKhas.sirupk.class);
                startActivity(intent);
            }
        });

        View sodak = view.findViewById(R.id.soda);
        sodak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), com.example.navdrawerkhalishaa.minumanKhas.soda.class);
                startActivity(intent);
            }
        });

        View legen = view.findViewById(R.id.legen);
        legen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), com.example.navdrawerkhalishaa.minumanKhas.legen.class);
                startActivity(intent);
            }
        });


    }
}