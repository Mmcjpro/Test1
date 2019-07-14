package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MathPrimeActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_prime);
        button = findViewById(R.id.buttonStartPrime);
        textView = findViewById(R.id.textViewPrime);
        editText = findViewById(R.id.EditTextPrime);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String num;
                    num = editText.getText().toString();
                    long num1;
                    boolean loop = true;
                    num1 = Integer.parseInt(num);
                    for (int i = 2 ; i < num1 && loop; i++){
                        if (num1 % i == 0){
                            textView.setText(num1 + "= Not Prime Number");
                            loop = false;
                        }
                        else if(num1 % i != 0){
                            textView.setText(num1 + " = Prime Number");
                        }
                    }
                }
            });

    }
}
