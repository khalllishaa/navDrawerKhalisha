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
import com.example.navdrawerkhalishaa.makananKhas.merica;
import com.example.navdrawerkhalishaa.makananKhas.lontongTuyuhan;
import com.example.navdrawerkhalishaa.makananKhas.dumbeg;
import com.example.navdrawerkhalishaa.makananKhas.kaoya;


public class makananKhass extends Fragment {

    public makananKhass() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_makanan_khass, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View serepeh = view.findViewById(R.id.serepeh);
        serepeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), serepeh.class);
                startActivity(intent);
            }
        });

        View merica = view.findViewById(R.id.merica);
        merica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), merica.class);
                startActivity(intent);
            }
        });

        View lontong = view.findViewById(R.id.lontuy);
        lontong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), lontongTuyuhan.class);
                startActivity(intent);
            }
        });

        View dumbeg = view.findViewById(R.id.dumbeg);
        dumbeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), dumbeg.class);
                startActivity(intent);
            }
        });

        View kaoya = view.findViewById(R.id.kaoya);
        kaoya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kaoya.class);
                startActivity(intent);
            }
        });
    }
}