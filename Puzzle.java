package com.example.puzzlewise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Puzzle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        //GridView gridView = (GridView)findViewById(R.id.puzzleboard);
        //PuzzleAdapter puzzleAdapter = new PuzzleAdapter(this, wordsActivity.list);
        //gridView.setAdapter(puzzleAdapter);
    }
}
