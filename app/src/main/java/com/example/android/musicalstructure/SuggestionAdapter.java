package com.example.android.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by skim2 on 7/14/2017.
 */

public class SuggestionAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] artists;
    private final String[] titles;
    private final String[] lengths;

    public SuggestionAdapter(Context context, String[] artists, String[] titles, String[] lengths) {

        super(context, R.layout.rowlayout, artists);
        this.context = context;
        this.artists = artists;
        this.titles = titles;
        this.lengths = lengths;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
        TextView artistTextView = (TextView) rowView.findViewById(R.id.artist_text_view);
        TextView titleTextView = (TextView) rowView.findViewById(R.id.title_text_view);
        TextView lengthTextView = (TextView) rowView.findViewById(R.id.length_text_view);
        ImageButton imageButton = (ImageButton) rowView.findViewById(R.id.album_image_button);
        artistTextView.setText(artists[position]);
        titleTextView.setText(titles[position]);
        lengthTextView.setText(lengths[position]);
        return rowView;
    }
}
