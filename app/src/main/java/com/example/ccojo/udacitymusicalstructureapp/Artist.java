package com.example.ccojo.udacitymusicalstructureapp;

/**
 * Created by ccojo on 3/24/2018.
 */

public class Artist {
    private String artistName;
    private int artistArt;

    public Artist(String artistName, int artistArtId){
        this.artistName = artistName;
        if(artistArtId != 0){
            this.artistArt = artistArtId;
        } else {
            this.artistArt = R.drawable.smile;
        }
    }

    public String getArtistName() {
        return artistName;
    }

    public int getArtistArt() {
        return artistArt;
    }
}
