package com.example.chatdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView startChat = findViewById(R.id.start_chat);
        startChat.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, FaqActivity.class));
        });
    }
}
