// 06 April 2021
// 10118377
// Farhan Rafly Fahrezi Saepulloh
// IF 9

package com.example.tugas1_akb_if9_10118377;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);

                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}