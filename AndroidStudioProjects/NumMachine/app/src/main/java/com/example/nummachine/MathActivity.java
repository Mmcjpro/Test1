package com.example.nummachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MathActivity extends AppCompatActivity {
    Button buttonPrime , buttonImpost , buttonXy , buttonFactoriel , buttonSS , buttonAbc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        buttonImpost = findViewById(R.id.buttonImpost);
        buttonPrime = findViewById(R.id.buttonPrime);
        buttonXy = findViewById(R.id.buttonXy);
        buttonAbc = findViewById(R.id.buttonABCStart);
        buttonSS = findViewById(R.id.buttonSSStart);
        buttonFactoriel = findViewById(R.id.buttonFactoriel);
        buttonImpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathActivity.this , MathImpostActivity.class));
            }
        });
        buttonFactoriel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathActivity.this , MathFactorielActivity.class));
            }
        });
        buttonPrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathActivity.this , MathPrimeActivity.class));
            }
        });
        buttonXy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathActivity.this , MathXyActivity.class));
            }
        });
        buttonSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathActivity.this , MathScientificSymbol.class));
            }
        });
        buttonAbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathActivity.this , MathABCActivity.class));
            }
        });
    }
}
