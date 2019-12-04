package com.example.christmas;

import android.os.Bundle;
//import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;

//import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;


public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        System.out.print("here");

        Button nextButton = findViewById(R.id.nextBtn);
        nextButton.setOnClickListener(unused -> onClick());
        System.out.print("here1");
    }
    private void onClick() {
        List names = new ArrayList<>(5);
        EditText name1 = findViewById(R.id.nameOne);
        EditText name2 = findViewById(R.id.nameTwo);
        EditText name3 = findViewById(R.id.nameThree);
        EditText name4 = findViewById(R.id.nameFour);
        EditText name5 = findViewById(R.id.nameFive);

        ArrayList<String> tempNames = new ArrayList<String>();
        tempNames.add(name1.getText().toString());
        tempNames.add(name2.getText().toString());
        tempNames.add(name3.getText().toString());
        tempNames.add(name4.getText().toString());
        tempNames.add(name5.getText().toString());

        int count = 0;
        boolean placed = false;
        for (int i = 0; i < names.size(); i++) {
            while (placed == false) {
                int temp = (int) (Math.random() * names.size());
                if (names.get(temp) == null) {

                }
            }
        }

        // Code here executes on main thread after user presses button
        System.out.print("hi");
        Intent intent = new Intent(StartActivity.this, InfoScreen.class);
        startActivity(intent);
        //finish();
    }
}

