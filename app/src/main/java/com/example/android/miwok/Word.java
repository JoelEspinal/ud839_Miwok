package com.example.android.miwok;

/**
 * Created by User on 6/13/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage;


    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int image){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = image;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getImage(){
        return mImage;
    }
}
