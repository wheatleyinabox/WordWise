package com.example.puzzlewise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardActivity extends AppCompatActivity {

    Button card, reset, home;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        Bundle extras = getIntent().getExtras();
        final String[] cardList = extras.getStringArray("cardList");

        card = findViewById(R.id.card);
        card.setText("Click Me!");

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                card.setText(cardList[count]);
                count++;
                if (count == cardList.length) {
                    count = 0;
                }
            }
        });

        home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWordsActivity();
            }
        });
    }

    public void openMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openWordsActivity()
    {
        Intent intent = new Intent(this, wordsActivity.class);
        startActivity(intent);
    }
}
