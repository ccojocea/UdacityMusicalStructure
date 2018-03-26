package com.example.ccojo.udacitymusicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<Song> allSongs = new ArrayList<>();
    private boolean isMute = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Background music service
        final Intent svc = new Intent(this, BackgroundSoundService.class);

        final ImageView muteView = findViewById(R.id.mute);
        muteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isMute){
                    startService(svc);
                    muteView.setImageResource(R.drawable.mute_button_toggle);
                    isMute = false;
                } else {
                    muteView.setImageResource(R.drawable.mute_button);
                    stopService(svc);
                    isMute = true;
                }
            }
        });

        LinearLayout linPlay = findViewById(R.id.play_layout);
        LinearLayout linPlaylists = findViewById(R.id.playlists_layout);
        LinearLayout linArtists = findViewById(R.id.artists_layout);
        LinearLayout linAlbums = findViewById(R.id.albums_layout);
        LinearLayout linSongs = findViewById(R.id.songs_layout);

        linPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });

        linPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(intent);
            }
        });

        linArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(intent);
            }
        });

        linAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        linSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });

        allSongs.add(new Song("Breathe", R.drawable.breathe,"Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 213));
        allSongs.add(new Song("Smack My Bitch Up", R.drawable.smackmybitchup, "Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 235));
        allSongs.add(new Song("Firestarter", R.drawable.firestarter,"Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 205));
        allSongs.add(new Song("Narayan", 0,"Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 275));
        allSongs.add(new Song("Mindfields", 0,"Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 312));
        allSongs.add(new Song("Serial Thrilla", 0,"Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 415));
        allSongs.add(new Song("Funky Shit", 0,"Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 55));
        allSongs.add(new Song("Diesel Power", 0,"Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 355));
        allSongs.add(new Song("Climbatize", 0,"Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 355));
        allSongs.add(new Song("Fuel My Fire", 0,"Prodigy", R.drawable.prodigy, "The Fat of the Land", R.drawable.fatoftheland, 355));
        allSongs.add(new Song("Don't stop", 0,"ATB", R.drawable.atb, "Movin' Melodies", 0, 355));
        allSongs.add(new Song("9 PM (Till I Come)", 0,"ATB", R.drawable.atb, "Movin' Melodies", 0, 355));
        allSongs.add(new Song("Crossfire", 0, "Gaia", R.drawable.gaia));
        allSongs.add(new Song("Empire of Hearts", 0, "Gaia", R.drawable.gaia));
        allSongs.add(new Song("Aisha", 0,"Gaia", R.drawable.gaia));
        allSongs.add(new Song("Tuvan", 0,"Gaia", R.drawable.gaia));
        allSongs.add(new Song("Carnation", 0,"Gaia", R.drawable.gaia));
        allSongs.add(new Song("Inyathi",0, "Gaia", R.drawable.gaia));
        allSongs.add(new Song("In Principio", 0,"Gaia", R.drawable.gaia));
        allSongs.add(new Song("Humming The Lights", 0,"Gaia", R.drawable.gaia));
        allSongs.add(new Song("Status Excessu D", 0,"Gaia", R.drawable.gaia));
        allSongs.add(new Song("4 Elements", 0,"Gaia", R.drawable.gaia));
        allSongs.add(new Song("Stellar", 0,"Gaia", R.drawable.gaia));
        allSongs.add(new Song("J'ai Envie De Toi", 0,"Gaia", R.drawable.gaia));
        allSongs.add(new Song("Sing me to sleep"));
        allSongs.add(new Song("You once told me"));
        allSongs.add(new Song("Empty spaces"));
        allSongs.add(new Song("Lost"));
    }
}
