package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

                songsToPlay = new ArrayList<>();
                for(Song song : MainActivity.allSongs){
                    if (song.getArtistName().equals(artistName)){
                        songsToPlay.add(song);
                    }
                }
                songsAdp = new SongAdapter(this, songsToPlay);
                lv.setAdapter(songsAdp);
            //from playlists
            } else if (extras.getInt("REFERENCE") == 3){
                Playlist playlist = (Playlist) extras.getSerializable("PLAYLIST");
                songsAdp = new SongAdapter(this, playlist.getmSongsList());
                lv.setAdapter(songsAdp);
            }
        } else {
            //all songs, created from the mainactivity list
            songsAdp = new SongAdapter(this, MainActivity.allSongs);
            lv.setAdapter(songsAdp);
        }
    }
}
