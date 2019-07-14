package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MathABCActivity extends AppCompatActivity {
    Button buttonAbc;
    EditText editText1 , editText2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_abc);
        buttonAbc = findViewById(R.id.buttonAbc);
        editText1 = findViewById(R.id.eidtTextaABC);
        editText2 = findViewById(R.id.eidtTextbABC);
        textView = findViewById(R.id.textViewAbc);
        buttonAbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 , n2;
                n1 = editText1.getText().toString();
                n2 = editText2.getText().toString();
                int e1 , e2;
                e1 = Integer.parseInt(n1);
                e2 = Integer.parseInt(n2);
                double total = Math.pow(e1 , 2) + Math.pow(e2 , 2);
                double total2 = Math.sqrt(total);
                textView.setText("C ="+ total2);
            }
        });
    }
}
