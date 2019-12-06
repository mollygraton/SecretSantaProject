package com.example.christmas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(error.toString());
                        System.out.println(" ");
                        System.out.println(" ");
                        textView.setText("What");
                    }
                });
        queue.add(request);

    }
}
