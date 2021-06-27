package com.example.learnkannada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red","kempu"));
        words.add(new Word("Pink","gulaabibaṇṇa"));
        words.add(new Word("Orange","kittaḷe baṇṇa"));
        words.add(new Word("Yellow","haḷadi"));
        words.add(new Word("Brown","Kandu"));
        words.add(new Word("Blue","nīli"));
        words.add(new Word("Purple","nērallebaṇṇa"));
        words.add(new Word("Green","hasiru"));
        words.add((new Word("White","bili")));
        words.add(new Word("Black","kappu"));
        words.add(new Word("Grey","rajata"));

        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}