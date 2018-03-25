package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ArrayList<Album> albums = new ArrayList<>();
        Set<Album> albumSet = new HashSet<>();
        for(Song song : MainActivity.allSongs){
            albumSet.add(new Album(song.getAlbumName(), song.getArtistName(), song.getSongAlbumArtId()));
        }
        for(Album album : albumSet){
            albums.add(album);
        }

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albums);
        GridView gv = findViewById(R.id.grid_view);
        gv.setAdapter(albumAdapter);
    }
}
