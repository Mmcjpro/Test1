package com.example.nummachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MathXyActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_xy);
        button = findViewById(R.id.buttonSin);
        editText = findViewById(R.id.editTextSin);
        textView = findViewById(R.id.textViewSin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num ;
                num = editText.getText().toString();
                int num1;
                num1 = Integer.parseInt(num);
                if (num1 <= 180 && num1 >= 0){
                    Double sin , cos;
                    sin = Math.sin(Math.toRadians(num1));
                    cos = Math.cos(Math.toRadians(num1));
                    textView.setText("Sin = " + sin + "\n" +"Cos = " + cos);
                }else{
                    Toast.makeText(MathXyActivity.this , "Erorr" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
