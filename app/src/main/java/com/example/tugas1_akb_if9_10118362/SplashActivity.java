package com.example.tugas1_akb_if9_10118362;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class SplashActivity extends AppCompatActivity
 /* Tanggal pengerjaan : Kamis 8 April 2021
            NIM : 10118362
            NAMA : Shendi Rakhma Diansyah
            Kelas : IF-9*/
{
    private int waktu_loading=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
            Intent i=new Intent(SplashActivity.this,LoginActivity.class);
            startActivity(i);
            finish();

        }
    },waktu_loading);
}
}