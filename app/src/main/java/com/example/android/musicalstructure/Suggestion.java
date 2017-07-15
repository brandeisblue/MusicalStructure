package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
/*
public class Suggestion extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] artists = new String[] {"Kanye West", "Passenger", "Ed Sheeran"};
        String[] songTitles = new String[] {"All Falls Down", "Let Her Go", "Shape of You"};
        String[] songLengths = new String[] {"3:44", "4:13", "3:54"};
        SuggestionAdapter suggestionAdapter = new SuggestionAdapter(this, artists, songTitles, songLengths);
        setListAdapter(suggestionAdapter);
    }
}*/
public class Suggestion extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);

        String[] artists = new String[]{"Kanye West", "Passenger", "Ed Sheeran"};
        String[] songTitles = new String[]{"All Falls Down", "Let Her Go", "Shape of You"};
        String[] songLengths = new String[]{"3:44", "4:13", "3:54"};

        ListView listview = (ListView) findViewById(R.id.list_view);
        SuggestionAdapter suggestionAdapter = new SuggestionAdapter(this, artists, songTitles, songLengths);
        listview.setAdapter(suggestionAdapter);

    }
}
