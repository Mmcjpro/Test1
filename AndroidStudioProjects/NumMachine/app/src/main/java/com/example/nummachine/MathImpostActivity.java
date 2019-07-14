package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MathImpostActivity extends AppCompatActivity {
    EditText editTextYourNumber , editText3 , editText4 , editText6 , editText7 , editText1 ;
    Button button;
    TextView textViewOutput , textView1 , textView2;
    //editText4,7 %
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_impost);
        editTextYourNumber = findViewById(R.id.editTextImpostYourNumber);
        editText1 = findViewById(R.id.editTextImpost1);
        editText3 = findViewById(R.id.editTextImpost3);
        editText4 = findViewById(R.id.editTextImpost4);
        editText6 = findViewById(R.id.editTextImpost6);
        editText7 = findViewById(R.id.editTextImpost7);
        button = findViewById(R.id.buttonStartImpost);
        textViewOutput = findViewById(R.id.textViewImpostOutput);
        textView1 = findViewById(R.id.textViewNmberOneImpost);
        textView2 = findViewById(R.id.textViewNmberTwoImpost);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 ,s2;
                s1 = editText1.getText().toString();
                textView1.setText(s1);
                s2 = editText3.getText().toString();
                textView2.setText(s2);
                String e1 , e3 , e4 , ei , e6 ,e7;
                long et1 , et3 , et4 , eti , et6 ,et7;
                ei = editTextYourNumber.getText().toString();
                e1 = editText1.getText().toString();
                e3 = editText3.getText().toString();
                e4 = editText4.getText().toString();
                e6 = editText6.getText().toString();
                e7 = editText7.getText().toString();
                //editText4,7 %
                eti = Integer.parseInt(ei);
                et1 = Integer.parseInt(e1);
                et3 = Integer.parseInt(e3);
                et4 = Integer.parseInt(e4);
                et6 = Integer.parseInt(e6);
                et7 = Integer.parseInt(e7);
                long total1 ,total2;
                if(eti >= et6){
                    total1 = ((eti - et6)* et7 / 100)+((et6-et3)* et4 / 100);
                    textViewOutput.setText(total1 + "");
                }else if (eti < et6 && eti >=et3){
                    total2 = ((eti - et3)* et4 / 100);
                    textViewOutput.setText(total2 + "");
                }else if (eti < et1){
                    textViewOutput.setText("0");
                }
            }
        });
    }
}
