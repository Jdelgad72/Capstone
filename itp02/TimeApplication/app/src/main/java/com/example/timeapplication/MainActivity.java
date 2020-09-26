package com.example.timeapplication;

import android.os.Bundle;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Calendar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView dateTimeDisplay = findViewById(R.id.textView);

        Calendar calendar = Calendar.getInstance();

        




}