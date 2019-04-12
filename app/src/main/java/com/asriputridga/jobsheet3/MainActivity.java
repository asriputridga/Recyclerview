package com.asriputridga.jobsheet3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private WordListAdapter wordListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> wordList = new ArrayList<>();
        wordList.add("E-bussiness");
        wordList.add("PM");
        wordList.add("MP");
        recyclerView = findViewById(R.id.recyclerview);
        wordListAdapter = new WordListAdapter(this, wordList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(wordListAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
