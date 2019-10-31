package com.example.puzzlewise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardActivity extends AppCompatActivity {

    Button card, resetBtn;
    Boolean reset = false;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        Bundle extras = getIntent().getExtras();
        final String[] cardList = extras.getStringArray("cardList");

        card = findViewById(R.id.card);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                while (reset == false)
                {
                    card.setText(cardList[count]);
                    count++;
                    if (count == cardList.length)
                    {
                        count = 0;
                    }
                }
            }
        });

        //resetBtn = findViewById(R.id.resetButton);
    }
}
