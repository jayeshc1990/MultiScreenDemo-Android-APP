package com.jayesh.multiscreendemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent(); //Get intent in Intent object
        String name = intent.getStringExtra(MainActivity.NAME_KEY); //Fetch string from Intent
        textView = findViewById(R.id.textView); //fetch textView in TextView object
        textView.setText("Your name is : "+ name); //Set text in TextView of activity2
    }
}