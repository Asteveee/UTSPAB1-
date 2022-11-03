package com.example.uts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Nama;
    EditText NomorPendaftaran;
    Spinner Pilihan;
    CheckBox Cetakkan;
    Button Klik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = findViewById(R.id.et_nama_lengkap);
        NomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        Pilihan = findViewById(R.id.sp_pilihan_pendaftaran);
        Cetakkan = findViewById(R.id.cb_konfirmasi);
        Klik = findViewById(R.id.btn_tombol);

        Klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String NamaLengkap = Nama.getText().toString();
                String NomorOrang = NomorPendaftaran.getText().toString();
                String cetak = Cetakkan.getText().toString();
                String spiner = String.valueOf(Pilihan.getSelectedItem());

                if (NamaLengkap.trim().equals("")) {
                    Nama.setError("Nama Tidak Boleh Kosong");
                }
                else if (NomorOrang.trim().equals("")) {
                    NomorPendaftaran.setError("Nomor Pendaftaran Tidak Boleh Kosong");
                }
                else if (!Cetakkan.isChecked()){
                    Toast.makeText(MainActivity.this, "Centang dulu!!!", Toast.LENGTH_SHORT).show();
                }
                else if (spiner.equalsIgnoreCase("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Pilih Dulu boss", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent pindah = new Intent(MainActivity.this,SecondActivity.class);
                    pindah.putExtra("Knama",NamaLengkap);
                    pindah.putExtra("Knomor",NomorOrang);
                    pindah.putExtra("Kkonfirmasi", cetak);
                    pindah.putExtra("Kpendaftaran", spiner);
                    startActivity(pindah);

                }
            }
        });
    }
}