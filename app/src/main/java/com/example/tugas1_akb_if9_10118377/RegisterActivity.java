package com.example.tugas1_akb_if9_10118377;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView loginText;
    Button registerButton;

    // Intent to Login
    private void toLogin() {
        Intent intentToLogin = new Intent(RegisterActivity.this, LoginActivity.class);

        startActivity(intentToLogin);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();

        // Initialize
        loginText = findViewById(R.id.loginText);
        registerButton = findViewById(R.id.registerButton);

        // Login Text Handler onClick
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
            }
        });

        // Button Handler onClick
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
            }
        });
    }
}