package com.example.learnkannada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Then","Matte/ Amele."));
        words.add(new Word("Hello","Namaskara"));
        words.add(new Word("What is your name? ","Ninna hesarenu?/ Ninna hesaru yenu?"));
        words.add((new Word("How are you ?","Neevu heggidira ?")));
        words.add(new Word("I am fine.","Naanu Chenagiddini."));
        words.add(new Word("We’ll meet again.","Sigona"));
        words.add(new Word("What happened ?","Yenaithu?"));
        words.add(new Word("Did you have your lunch/food?","Oota Aayitha?"));
        words.add(new Word("Come home.","Mane ge banni"));
        words.add(new Word("Please sit.","Kooth kolli"));
        words.add(new Word("I want.","Nanage Beku"));
        words.add(new Word("I don’t want.","Nanage Beda"));
        words.add(new Word("Nice to meet you.","Nim'mannu nōḍi tumba santōṣa."));
        words.add(new Word("I'm good, thanks.","Nānu cennāgi iddēne, dhan'yavādhagaḷu."));
        words.add(new Word("And you?","Tāvu"));
        words.add(new Word("Do you speak (English/Kannada)?","Nīvu kannaḍa/ iṅgliṣ mātanāḍutira"));
        words.add(new Word("A little bit","Swalpa"));
        words.add(new Word("How old are you?","Nimage eṣṭu varṣa"));
        words.add(new Word("I'm 21 years old.","Nannage ippattondu varṣa"));
        words.add(new Word("It was nice talking to you","Nim'ma jote mātanāḍi kuśi āyitu"));
        words.add(new Word("What do you mean?","Ēnu nim'ma artha"));
        words.add(new Word("I don't understand.","Nanage artha āgalilla"));
        words.add(new Word("I don't know.","Nanage gottilla"));
        words.add(new Word("Sorry.","Kṣamisi"));
        words.add(new Word("What is that called in Kannada?","Kannaḍadalli adakke ēnu kareyuttāre."));



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