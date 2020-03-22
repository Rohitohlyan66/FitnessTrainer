package com.example.fitnesstrainer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class HomeActivity extends AppCompatActivity {
        CardView home_workout;
        CardView gym_workout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        home_workout=(CardView)findViewById(R.id.home_workout);
        gym_workout=(CardView)findViewById(R.id.gym_workout);

        

    }
}
