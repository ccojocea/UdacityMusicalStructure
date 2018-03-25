package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    ArrayList<Song> songsToPlay;
    SongAdapter songsAdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ListView lv = findViewById(R.id.list_view);

        //Check extra bundle
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            //from albums
            if(extras.getInt("REFERENCE") == 1){
                String albumName = extras.getString("ALBUM_NAME");
                String artistName = extras.getString("ARTIST_NAME");

                //TODO REMOVE THIS LOG
                Log.d("FROM ALBUMS", "Artist Name: " + artistName);
                Log.d("FROM ALBUMS", "Album Name: " + albumName);

                songsToPlay = new ArrayList<>();
                for(Song song : MainActivity.allSongs){
                    if (song.getAlbumName().equals(albumName) && song.getArtistName().equals(artistName)){
                        songsToPlay.add(song);
                    }
                }
                songsAdp = new SongAdapter(this, songsToPlay);
                lv.setAdapter(songsAdp);
            //from artists
            } else if (extras.getInt("REFERENCE") == 2){
                String artistName = extras.getString("ARTIST_NAME");

                //TODO REMOVE THIS LOG
                Log.d("FROM ARTISTS", "Artist Name: " + artistName);

                songsToPlay = new ArrayList<>();
                for(Song song : MainActivity.allSongs){
                    if (song.getArtistName().equals(artistName)){
                        songsToPlay.add(song);
                    }
                }
                songsAdp = new SongAdapter(this, songsToPlay);
                lv.setAdapter(songsAdp);
            }
        } else {
            //all songs, created from the mainactivity list
            songsAdp = new SongAdapter(this, MainActivity.allSongs);
            lv.setAdapter(songsAdp);
        }
    }
}
