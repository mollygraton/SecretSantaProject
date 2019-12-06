package com.example.christmas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class InfoScreen extends AppCompatActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_main);


        Intent in = getIntent();
        ArrayList<String> tempNames = in.getStringArrayListExtra("names");
        if (tempNames != null) {
            System.out.println(tempNames.toString());

            for (int i = 0; i < tempNames.size(); i++) {
                System.out.println(tempNames.get(i));
            }

            TextView nameT1 = findViewById(R.id.nameT1);
            TextView nameT2 = findViewById(R.id.nameT2);
            TextView nameT3 = findViewById(R.id.nameT3);
            TextView nameT4 = findViewById(R.id.nameT4);
            TextView nameT5 = findViewById(R.id.nameT5);

            TextView nameR1 = findViewById(R.id.nameR1);
            TextView nameR2 = findViewById(R.id.nameR2);
            TextView nameR3 = findViewById(R.id.nameR3);
            TextView nameR4 = findViewById(R.id.nameR4);
            TextView nameR5 = findViewById(R.id.nameR5);

            final String template = " has... ";
            nameT1.setText(tempNames.get(0) + template);
            nameT2.setText(tempNames.get(1) + template);
            nameT3.setText(tempNames.get(2) + template);
            nameT4.setText(tempNames.get(3) + template);
            nameT5.setText(tempNames.get(4) + template);

            nameR1.setText(tempNames.get(1));
            nameR2.setText(tempNames.get(2));
            nameR3.setText(tempNames.get(3));
            nameR4.setText(tempNames.get(4));
            nameR5.setText(tempNames.get(0));
        }
        Button restartButton = findViewById(R.id.restartBtn);
        restartButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                Intent intent = new Intent(v.getContext(), StartActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button giftButton = findViewById(R.id.giftButton);
        giftButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                Intent intent = new Intent(v.getContext(), GiftActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
