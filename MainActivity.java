package com.example.puzzlewise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button main_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_start = findViewById(R.id.startButton);
        main_start.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                openWordsActivity();
            }
        });
    }

    public void openWordsActivity()
    {
        Intent intent = new Intent(this, wordsActivity.class);
        startActivity(intent);
    }
}
