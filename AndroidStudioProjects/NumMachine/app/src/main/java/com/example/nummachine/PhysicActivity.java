package com.example.nummachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhysicActivity extends AppCompatActivity {
    Button buttonForceActivity , buttonVelocityActivity , buttonQActivity
            , buttonGravityActivity , buttonQ2Activity , buttonUActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physic);
        buttonForceActivity = findViewById(R.id.buttonForceActivity);
        buttonQActivity = findViewById(R.id.buttonQActivity);
        buttonUActivity = findViewById(R.id.buttonUActivity);
        buttonVelocityActivity = findViewById(R.id.buttonVelocityActivity);
        buttonGravityActivity = findViewById(R.id.buttonGravityActivity);
        buttonQ2Activity = findViewById(R.id.buttonQ2Activity);
        buttonVelocityActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PhysicActivity.this , PhysicVelocityActivity.class));
            }
        });
        buttonForceActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PhysicActivity.this , PhysicForceActivity.class));
            }
        });
        buttonQActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PhysicActivity.this , PhysicQActivity.class));
            }
        });
        buttonGravityActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PhysicActivity.this , PhysicGActivity.class));
            }
        });
        buttonQ2Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PhysicActivity.this , PhysicQ2Activity.class));
            }
        });
        buttonUActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PhysicActivity.this , PhysicUActivity.class));
            }
        });
    }
}
