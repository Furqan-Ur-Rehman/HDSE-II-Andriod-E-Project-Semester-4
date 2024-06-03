package com.example.insuranceplusappe_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button CheckInsurance;
    private Button BuyInsurance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckInsurance = findViewById(R.id.CheckInsurance);
        CheckInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to open the new activity
                Intent intent = new Intent(MainActivity.this, CheckInsurance.class);
                startActivity(intent);
            }
        });
        BuyInsurance = findViewById(R.id.BuyInsurance);
        BuyInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to open the new activity
                Intent intent = new Intent(MainActivity.this, BuyInsurance.class);
                startActivity(intent);
            }
        });
    }
}