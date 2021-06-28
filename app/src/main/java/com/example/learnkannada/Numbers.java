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

        words.add(new Word("One","Ondu",R.drawable.number_one));
        words.add(new Word("Two","Eradu",R.drawable.number_two));
        words.add(new Word("Three","Mūru",R.drawable.number_three));
        words.add(new Word("Four","Nālku",R.drawable.number_four));
        words.add(new Word("Five","Aydu",R.drawable.number_five));
        words.add(new Word("Six","āru",R.drawable.number_six));
        words.add(new Word("Seven","ēḷu",R.drawable.number_seven));
        words.add(new Word("Eight","ēṇṭu",R.drawable.number_eight));
        words.add((new Word("Nine","Ombattu",R.drawable.number_nine)));
        words.add(new Word("Ten","hattu",R.drawable.number_ten));

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