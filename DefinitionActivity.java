package com.example.puzzlewise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DefinitionActivity extends AppCompatActivity {

    TextView reminderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition);

        Bundle extras = getIntent().getExtras();
        final String[] list = extras.getStringArray("list");

        reminderList = findViewById(R.id.reminderList);
        reminderList.setText(list[0] + "\n" + list[1] + "\n" + list[2] + "\n" + list[3] + "\n" + list[4]);


    }
}
