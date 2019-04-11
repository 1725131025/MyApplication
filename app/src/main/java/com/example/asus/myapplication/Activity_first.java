package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Button;

public class Activity_first extends AppCompatActivity {
Button bn6,bn7,bn8,bn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        bn6 = findViewById(R.id.bn6);
        bn7 = findViewById(R.id.bn7);
        bn8 = findViewById(R.id.bn8);
        bn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linearLayout1 = findViewById(R.id.linear);
                linearLayout1.setOrientation(LinearLayout.HORIZONTAL);
            }
        });
        bn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linearLayout2 = findViewById(R.id.linear);
                linearLayout2.setOrientation(LinearLayout.VERTICAL);
            }
        });
        bn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linearLayout3 = findViewById(R.id.linear);
                linearLayout3.setOrientation(LinearLayout.HORIZONTAL);
                linearLayout3.setGravity(Gravity.LEFT);
            }
        });


    }
}
