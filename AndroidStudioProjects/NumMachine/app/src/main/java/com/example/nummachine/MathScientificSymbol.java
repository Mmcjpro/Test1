package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MathScientificSymbol extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button buttonSS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_scientific_symbol);
        buttonSS = findViewById(R.id.buttonSS);
        editText = findViewById(R.id.editTextSS);
        textView = findViewById(R.id.textViewSS);
        buttonSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = editText.getText().toString();
                double num1 = Double.parseDouble(num);
                boolean a =true;
                boolean b = true;
                /*if (num1 < 0){
                    a = false;
                }else{
                    b = false;
                }*/
                int step = 0;
                for (int i = 10 ; i < num1 && num1 > 0;){
                    if ( num1 <= 10 && num1 >=0)
                        break;
                    num1 = num1 / i;
                    step++;
                }
                for (int i = 10 ; i > num1 && num1 <= 0; i = i + 10){
                    if ( num1 <= 10 && num1 >=0)
                        break;
                    num1 += num1 * i;
                    step++;
                }
                textView.setText(num1 + "x 10 ^" + step);
            }
        });
    }
}
