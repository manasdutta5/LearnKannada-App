package com.example.learnkannada;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions;
import com.google.firebase.ml.naturallanguage.FirebaseNaturalLanguage;
import com.google.firebase.ml.naturallanguage.languageid.FirebaseLanguageIdentification;
import com.google.firebase.ml.naturallanguage.translate.FirebaseTranslateLanguage;
import com.google.firebase.ml.naturallanguage.translate.FirebaseTranslator;
import com.google.firebase.ml.naturallanguage.translate.FirebaseTranslatorOptions;

public class CustomTranslate extends AppCompatActivity {

    private TextView msourceLang;
    private EditText msourceText;
    private Button mTranslateBtn;
    private TextView mTranslatedText;
    private String sourceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_translate);
        msourceLang = findViewById(R.id.sourceLang);
        msourceText = findViewById(R.id.sourceText);
        mTranslateBtn = findViewById(R.id.translate);
        mTranslatedText = findViewById(R.id.transatedText);

        mTranslateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                identifyLanguage();
            }
        });

    }

    private void identifyLanguage()
    {
        sourceText = msourceText.getText().toString();
        FirebaseLanguageIdentification identifier = FirebaseNaturalLanguage.getInstance().getLanguageIdentification();

        msourceLang.setText("Detecting Your Language!");
        identifier.identifyLanguage(sourceText).addOnSuccessListener(new OnSuccessListener<String>() {
            @Override
            public void onSuccess(String s)
            {
//                if lanuage is not identified, instead of language cpde, firebase will return und
                if(s.equals("und"))
                {
                    Toast.makeText(getApplicationContext(),"Language mot supported!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    getLanguageCode(s);

                }
            }
        });
    }

    private void getLanguageCode(String lang)
    {
        int langCode;
        switch(lang)
        {
            case "HI":
                langCode = FirebaseTranslateLanguage.HI;
                msourceLang.setText("Hindi");
                break;
            case "KN":
                langCode = FirebaseTranslateLanguage.KN;
                msourceLang.setText("Kannada");
                break;
            case "EN":
                langCode = FirebaseTranslateLanguage.EN;
                msourceLang.setText("English");
                break;
            case "TE":
                langCode = FirebaseTranslateLanguage.TE;
                msourceLang.setText("Telugu");
                break;
            case "DE":
                langCode = FirebaseTranslateLanguage.DE;
                msourceLang.setText("German");
                break;
            default:langCode=0;
        }
        translateText(langCode);
    }

    private void translateText(int langCode)
    {
        mTranslatedText.setText("Hold on! Translating.....");
        FirebaseTranslatorOptions options = new FirebaseTranslatorOptions.Builder()
                .setSourceLanguage(langCode)
                .setTargetLanguage(FirebaseTranslateLanguage.KN)
                .build();

        FirebaseTranslator translator = FirebaseNaturalLanguage.getInstance()
                .getTranslator(options);
        FirebaseModelDownloadConditions conditions = new FirebaseModelDownloadConditions.Builder()
                .build();
        translator.downloadModelIfNeeded(conditions).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(@NonNull Void aVoid)
            {
                translator.translate(sourceText).addOnSuccessListener(new OnSuccessListener<String>() {
                    @Override
                    public void onSuccess(@NonNull String s) {
                        mTranslatedText.setText(s);
                    }
                });
            }
        });
    }
}