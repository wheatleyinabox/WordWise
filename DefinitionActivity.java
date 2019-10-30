package com.example.puzzlewise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DefinitionActivity extends AppCompatActivity {

    TextView reminderList, cardList_result;
    Button add_def;
    String[] cardList = new String[10];
    String[] def = new String[5];
    EditText input10, input20, input30, input40, input50;
    String def1, def2, def3, def4, def5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition);

        Bundle extras = getIntent().getExtras();
        final String[] list = extras.getStringArray("list");

        cardList_result = findViewById(R.id.cardList_result);
        reminderList = findViewById(R.id.reminderList);
        reminderList.setText(list[0] + "\n" + list[1] + "\n" + list[2] + "\n" + list[3] + "\n" + list[4]);

        input10 = findViewById(R.id.input10);
        input20 = findViewById(R.id.input20);
        input30 = findViewById(R.id.input30);
        input40 = findViewById(R.id.input40);
        input50 = findViewById(R.id.input50);

        add_def = findViewById(R.id.add_def);
        add_def.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                def1 = input10.getText().toString();
                def2 = input20.getText().toString();
                def3 = input30.getText().toString();
                def4 = input40.getText().toString();
                def5 = input50.getText().toString();
                def[0] = def1;
                def[1] = def2;
                def[2] = def3;
                def[3] = def4;
                def[4] = def5;

                // It's gross, I know, but it's the only way it works :/
                cardList[0] = list[0];
                cardList[1] = def[0];
                cardList[2] = list[1];
                cardList[3] = def[1];
                cardList[4] = list[2];
                cardList[5] = def[2];
                cardList[6] = list[3];
                cardList[7] = def[3];
                cardList[8] = list[4];
                cardList[9] = def[4];

                cardList_result.setText(cardList[0] + "\n" + cardList[1] + "\n" + cardList[2] + "\n" + cardList[3] + "\n" + cardList[4] + "\n" + cardList[5] + "\n" + cardList[6] + "\n" + cardList[7] + "\n" + cardList[8] + "\n" + cardList[9]);
            }
        });
    }
}
