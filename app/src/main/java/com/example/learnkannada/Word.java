package com.example.learnkannada;

public class Word {

    private String mKannadaTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public Word(String DefaultTranslation,String KannadaTranslation){
        mKannadaTranslation = KannadaTranslation;
        mDefaultTranslation = DefaultTranslation;
//       mImageResourceId = imageResourceId;
    }

    /**
     * Get the Kannada translation of the word.
     */

    public String getKannadaTranslation() {
        return mKannadaTranslation;
    }

    /**
     * Get the default translation of the word.
     */

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
