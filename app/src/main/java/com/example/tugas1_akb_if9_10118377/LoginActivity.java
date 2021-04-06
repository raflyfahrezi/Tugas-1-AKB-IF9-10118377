package com.example.tugas1_akb_if9_10118377;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView registerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        // Initialize
        registerText = findViewById(R.id.registerText);

        // Register Text Handler onClick
        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToRegister = new Intent(LoginActivity.this, RegisterActivity.class);

                startActivity(intentToRegister);
            }
        });
    }
}