package com.example.trafficcontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class limit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limit);
        getSupportActionBar().setTitle("লিমিট");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
