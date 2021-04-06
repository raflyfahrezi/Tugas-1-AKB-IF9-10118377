// 06 April 2021
// 10118377
// Farhan Rafly Fahrezi Saepulloh
// IF 9

package com.example.tugas1_akb_if9_10118377;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button logOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        // Initialize
        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToLogin = new Intent(MainActivity.this, LoginActivity.class);

                startActivity(intentToLogin);
                finish();
            }
        });
    }
}