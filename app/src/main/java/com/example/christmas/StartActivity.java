package com.example.christmas;
import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import android.graphics.drawable.AnimationDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;


public class StartActivity extends AppCompatActivity implements Serializable {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Button nextButton = findViewById(R.id.nextBtn);
        nextButton.setOnClickListener(unused -> onClick());
        ConstraintLayout constraintLayout = findViewById(R.id.ConstraintLayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();
    }
    private void onClick() {
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

        Collections.shuffle(tempNames);

        for (int i = 0; i < tempNames.size(); i++) {
            System.out.println(tempNames.get(i));
        }


        Intent intent = new Intent(StartActivity.this, InfoScreen.class);
        intent.putStringArrayListExtra("names", tempNames);
        startActivity(intent);
        //finish();
    }
}

