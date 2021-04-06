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
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView registerText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        // Initialize
        registerText = findViewById(R.id.registerText);
        loginButton = findViewById(R.id.loginButton);

        // Register Text Handler onClick
        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToRegister = new Intent(LoginActivity.this, RegisterActivity.class);

                startActivity(intentToRegister);
            }
        });

        // Login Button Handler onClick
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToMain = new Intent(LoginActivity.this, MainActivity.class);

                startActivity(intentToMain);
                finish();
            }
        });
    }
}