package com.example.christmas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class InfoScreen extends AppCompatActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_main);

        Button restartButton = findViewById(R.id.restartBtn);
        restartButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(v.getContext(), StartActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
