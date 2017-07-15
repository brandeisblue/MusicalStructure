package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Button s1 = (Button) findViewById(R.id.suggestion1_button);
        Button s2 = (Button) findViewById(R.id.suggestion2_button);
        Button s3 = (Button) findViewById(R.id.suggestion3_button);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1Intent = new Intent(MainPageActivity.this, Suggestion.class);
                startActivity(s1Intent);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1Intent = new Intent(MainPageActivity.this, Suggestion.class);
                startActivity(s1Intent);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1Intent = new Intent(MainPageActivity.this, Suggestion.class);
                startActivity(s1Intent);
            }
        });

        Button nowPlayingButton = (Button) findViewById(R.id.now_playing_button);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(MainPageActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        Button exploreMusicButton = (Button) findViewById(R.id.explore_button);
        exploreMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exploreIntent = new Intent(MainPageActivity.this, ExploreMusic.class);
                startActivity(exploreIntent);
            }
        });

        Button libraryButton = (Button) findViewById(R.id.library_button);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(MainPageActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        Button settingButton = (Button) findViewById(R.id.setting_button);
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingIntent = new Intent(MainPageActivity.this, Setting.class);
                startActivity(settingIntent);
            }
        });

        final Button paymentButton = (Button) findViewById(R.id.payment_button);
        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(MainPageActivity.this, Payment.class);
                startActivity(paymentIntent);
            }
        });


    }
}
