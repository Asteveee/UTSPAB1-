package com.example.uts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvnama;
    TextView tvNomor;
    TextView tvpendaftaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvnama = findViewById(R.id.tv_pertama);
        Intent terima = getIntent();
        String terimanama = terima.getStringExtra("Knama");
        tvnama.setText(terimanama);

        tvNomor = findViewById(R.id.tv_kedua);
        Intent baru = getIntent();
        String terimaNomor = baru.getStringExtra("Knomor");
        tvNomor.setText(terimaNomor);

        tvpendaftaran = findViewById(R.id.tv_ketiga);
        Intent lagi = getIntent();
        String terimaKode = lagi.getStringExtra("Kpendaftaran");
        tvpendaftaran.setText(terimaKode);
    }
}