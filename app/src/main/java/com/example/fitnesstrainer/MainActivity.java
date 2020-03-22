package com.example.fitnesstrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

        Animation image_anim,text_anim;
        ImageView imageView;
        TextView textView;
        Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        imageView=(ImageView)findViewById(R.id.splash_logo);
        textView=(TextView)findViewById(R.id.splash_text);
        image_anim= AnimationUtils.loadAnimation(this,R.anim.image_anim);
        text_anim= AnimationUtils.loadAnimation(this,R.anim.text_anim);

        image_anim.setDuration(1500);
        text_anim.setDuration(1500);

        imageView.setAnimation(image_anim);
        textView.setAnimation(text_anim);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}
