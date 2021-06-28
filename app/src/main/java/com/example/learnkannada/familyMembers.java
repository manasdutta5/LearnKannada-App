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

        words.add(new Word("Daughter","magalu",R.drawable.family_younger_sister));
        words.add(new Word("Mother","amma",R.drawable.family_mother));
        words.add(new Word("Father","appa",R.drawable.family_father));
        words.add(new Word("Son","maga",R.drawable.family_son));
        words.add(new Word("Elder Brother","anna",R.drawable.family_older_brother));
        words.add(new Word("Elder Sister","akka",R.drawable.family_older_sister));
        words.add(new Word("Younger Sister","tangi",R.drawable.family_younger_sister));
        words.add(new Word("Husband","ganda",R.drawable.family_father));
        words.add((new Word("Wife","hendathi",R.drawable.family_mother)));
        words.add(new Word("Grandfather","ajja / taata",R.drawable.family_grandfather));
        words.add(new Word("Grandmother","ajji",R.drawable.family_grandmother));

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