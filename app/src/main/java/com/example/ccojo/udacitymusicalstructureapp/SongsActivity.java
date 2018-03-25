package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        SongAdapter songsAdp = new SongAdapter(this, MainActivity.allSongs);
        ListView lv = findViewById(R.id.list_view);
        lv.setAdapter(songsAdp);
    }
}
