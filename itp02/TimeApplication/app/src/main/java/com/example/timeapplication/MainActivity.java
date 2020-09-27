package com.example.timeapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Object textView1 = findViewById(R.id.textView);

        Calendar calendar = Calendar.getInstance();

        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String dateTime = simpleDateFormat.format(calendar.getTime());
        textView.setText(dateTime);

        int current_hours = calendar.get(Calendar.HOUR_OF_DAY);
        int current_minute = calendar.get(Calendar.MINUTE);

        if ((current_hours == 5 && current_minute >= 45)) {
            textView.setText("Good Morning");
        } else if (current_hours >= 6 && current_hours < 12) {
            textView.setText("Good Morning");
        } else if (current_hours >= 12 && current_hours < 18) {
            textView.setText("Good Afternoon");
        } else if (current_hours == 5 && current_minute < 45) {
            textView.setText("Good Evening");
        } else if (current_hours >= 18 || current_hours < 5) {
            textView.setText("Good Evening");
        }
    }
}