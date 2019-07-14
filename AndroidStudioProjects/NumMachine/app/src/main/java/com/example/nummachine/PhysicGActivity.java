package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhysicGActivity extends AppCompatActivity {
    Button buttonG;
    EditText editTextM1 , editTextM2 , editTextR;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physic_g);
        buttonG = findViewById(R.id.buttonGStart);
        editTextM1 = findViewById(R.id.GM1);
        editTextM2 = findViewById(R.id.GM2);
        editTextR = findViewById(R.id.GR);
        textView = findViewById(R.id.textViewGActivity);
        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m1 ,m2 , r;
                m1 = editTextM1.getText().toString();
                m2 = editTextM2.getText().toString();
                r = editTextR.getText().toString();
                int m11 , m12 , r1;
                m11 = Integer.parseInt(m1);
                m12 = Integer.parseInt(m2);
                r1 = Integer.parseInt(r);
                double g = 6.67 * (Math.pow(10,-11));
                double total = g * ((m11 * m12)/(Math.pow(r1 , 2)));
                double tota2 = ((m11 * m12)/(Math.pow(r1 , 2)));
                textView.setText("F="+ total + "\n"+ "f="+tota2);
            }
        });
    }
}
