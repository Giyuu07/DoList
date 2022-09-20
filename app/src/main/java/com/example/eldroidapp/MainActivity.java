package com.example.eldroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        startButton = findViewById(R.id.seeStartButton);

        startButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            String enteredName = etName.getText().toString();
            intent.putExtra("KEY_USERNAME", enteredName);
            startActivity(intent);
        });


    }
}