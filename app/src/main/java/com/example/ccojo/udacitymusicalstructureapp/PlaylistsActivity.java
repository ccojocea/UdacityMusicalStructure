package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        LinearLayout linNewPlaylist = findViewById(R.id.new_playlist_layout);
        linNewPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlaylistsActivity.this, "Not implemented yet", Toast.LENGTH_SHORT).show();
            }
        });

        //Proof of concept playlists:
        ArrayList<Playlist> playlists = new ArrayList<>();
        playlists.add(new Playlist("Playlist one"));
        playlists.add(new Playlist("Playlist two"));
        playlists.add(new Playlist("Playlist three"));
        playlists.get(0).addSong(MainActivity.allSongs.get(0));
        playlists.get(0).addSong(MainActivity.allSongs.get(1));
        playlists.get(0).addSong(MainActivity.allSongs.get(2));
        playlists.get(0).addSong(MainActivity.allSongs.get(3));
        playlists.get(1).addSong(MainActivity.allSongs.get(4));
        playlists.get(1).addSong(MainActivity.allSongs.get(5));
        playlists.get(1).addSong(MainActivity.allSongs.get(6));
        playlists.get(2).addSong(MainActivity.allSongs.get(7));
        playlists.get(2).addSong(MainActivity.allSongs.get(8));

        PlaylistAdapter playadp = new PlaylistAdapter(this, playlists);
        ListView lv = findViewById(R.id.list_view);
        lv.setAdapter(playadp);
    }
}
