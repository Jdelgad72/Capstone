package com.example.login;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
            final TextView num = findViewById(R.id.num);
            final TextView status = findViewById(R.id.status);
            final TextView message = findViewById(R.id.message);
            final Button postData = findViewById(R.id.postData);
            final String teamnumber = "21";



            postData.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final String num_string = num.getText().toString();
                    String url = "https://cgi.luddy.indiana.edu/~examples/info-i494/magic-number/public/index.php/generate";
// Request a string response from the provided URL.
                    StringRequest postRequest = new StringRequest(Request.Method.POST, url,
                            new Response.Listener<String>() {
                                @SuppressLint("SetTextI18n")

                                public void onResponse(String response) {
                                    // Display the first 500 characters of the response string.
                                    try {
                                        JSONObject jsonResponse = new JSONObject(response);
                                        status.setText("Status is: " + jsonResponse.getString("status"));
                                        message.setText("Message is: " + jsonResponse.getString("message"));
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            },
                            new Response.ErrorListener() {
                                @SuppressLint("SetTextI18n")

                                public void onErrorResponse(VolleyError error) {
                                    num.setText("That didn't work!");
                                    error.printStackTrace();
                                }
                            }
                    ) {
                        @Override
                        protected Map<String, String> getParams() {
                            Map<String, String> params = new HashMap<>();
                            params.put("team", teamnumber);
                            params.put("number", num_string);
                            return params;
                        }
                    };
                    Volley.newRequestQueue(SecondActivity.this).add(postRequest);
                }
            });
    }
}