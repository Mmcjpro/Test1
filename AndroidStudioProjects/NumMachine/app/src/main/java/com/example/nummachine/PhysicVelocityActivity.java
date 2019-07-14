package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhysicVelocityActivity extends AppCompatActivity {
    Button buttonStart ;
    TextView textViewOutput ;
    EditText editTextX , editTextT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physic_velocity);
        buttonStart = findViewById(R.id.buttonStartVelocity);
        textViewOutput = findViewById(R.id.textViewVelocityOutput);
        editTextT = findViewById(R.id.editTextT);
        editTextX = findViewById(R.id.editTextX);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x , t;
                x = editTextX.getText().toString();
                t = editTextT.getText().toString();
                int x1  , t1;
                x1 = Integer.parseInt(x);
                t1 = Integer.parseInt(t);
                int total = x1 / t1;
                textViewOutput.setText("V=" + total);
            }
        });
    }
}
