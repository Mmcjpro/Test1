package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhysicForceActivity extends AppCompatActivity {
    EditText editTextM , editTextA;
    Button button;
    TextView textViewOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physic_force);
        editTextA = findViewById(R.id.editTextA);
        editTextM = findViewById(R.id.editTextM);
        button = findViewById(R.id.buttonStartForce);
        textViewOutput = findViewById(R.id.textViewForceOutput);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m , a;
                m = editTextM.getText().toString();
                a = editTextA.getText().toString();
                int m1 , a1;
                m1 = Integer.parseInt(m);
                a1 = Integer.parseInt(a);
                int total = m1*a1;
                textViewOutput.setText("F="+ total +"");
            }
        });
    }
}
