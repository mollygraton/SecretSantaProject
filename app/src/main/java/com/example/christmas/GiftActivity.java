package com.example.christmas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;


public class GiftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadScreen();Button reloadBtn = findViewById(R.id.reloadButton);
        reloadBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                loadScreen();
            }
        });

        Button homeBtn = findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                Intent intent = new Intent(v.getContext(), StartActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void loadScreen() {
        setContentView(R.layout.activity_gift);

        TextView textView = findViewById(R.id.giftTxt);
        final String url = "https://api.datamuse.com/words?rel_jja=yellow";

        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url ,null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            JSONObject thisOb = response.getJSONObject((int)(Math.random() * response.length()));
                            String text = thisOb.get("word").toString();
                            textView.setText(text);
                        }
                        catch (JSONException e) {
                            System.out.print("error");
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        System.out.println(error.toString());
                    }
                });
        queue.add(request);
        Button reloadBtn = findViewById(R.id.reloadButton);
        reloadBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                loadScreen();
            }
        });

        Button homeBtn = findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                Intent intent = new Intent(v.getContext(), StartActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
