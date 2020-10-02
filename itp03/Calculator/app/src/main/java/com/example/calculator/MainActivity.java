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
    private final char ADDITION = '+';
    private final char DIVISION = '/';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;


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

        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + '+');
                info.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + '/');
                info.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + '=' + String.valueOf(val1));
                // 5 + 4 = 9
                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(info.getText().length() > 0) {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length() -1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }

            }
        });


    }


    private void setupUIViews() {
        one = (Button) findViewById(R.id.btn1);
        three = (Button) findViewById(R.id.btn3);
        five = (Button) findViewById(R.id.btn5);
        seven = (Button) findViewById(R.id.btn7);
        nine = (Button) findViewById(R.id.btn9);
        add = (Button) findViewById(R.id.btnPlus);
        div = (Button) findViewById(R.id.btnDiv);
        equal = (Button) findViewById(R.id.btnequal);
        info = (TextView) findViewById(R.id.tvControl);
        result = (TextView) findViewById(R.id.tvDisplay);
        clear = (Button) findViewById(R.id.btnClear);
    }
    private void compute() {
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(info.getText().toString());

            switch(ACTION) {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQU:
                    break;
            }
        }
        else{
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}
