package com.example.christmas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

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
