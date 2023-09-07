package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, HelloActivity.class);

        // Pass the current count as an extra to the intent
        intent.putExtra("count", mCount);

        // Start the HelloActivity
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        TextView countTextView = findViewById(R.id.show_count);
        countTextView.setText(Integer.toString(mCount));

    }

}