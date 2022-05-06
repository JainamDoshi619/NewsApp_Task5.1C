package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.constraintLayout2);
    }
    public void onClick(View v){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFrameLayout, new StoriesFragment()).commit();
        layout.setVisibility(View.GONE);
    }
}