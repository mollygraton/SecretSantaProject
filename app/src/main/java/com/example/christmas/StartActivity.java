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
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);


        Button nextButton = findViewById(R.id.nextBtn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                List names = new ArrayList<>(5);
                EditText name1 = findViewById(R.id.nameOne);
                EditText name2 = findViewById(R.id.nameTwo);
                EditText name3 = findViewById(R.id.nameThree);
                EditText name4 = findViewById(R.id.nameFour);
                EditText name5 = findViewById(R.id.nameFive);

//                int count = 0;
//                EditText currentName = name1;
//                while (count < names.size()) {
//                    int current = (int)(Math.random() * names.size());
//                    if (names.get(current) == null) {
//                        //names.set(current, currentName.get)
//                    }
//                }


                // Code here executes on main thread after user presses button
                Intent intent = new Intent(v.getContext(), InfoScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

