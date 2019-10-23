package com.example.puzzlewise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class wordsActivity extends AppCompatActivity {

    private EditText wordsInput;
    //private String[] list = new String[5];
    private TextView wordList;
    private Button addBtn;
    private String word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        wordsInput = (EditText) findViewById(R.id.input);

        wordList = (TextView) findViewById(R.id.wordList);

        addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                wordList.setText(word);
            }
        });

        word = wordsInput.getText().toString();
    }


}
