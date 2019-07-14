package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhysicQ2Activity extends AppCompatActivity {
    Button buttonQ ;
    TextView textView;
    EditText editTextR , editTextI , editTextT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physic_q2);
        buttonQ = findViewById(R.id.buttonQ2Activity);
        textView = findViewById(R.id.textViewQ2);
        editTextI = findViewById(R.id.Q2i);
        editTextR = findViewById(R.id.Q2r);
        editTextT = findViewById(R.id.q2t);
        buttonQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i , r ,t;
                i = editTextI.getText().toString();
                r = editTextR.getText().toString();
                t = editTextT.getText().toString();
                int i1 , r1, t1;
                i1 = Integer.parseInt(i);
                r1 = Integer.parseInt(r);
                t1 = Integer.parseInt(t);
                int total = r1 *(i1 * i1)* t1;
                textView.setText("Q="+total);
            }
        });
    }
}
