package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhysicUActivity extends AppCompatActivity {
    Button buttonU;
    TextView textView;
    EditText editTextM, editTextG, editTextH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physic_u);
        buttonU = findViewById(R.id.buttonU);
        editTextG = findViewById(R.id.editTextG3);
        editTextH = findViewById(R.id.editTextH3);
        editTextM = findViewById(R.id.editTextM3);
        textView = findViewById(R.id.textViewU);
        buttonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m, h, g;
                m = editTextM.getText().toString();
                h = editTextH.getText().toString();
                g = editTextG.getText().toString();
                int m1, h1, g1;
                m1 = Integer.parseInt(m);
                h1 = Integer.parseInt(h);
                g1 = Integer.parseInt(g);
                int total = g1 * h1 * m1;
                textView.setText("U=" + total);
            }
        });
    }
}