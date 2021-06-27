package com.example.learnkannada;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on Numbers View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
                startActivity(numbersIntent);
            }
        });

//        Find family text view
        TextView familyMembers = (TextView) findViewById(R.id.family);

//        Set a click Listener for Family Members View
        familyMembers.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the familyMembers View is clicked on.
           @Override
            public void onClick(View view){
               Intent familyMembersIntent = new Intent(MainActivity.this, familyMembers.class);
               startActivity(familyMembersIntent);
           }
        });

//        Find colors textview
        TextView colors = (TextView) findViewById(R.id.colors);

//        set a click Listener for colors view
        colors.setOnClickListener(new View.OnClickListener()
              {
                @Override
                public void onClick(View view){
                    Intent colors = new Intent(MainActivity.this,colors.class);
                    startActivity(colors);
              }
        });

//        Find phrases text view
        TextView phrases = (TextView) findViewById(R.id.phrases);

//        Set Click Listener for phrases View
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent phrases = new Intent(MainActivity.this,Phrases.class);
                startActivity(phrases);
            }
        });

        //        Find translator text view
        TextView translate = (TextView) findViewById(R.id.custom);

        //        Set Click Listener for Custom Translator View
        translate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent translator = new Intent(MainActivity.this,CustomTranslate.class);
                startActivity(translator);
            }
        });

    }


}