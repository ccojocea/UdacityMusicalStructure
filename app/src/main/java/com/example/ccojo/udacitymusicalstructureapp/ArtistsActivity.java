package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Gaia", R.drawable.gaia));
        artists.add(new Artist("Prodigy", R.drawable.prodigy));
        artists.add(new Artist("Andain", 0));
        artists.add(new Artist("Michael Jackson", 0));
        artists.add(new Artist("Hans Zimmer", 0));
        artists.add(new Artist("ATB", R.drawable.atb));
        artists.add(new Artist("Armin van Buuren", 0));
        artists.add(new Artist("Tiesto", 0));

        ArtistAdapter artistAdapter = new ArtistAdapter(this, artists);
        GridView gv = findViewById(R.id.grid_view);
        gv.setAdapter(artistAdapter);
    }
}
