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
import com.example.navdrawerkhalishaa.makananKhas.serepeh;

public class makananFav extends Fragment {

    public makananFav() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_makanan_fav, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View karerajungan = view.findViewById(R.id.karerajungan);
        karerajungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), com.example.navdrawerkhalishaa.maknumfav.rajungan.class);
                startActivity(intent);
            }
        });

        View mieayam = view.findViewById(R.id.mieayam);
        mieayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), com.example.navdrawerkhalishaa.maknumfav.mieayam.class);
                startActivity(intent);
            }
        });

        View hatiikanp = view.findViewById(R.id.hatiikanpari);
        hatiikanp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), com.example.navdrawerkhalishaa.maknumfav.hatiIkanPari.class);
                startActivity(intent);
            }
        });

        View ayamgc = view.findViewById(R.id.ayamgorengcrispy);
        ayamgc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), com.example.navdrawerkhalishaa.maknumfav.ayamCrispy.class);
                startActivity(intent);
            }
        });

        View lecitea = view.findViewById(R.id.lecitea);
        lecitea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), com.example.navdrawerkhalishaa.maknumfav.leciTea.class);
                startActivity(intent);
            }
        });
    }
}