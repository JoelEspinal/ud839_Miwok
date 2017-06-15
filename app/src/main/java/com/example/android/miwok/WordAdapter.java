package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 6/13/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    private TextView defaultTranslation;
    private TextView miwokTranslation;

    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor) {
        super(context, 0, words);
        mColorResourceId = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word currentWord = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        defaultTranslation = (TextView) listItemView.findViewById(R.id.default_translation_text_view);
        defaultTranslation.setText(currentWord.getmDefaultTranslation());

        miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_translation_text_view);
        miwokTranslation.setText(currentWord.getmMiwokTranslation());

        View textContainer = listItemView.findViewById(R.id.text_container);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
