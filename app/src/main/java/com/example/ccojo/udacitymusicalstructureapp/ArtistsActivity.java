package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<Artist> artists = new ArrayList<>();
        Set<Artist> artistSet = new HashSet<>();
        for(Song song : MainActivity.allSongs){
            artistSet.add(new Artist(song.getArtistName(), song.getArtistArt()));
        }
        for(Artist artist : artistSet){
            artists.add(artist);
        }

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artists);
        GridView gv = findViewById(R.id.grid_view);
        gv.setAdapter(artistAdapter);
    }
}
