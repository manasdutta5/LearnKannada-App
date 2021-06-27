package com.example.learnkannada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","Ondu"));
        words.add(new Word("Two","Eradu"));
        words.add(new Word("Three","Mūru"));
        words.add(new Word("Four","Nālku"));
        words.add(new Word("Five","Aydu"));
        words.add(new Word("Six","āru"));
        words.add(new Word("Seven","ēḷu"));
        words.add(new Word("Eight","ēṇṭu"));
        words.add((new Word("Nine","Ombattu")));
        words.add(new Word("Ten","hattu"));

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