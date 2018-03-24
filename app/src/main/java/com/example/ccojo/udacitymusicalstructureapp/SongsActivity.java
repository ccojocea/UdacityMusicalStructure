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

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Smack My Bitch Up", "Prodigy", "The Fat of the Land", R.drawable.fatoftheland, 235));
        songs.add(new Song("Breathe", "Prodigy", "The Fat of the Land", R.drawable.fatoftheland, 213));
        songs.add(new Song("Firestarter", "Prodigy", "The Fat of the Land", R.drawable.fatoftheland, 205));
        songs.add(new Song("Narayan", "Prodigy", "The Fat of the Land", R.drawable.fatoftheland, 275));
        songs.add(new Song("Mindfields", "Prodigy", "The Fat of the Land", R.drawable.fatoftheland, 312));
        songs.add(new Song("Serial Thrilla", "Prodigy", "The Fat of the Land", R.drawable.fatoftheland, 415));
        songs.add(new Song("Funky Shit", "Prodigy", "The Fat of the Land", R.drawable.fatoftheland, 55));
        songs.add(new Song("Diesel Power", "Prodigy", "The Fat of the Land", R.drawable.fatoftheland, 355));
        songs.add(new Song("Crossfire", "Gaia", R.drawable.gaia, 180));
        songs.add(new Song("Empire of Hearts", "Gaia", R.drawable.gaia, 213));
        songs.add(new Song("Aisha", "Gaia", R.drawable.gaia, 250));
        songs.add(new Song("Tuvan", "Gaia", R.drawable.gaia, 220));
        songs.add(new Song("Carnation", "Gaia", R.drawable.gaia, 210));
        songs.add(new Song("Inyathi", "Gaia", R.drawable.gaia));
        songs.add(new Song("In Principio", "Gaia", R.drawable.gaia));
        songs.add(new Song("Humming The Lights", "Gaia", R.drawable.gaia));
        songs.add(new Song("Status Excessu D", "Gaia", R.drawable.gaia));
        songs.add(new Song("4 Elements", "Gaia", R.drawable.gaia));
        songs.add(new Song("Stellar", "Gaia", R.drawable.gaia));
        songs.add(new Song("J'ai Envie De Toi", "Gaia", R.drawable.gaia));
        songs.add(new Song("Sing me to sleep"));
        songs.add(new Song("You once told me"));
        songs.add(new Song("Empty spaces"));
        songs.add(new Song("Lost"));

        SongAdapter songsAdp = new SongAdapter(this, songs);
        ListView lv = findViewById(R.id.list_view);
        lv.setAdapter(songsAdp);
    }
}
