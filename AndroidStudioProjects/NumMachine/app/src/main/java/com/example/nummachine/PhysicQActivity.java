package com.example.nummachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhysicQActivity extends AppCompatActivity {
    Button button;
    EditText editTextM , editTextC , editTextt1 ,editTextt2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physic_q);
        button = findViewById(R.id.buttonStartQ);
        editTextC = findViewById(R.id.editTextC);
        editTextM = findViewById(R.id.editTextM2);
        editTextt1 = findViewById(R.id.teta1);
        editTextt2 = findViewById(R.id.teta2);
        textView = findViewById(R.id.textViewQ);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c , m , t1 ,t2;
                c = editTextC.getText().toString();
                m = editTextM.getText().toString();
                t1 = editTextt1.getText().toString();
                t2 = editTextt2.getText().toString();
                int c1 , m1 , t11 , t12;
                c1 = Integer.parseInt(c);
                m1 = Integer.parseInt(m);
                t11 = Integer.parseInt(t1);
                t12 = Integer.parseInt(t2);
                int total = c1 * m1 *(t12 - t11);
                textView.setText("Q = " + total + "");
            }
        });
    }
}
