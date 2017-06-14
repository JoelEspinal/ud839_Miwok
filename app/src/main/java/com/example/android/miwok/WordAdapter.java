package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 6/13/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private Word word;

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word word = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_translation_textView);
        defaultTranslation.setText(word.getmDefaultTranslation());

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_translation_textView);
        miwokTranslation.setText(word.getmMiwokTranslation());

        return listItemView;
    }
}
