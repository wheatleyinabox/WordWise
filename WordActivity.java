package com.example.wordwise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordActivity extends AppCompatActivity {

    String[] list = new String[5];
    TextView wordList;
    Button addBtn, def_start;
    String word1, word2, word3, word4, word5;
    EditText input1, input2, input3, input4, input5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        wordList = findViewById(R.id.wordList);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);

        addBtn = findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                word1 = input1.getText().toString();
                word2 = input2.getText().toString();
                word3 = input3.getText().toString();
                word4 = input4.getText().toString();
                word5 = input5.getText().toString();
                list[0] = word1;
                list[1] = word2;
                list[2] = word3;
                list[3] = word4;
                list[4] = word5;

                wordList.setText(list[0] + "\n" + list[1] + "\n" + list[2] + "\n" + list[3] + "\n" + list[4]);
            }
        });

        def_start = findViewById(R.id.nextBtn);
        def_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                openDefinitionActivity();
            }
        });
    }

    public void openDefinitionActivity()
    {
        Intent intent = new Intent(this, DefinitionActivity.class);
        intent.putExtra("list", list);
        startActivity(intent);
    }
}
