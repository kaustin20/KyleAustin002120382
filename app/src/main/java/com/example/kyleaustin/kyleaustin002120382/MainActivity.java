package com.example.kyleaustin.kyleaustin002120382;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button orgButton;
    private Button picButton;

    private Button demoButton;
    private Button workButton;

    private View.OnClickListener demoListener;

    public void onBack(View v){
        Toast.makeText(this,"Hello Andriod",Toast.LENGTH_SHORT).show();

    }
    //demoListener = new View.OnClickListener(R.id.main_demo_bt);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orgButton = findViewById(R.id.main_title_org);
        picButton = findViewById(R.id.main_title_pic);

        demoButton = findViewById(R.id.main_demo_bt);
        demoButton.setTextColor(Color.RED);
        workButton = findViewById(R.id.main_work_bt);

        picButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Welcome to the Dojo",Toast.LENGTH_SHORT).show();

            }
        });

        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demoButton.setTextColor(Color.RED);
                workButton.setTextColor(Color.BLACK);

            }
        });

        workButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demoButton.setTextColor(Color.BLACK);
                workButton.setTextColor(Color.RED);

            }
        });
    }
}
