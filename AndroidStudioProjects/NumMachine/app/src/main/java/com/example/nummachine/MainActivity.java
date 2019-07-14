package com.example.nummachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button mathButton , physicButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mathButton = findViewById(R.id.buttonMath);
        physicButton = findViewById(R.id.buttonPhysic);
        Toast.makeText(MainActivity.this , "Welcome" , Toast.LENGTH_SHORT).show();
        mathButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , MathActivity.class));
            }
        });
        physicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , PhysicActivity.class));
            }
        });
    }
}
