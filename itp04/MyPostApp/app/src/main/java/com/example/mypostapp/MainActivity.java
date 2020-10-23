package com.example.mypostapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button post=findViewById(R.id.postData);
        View textView = findViewById(R.id.postText);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postRequest();
            }

        });
    }
    private void postRequest() {
        RequestQueue requestQueue= Volley.newRequestQueue( MainActivity.this);
    }

}