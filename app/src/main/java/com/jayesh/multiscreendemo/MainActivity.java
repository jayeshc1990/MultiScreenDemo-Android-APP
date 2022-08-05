package com.jayesh.multiscreendemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    //Declare NAME_KEY as final string, so we can access it from Activity2
    public static final String NAME_KEY = "com.jayesh.multiscreendemo.NAME_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void secondActivity(View view){
        editText = findViewById(R.id.personName); //Get name from textbox
        String NAME_VALUE = editText.getText().toString(); //Fetch String from EditText object
        Toast.makeText(this, "Going to new activity", Toast.LENGTH_SHORT).show(); //Toast that button is clicked
        Intent intent = new Intent(this,MainActivity2.class); //Create Intent object and pass target activity in args
        intent.putExtra(NAME_KEY,NAME_VALUE); //Send data in key, value pair to new activity
        startActivity(intent); //Start new activity
    }
}