package com.example.hellotoast;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        int count = getIntent().getIntExtra("count", 0);
        TextView textHello = findViewById(R.id.text_hello);
        textHello.setText("Hello!\n " + count);
    }
}
