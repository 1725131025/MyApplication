package com.example.asus.myapplication;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;


public class Activity_third extends AppCompatActivity {
    int[] images = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};
    int SIGN = 20;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        final ImageView image = findViewById(R.id.image);
        final Handler handler = new Handler(){

            public void handleMessage(Message msg){
                super.handleMessage(msg);
                if(msg.what == SIGN){
                    image.setImageResource(images[num++]);
                    if(num >= images.length){
                        num = 0;
                    }
                }
            }
        };
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Message msg = new Message();
                msg.what = SIGN;
                handler.sendMessage(msg);
            }
        }, 800, 500);
    }
}
