package com.example.learnkannada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class familyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Daughter","magalu"));
        words.add(new Word("Mother","amma"));
        words.add(new Word("Father","appa"));
        words.add(new Word("Son","maga"));
        words.add(new Word("Elder Brother","anna"));
        words.add(new Word("Elder Sister","akka"));
        words.add(new Word("Younger Sister","tangi"));
        words.add(new Word("Husband","ganda"));
        words.add((new Word("Wife","hendathi")));
        words.add(new Word("Grandfather","ajja / taata"));
        words.add(new Word("Grandmother","ajji"));

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