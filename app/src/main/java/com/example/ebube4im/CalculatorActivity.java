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


    public void display(View v){
        
        String displayText = ((Button)v).getText().toString();
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(displayText);

    }
}