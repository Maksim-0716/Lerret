package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DifficultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficult);
        Intent intent=getIntent();
        String flogin=intent.getStringExtra("flogin").toString();
        TextView nick=findViewById(R.id.textView3);
        nick.setText("Здравствуйте, " + flogin);
    }

    public void Easy(View v) {
        Intent intent_to_start_easy_level = new Intent(DifficultActivity.this, mapone.class);
        startActivity(intent_to_start_easy_level);
    }

    public void Medium(View v) {
        Intent intent_to_start_medium_level = new Intent(DifficultActivity.this, maptwo.class);
        startActivity(intent_to_start_medium_level);
    }

    public void Hard(View v) {
        Intent intent_to_start_hard_level = new Intent(DifficultActivity.this, map3.class);
        startActivity(intent_to_start_hard_level);
    }
}
