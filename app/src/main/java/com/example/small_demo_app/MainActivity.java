package com.example.small_demo_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.go_fish);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FishActivity.class));
            }
        });

        TextView tapOnMe = findViewById(R.id.tap_on_me);
        tapOnMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TapActivity.class));
            }
        });
        String input= getIntent().getStringExtra("USER_INPUT");
        if (input != null)
        {
            tapOnMe.setText("you have entered: " + input);
        }
    }
}
