package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button three;
    private Button five;
    private Button seven;
    private Button nine;
    private Button add;
    private Button div;
    private Button equal;
    private Button clear;
    private TextView info;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");

            }
        });
    }


    private void setupUIViews() {
        one = (Button) findViewById(R.id.btn1);
        three = (Button) findViewById(R.id.btn3);
        five = (Button) findViewById(R.id.btn5);
        seven = (Button) findViewById(R.id.btn7);
        nine = (Button) findViewById(R.id.btn9);
        add = (Button) findViewById(R.id.btnequal);
        div = (Button) findViewById(R.id.btnDiv);
        info = (TextView) findViewById(R.id.btnPlus);
        result = (TextView) findViewById(R.id.btnClear);
    }
}
