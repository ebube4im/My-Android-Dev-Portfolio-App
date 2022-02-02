package com.example.ebube4im;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }


    // Next is to create a method that will validate the imputs that have been entered;
    // What else can we say is the reason for this season?


    public void display(View v){
        
        String displayText = ((Button)v).getText().toString();
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(displayText);

    }
}