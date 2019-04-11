package com.example.asus.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn1 = (Button) findViewById(R.id.bn1);
        Button bn2 = (Button) findViewById(R.id.bn2);
        Button bn3 = (Button) findViewById(R.id.bn3);
        Button bn4 = (Button) findViewById(R.id.bn4);
        Button bn5 = (Button) findViewById(R.id.bn5);
        bn1.setOnClickListener((View.OnClickListener) this);
        bn2.setOnClickListener((View.OnClickListener) this);
        bn3.setOnClickListener((View.OnClickListener) this);
        bn4.setOnClickListener((View.OnClickListener) this);
        bn5.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.bn1:
                intent.setClass(this, Activity_first.class);
                startActivity(intent);
                break;
            case R.id.bn2:
                intent.setClass(this, Activity_second.class);
                startActivity(intent);
                break;
            case R.id.bn3:
                intent.setClass(this, Activity_third.class);
                startActivity(intent);
                break;
            case R.id.bn4:
                intent.setClass(this, Activity_forth.class);
                startActivity(intent);
                break;
            case R.id.bn5:
                intent.setClass(this, Activity_fifth.class);
                startActivity(intent);
                break;

        }
    }
}






