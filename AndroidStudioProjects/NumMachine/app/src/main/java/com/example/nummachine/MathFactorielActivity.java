package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MathFactorielActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_factoriel);
        button = findViewById(R.id.buttonStartFacktoriel);
        textView = findViewById(R.id.textViewFactoriel);
        editText = findViewById(R.id.EditTextFactoriel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num;
                num = editText.getText().toString();
                int num1 = Integer.parseInt(num);
                long total = 1;
                for (int i = 1 ; i <= num1 ; i++){
                    total *= i;
                }
                textView.setText(total + "");
            }
        });
    }
}
