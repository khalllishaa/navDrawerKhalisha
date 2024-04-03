package com.example.navdrawerkhalishaa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(login.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
