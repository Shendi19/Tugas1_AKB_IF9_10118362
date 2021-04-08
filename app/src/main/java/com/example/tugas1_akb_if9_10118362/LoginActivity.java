package com.example.tugas1_akb_if9_10118362;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    /* Tanggal pengerjaan : Kamis 8 April 2021
        NIM : 10118362
        NAMA : Shendi Rakhma Diansyah
        Kelas : IF-9*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void methodmasuk(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void methoddaftar(View view) {
        Intent i=new Intent(this,RegistrationActivity.class);
        startActivity(i);
    }
}