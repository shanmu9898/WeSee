package com.mukesh.android.wesee_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Button driveButton = (Button) findViewById(R.id.drive_button);
        Button calibrateButton = (Button) findViewById(R.id.calibrate_button);

        driveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePage.this, CameraActivity.class);
                intent.putExtra("calibrate", 1);
                startActivity(intent);
            }
        });

        calibrateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePage.this, CameraActivity.class);
                intent.putExtra("calibrate", 2);
                startActivity(intent);

            }
        });



    }




}
