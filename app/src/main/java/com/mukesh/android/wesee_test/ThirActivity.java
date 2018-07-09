package com.mukesh.android.wesee_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thir);

        TextView textView = findViewById(R.id.randomtext);

        Button button = findViewById(R.id.drive_button_third);

        int calibratedvalue = getIntent().getExtras().getInt("calibratedvalue");

        textView.setText("Number of blinks per 10 sec :" + calibratedvalue);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirActivity.this, CameraActivity.class);
                intent.putExtra("calibrate", 1);
                startActivity(intent);
            }
        });


    }
}
